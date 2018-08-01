package mar12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test4 
{
    public static void main(String[] args) 
    {
        try
        {
            //load database specific driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nayan", "root", "123456");
            
            //create query
            Statement st = con.createStatement();
            
            //executre query
            int x = st.executeUpdate("insert into student values(321, 'Nayan', 95, 1234560)");
            
            if(x>0)
                System.out.println("Data saved in DB");
            
            //close all connections
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}