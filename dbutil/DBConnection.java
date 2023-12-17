/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevani.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class DBConnection {
    private static Connection conn;
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver loaded successfully");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            System.exit(0);
        }
        try{
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-1R6DKBOV:1521/xe", "sanjeevani", "sanjeevani");
            System.out.println("Connection open successfully");
        }
        catch(SQLException ex){
            ex.printStackTrace();
            System.exit(0);
        }
    }
    
    public static Connection getConnection(){
        return conn;
    }
    
    public static void closeConnection(){
        if(conn!=null){
            try{
                conn.close();
                System.out.println("Connection closed");
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
