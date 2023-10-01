
package projtopic.jdbc;
import java.sql.*;
import java.text.SimpleDateFormat;

public class JdbcEx6Advance {
    public static void main(String[] args) {
        Connection conn=null;
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected Successfully to the DB");

            Statement st=conn.createStatement();

            ResultSet rs=st.executeQuery("select ename,dob  from employee");

            SimpleDateFormat  sdf=new SimpleDateFormat("dd/MMM/yyyy");

            while(rs.next()){
              String name=rs.getString(1);
              Date hdate=rs.getDate(2);
              String dateStr=sdf.format(hdate);
                System.out.println(name+"\t"+dateStr);
            }

        }catch(SQLException ex){
            System.out.println("DB error:"+ex.getMessage());
        }
        finally {
           try{
               if(conn!=null){
                   conn.close();
                   System.out.println("Disconnected with the DB");
               }
           }catch( SQLException ex){
               System.out.println("Error in Dicscpnecting with DB");
           }
        }
    }
}
