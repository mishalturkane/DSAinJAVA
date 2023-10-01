
package projtopic.jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class JdbcEx9Advance {
    public static void main(String[] args) {
        Connection conn=null;
        try{
             conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected Successfully to the DB");
            Statement st=conn.createStatement();
            File mydir=new File("d:/jdbcimages");
            mydir.mkdir();
            ResultSet rs=st.executeQuery("select * from movies");
            while(rs.next()){
                String name=rs.getString(1);
                Blob obj=rs.getBlob(2);
                byte [] arr=obj.getBytes(1,(int)obj.length());
                FileOutputStream fout=new FileOutputStream(mydir.getAbsolutePath()+"/"+name);
                fout.write(arr);
                System.out.println("image saved:"+name);
                fout.close();
            }

        }catch(SQLException ex){
            System.out.println("DB error:"+ex.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                if(conn!=null){
                    conn.close();
                    System.out.println("Disconected with DB");
                }
            }catch(SQLException ex){

                System.out.println("Error in Discunection");
            }
        }
    }
}
