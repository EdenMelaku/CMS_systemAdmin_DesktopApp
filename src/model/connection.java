/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author Bit
 */
public class connection {
    static Connection con =null;
    public static Connection connectDB() {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
           con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "roba");
//            String sql = "drop table student";
//            PreparedStatement pst = con.prepareStatement(sql);
//            pst.execute();
           // System.out.println("sucess ");
           
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;

    }
    
    
    public static void main(String ...args ){
        
        connection.connectDB();
        
        
        
    }
}
