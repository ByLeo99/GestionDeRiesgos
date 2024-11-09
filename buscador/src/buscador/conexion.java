/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscador;

import java.sql.*;

/**
 *
 * @author User
 */
public class conexion {
    Connection con;
    public conexion(){
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pedidos","root","a1234");
        System.out.println(" hay conexion");
    }catch(Exception e){
      
     System.out.println("no hay conexion"+e);
    
    }
    
    }
    public Connection getConexion(){
    return con;
    
    }
    
}
