/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blood_bank_management_system;
import java.sql.*;
/**
 *
 * @author hp
 */
public class ConnectionProvider {
    public static Connection getCon() 
    { 
        try { 
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root", "eshal"); 
            return con; 
        } catch (Exception e) 
        { 
            return null; 
        } 
    }
}
