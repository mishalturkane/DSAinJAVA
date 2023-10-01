package projtopic.jdbc;

import java.sql.*;

public class JdbcEx10Advance {
    public static void main(String[] args) {
        Connection conn=null;
        boolean status=true;
        try{
            conn= DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connection sucesfull to DB");

            Statement st=conn.createStatement();
            conn.setAutoCommit(false);


             st.addBatch("update books set book_price=book_price+100 where book_price=900");
            int []ans=st.executeBatch();

            for(int i=0;i<ans.length;i++){
                System.out.println("Quary: "+(i+1)+" Affected: "+ans[i]+" Rows");
            }


        }
        catch(BatchUpdateException ex){
            int []result=ex.getUpdateCounts();
            System.out.println("Query no "+(result.length+1)+" generated exception");
            status=false;
        }    catch (SQLException e) {

            System.out.println("DB Error is;"+e.getMessage());
            status=false;
        }
        finally {
            try{
                if(conn!=null){
                    if(status==true){
                        conn.commit();
                        System.out.println("Queries executed and commited");

                    }
                    else {
                        conn.rollback();
                        System.out.println("Queries RolledBack:");
                        System.out.println("Discunected with DB");
                    }
                    conn.close();
                }
            }catch(SQLException ex){
                System.out.println("Error in DB "+ex.getMessage());
            }
        }
    }
}
