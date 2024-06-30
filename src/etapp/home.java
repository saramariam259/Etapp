/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etapp;
import java.sql.*;
/**
 *
 * @author Sara Mariam Raju
 */
public class home {
    
    static Connection con;
        public static Connection getConnection()
        {
            try
            {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/etapp?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            }
            catch (ClassNotFoundException | SQLException e)
            {
            System.out.println(e);
        }
        
            return con;
    
}
}