/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp.reservation;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author SHADOWRATH
 */
public class DBConnection {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root1998";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/hotel_management";
    
    public static Connection getDbConnection(){
    
    
    Connection conn = null;
    
    
    
        try{
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("SUCCESS!!!!");
             return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("failure");
            return null;
            
        }
        
       
    }
    }
    

