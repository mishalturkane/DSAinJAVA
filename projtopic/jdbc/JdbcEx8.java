
package projtopic.jdbc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JdbcEx8 {
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected Successfully to the DB");

            PreparedStatement ps=conn.prepareStatement("insert into movies values(?,?)");

            Scanner kb=new Scanner(System.in);
            System.out.println("Enter the movie path:");
            String imgPath=kb.nextLine();

            int lastFwdPos=imgPath.lastIndexOf("/");
            int lastDotPos=imgPath.lastIndexOf(".");

            String movName=imgPath.substring(lastFwdPos+1,lastDotPos);

            ps.setString(1,movName);

            File f=new File(imgPath);

            InputStream fin=new FileInputStream(imgPath);
            ps.setBinaryStream(2,fin,(int)f.length());



            int ans=ps.executeUpdate();
            System.out.println("Row affected:"+ans);

            conn.close();
            System.out.println("Disconnected with the DB");
        }catch(SQLException ex){
            System.out.println("DB error:"+ex.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File error:"+e.getMessage());
        }
    }
}
