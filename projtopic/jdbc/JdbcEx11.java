package projtopic.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcEx11 {
    public static void main(String[] args) {
        Connection conn=null;
        boolean status=true;
        try{
            conn= DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connection sucesfull to DB");
            PreparedStatement ps=conn.prepareStatement("insert into books values (?,?,?)");
            conn.setAutoCommit(false);
            Scanner kb=new Scanner(System.in);
            String choice="";
            do{

                System.out.println("Enter book id:");
                int id=kb.nextInt();

                System.out.println("Enter book name:");
                kb.nextLine(); //checking fro buffer
                String name=kb.nextLine();

                System.out.println("Enter book price:");
                int price=kb.nextInt();

                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setInt(3,price);

                System.out.println("Any more(yes/no)");
                choice=kb.next();



            }while(choice.equalsIgnoreCase("yes"));


        int [] ans=ps.executeBatch();
            for(int i=0;i<ans.length;i++){
                System.out.println("Quary: "+(i+1)+" Affected: "+ans[i]+" Rows");
            }


        }
        catch(BatchUpdateException ex){
            int []result=ex.getUpdateCounts();
            System.out.println("Query no "+(result.length+1)+" generated exception");
            status=false;
        }    catch (SQLException e) {

            System.out.println("DB Error is;"+e.getMessage());
            status=false;
        }
        finally {
            try{
                if(conn!=null){
                    if(status==true){
                        conn.commit();
                        System.out.println("Queries executed and commited");

                    }
                    else {
                        conn.rollback();
                        System.out.println("Queries RolledBack:");
                        System.out.println("Discunected with DB");
                    }
                    conn.close();
                }
            }catch(SQLException ex){
                System.out.println("Error in DB "+ex.getMessage());
            }
        }
    }
}
