/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author deyto
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","root","12345678");
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }        
    }
    public Connection getConnection(){
        return con;
    }
  }

