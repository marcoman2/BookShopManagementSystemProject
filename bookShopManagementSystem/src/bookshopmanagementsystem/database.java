/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @Author     : MarcoMan
    Support and Subscribe our channel: https://www.youtube.com/channel/UCPgcmw0LXToDn49akUEJBkQ
 */
public class database {
    
    public static Connection connectDb(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/book", "root", ""); // address, database username, database password
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null; // LETS MAKE OUR DATABASE  : ) book is our database name : ) 
    }
    
}
