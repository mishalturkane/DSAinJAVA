package projtopic.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JdbcEx4 {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        try{
             conn= DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected to The DB");


            Scanner kb=new Scanner(System.in);
            System.out.println("Enter book id:");
            int id=kb.nextInt();

            System.out.println("Enter book name");
            kb.nextLine();
            String name=kb.nextLine();

            System.out.println("Enter book price");
            int price=kb.nextInt();

            PreparedStatement ps=conn.prepareStatement("insert into books values (?,?,?)");

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3,price);

            ps.executeUpdate();


        }catch(SQLException ex){
            System.out.println("Error in DB"+ex.getMessage());
        }
        finally{
            try{
                if(conn!=null){
                    conn.close();
                    System.out.println("Discunnected with the DB:");
                }
            }catch(SQLException ex){
                System.out.println("Error in closing the connection :"+ex.getMessage());
            }
        }
    }
}
