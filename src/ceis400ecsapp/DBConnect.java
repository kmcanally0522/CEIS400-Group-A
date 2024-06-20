/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis400ecsapp;
import java.sql.*;
/**
 *
 * @author kmcan
 */
public class DBConnect {
    
    Connection con = null;
    
    public static Connection DBConnect(){
        try{
            //connection
            //Class.forName("com.mysql.jdbc.Driver");
            //String url = "jdbc:squlserver://localhost;databaseName=CEIS400_ECS;user=newuser;password=login";
            //drive manager
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/CEIS400_ECS","newuser","login");
            
            return con;
        }

        catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
