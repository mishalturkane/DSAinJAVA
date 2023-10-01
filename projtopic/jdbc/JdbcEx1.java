
package projtopic.jdbc;
import java.sql.*;
public class JdbcEx1 {
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected Successfully to the DB");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from myMissu ");
            while(rs.next()){
                int bookId=rs.getInt(1);
                String bookName=rs.getString(2);
                int bookPrice=rs.getInt(3);
                System.out.println(bookId+"\t"+bookName+"\t"+bookPrice);
            }
            conn.close();
            System.out.println("Disconnected with the DB");
        }catch(SQLException ex){
            System.out.println("DB error:"+ex.getMessage());
        }
    }
}
