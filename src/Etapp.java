/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.sql.*;

/**
 *
 * @author Sara Mariam Raju
 */
public class Etapp {
   static Connection con;
    
   static Connection getConnection() {
       
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/etapp?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
       }
      catch (Exception e)
      {}
       return con;
   }

    private static class connection {

        public connection() {
        }
    }
   }