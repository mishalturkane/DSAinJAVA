
package projtopic.jdbc;
import java.sql.*;
public class JdbcEx2 {
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected successfully to the DB");
            Statement st=conn.createStatement();
            int ans=st.executeUpdate("delete from books where book_id=5");
            System.out.println("Rows affected :"+ans);
            
            
            conn.close();
            System.out.println("Disconnected with the DB");
        }catch(SQLException ex){
            System.out.println("DB error:"+ex.getMessage());
        }
    }
}
