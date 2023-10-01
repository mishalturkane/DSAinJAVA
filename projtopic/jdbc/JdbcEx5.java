package projtopic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcEx5 {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        try{
             conn= DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected to The DB");


            Scanner kb=new Scanner(System.in);


                   System.out.println("Enter the  Book id for updating data");
                   int id= kb.nextInt();

                   System.out.println("Enter new name:");
                   kb.nextLine();
                   String name=kb.nextLine();
                   PreparedStatement ps=conn.prepareStatement("update books set book_name=?  where book_id=?");

                   ps.setString(1,name);
                   ps.setInt(2,id);

                   int ans=ps.executeUpdate();
                   System.out.println("Row Affected:"+ans);



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
