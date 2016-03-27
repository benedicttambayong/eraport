package eraport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class database 
{
    public Connection conn= null;
    public String username;
    public Statement statement = null;
    public ResultSet rs= null; 
    
    public database()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }  
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,""+ e.getMessage(),"JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
        }
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/eraport","root","");
            statement = conn.createStatement();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,""+ e.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }
    }    
        
     public ResultSet getdata(String SQLString)
     {
         try
         {
             rs = statement.executeQuery(SQLString);
         }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error"+ e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
         return rs;
     }
     public void query(String SQLString)
     {
         try
         {
             statement.executeUpdate(SQLString);
         }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"error"+ e.getMessage(),"JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
        }
     }
  
}
