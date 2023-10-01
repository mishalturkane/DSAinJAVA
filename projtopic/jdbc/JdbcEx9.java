
package projtopic.jdbc;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class JdbcEx9 {
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
                String name=rs.getString(1)+".png";
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
