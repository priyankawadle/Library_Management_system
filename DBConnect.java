/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class DBConnect {
    
    public static Connection connect()
    {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library?","root","");
            JOptionPane.showMessageDialog(null,"connection success");
            
            
        } catch(Exception e){
      JOptionPane.showMessageDialog(null,e);
        }
        return con;
    }
}