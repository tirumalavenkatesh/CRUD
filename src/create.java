import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;

public class create {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","manikanta@07");
            // System.out.println("Connection successful");
            Statement st=con.createStatement();
           // String sql="UPDATE students set name='saaho' where id=5";
            String sql="create table mani(id int PRIMARY KEY ,name varchar(50),marks int)";
            PreparedStatement ps= con.prepareStatement(sql);
           int row=ps.executeUpdate();
           if(row>0)
              System.out.println("Updated successfully");
          /*  ResultSet rs=st.executeQuery("Select *from students");
            while(rs.next())
            {
                System.out.println(rs.getInt("id")+"|"+rs.getString("name")+"|"+rs.getInt("age")+"|"+rs.getString("course"));
            }*/
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
