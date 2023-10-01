package projtopic.jdbc;

import java.sql.*;

public class JdbcEx10 {
    public static void main(String[] args) {
        Connection conn=null;
        boolean status=true;
        try{
            conn= DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connection sucesfull to DB");

            Statement st=conn.createStatement();
            conn.setAutoCommit(false);

           st.addBatch("insert into books values(106,'Love')");
            st.addBatch("update books set   m_name='RRR' where m_id=103");
            int []ans=st.executeBatch();

            for(int i=0;i<ans.length;i++){
                System.out.println("Quary: "+(i+1)+" Affected: "+ans[i]+" Rows");
            }

        } catch (SQLException e) {

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
