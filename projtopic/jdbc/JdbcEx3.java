package projtopic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx3 {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        try{
             conn= DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected to The DB");
            Statement st=conn.createStatement();

            Scanner kb=new Scanner(System.in);
            System.out.println("Enter book id:");
            int id=kb.nextInt();

            System.out.println("Enter book name");
            kb.nextLine();
            String name=kb.nextLine();

            System.out.println("Enter book price");

            int price=kb.nextInt();

            int ans=st.executeUpdate("insert into books values("+id+",'"+name+"',"+price+")");
            System.out.println("Rows affected:"+ans);
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
