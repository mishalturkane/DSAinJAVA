
package projtopic.jdbc;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JdbcEx7 {
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected Successfully to the DB");

            PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?,?)");

            Scanner kb=new Scanner(System.in);
            System.out.println("Enter the id:");
            int id=kb.nextInt();

            System.out.println("Enter the name:");
            kb.nextLine();
            String name=kb.nextLine();

            System.out.println("Enter the dob(dd/mm/yyyy) :");
            String hdateStr=kb.next();

            System.out.println("Enter the job role:");
            String job=kb.next();

            System.out.println("Enter the Slary");
            double salary=kb.nextDouble();

            SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

            java.util.Date d1=sdf.parse(hdateStr);

             long ms=d1.getTime();

            java.sql.Date d2=new java.sql.Date(ms);

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setDate(3,d2);
            ps.setString(4,job);
            ps.setDouble(5,salary);

            int ans=ps.executeUpdate();
            System.out.println("Row affected:"+ans);

            conn.close();
            System.out.println("Disconnected with the DB");
        }catch(SQLException ex){
            System.out.println("DB error:"+ex.getMessage());
        }catch(ParseException ex){
            System.out.println("Error in converting date");
        }
    }
}
