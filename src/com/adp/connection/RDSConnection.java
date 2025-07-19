
package com.adp.connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RDSConnection {
    
     private static final String DATABSE = "aeropro_db";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "AirPort#123";
    private static Connection connection;
    
    public static Connection getConnection(){
        
        if(connection == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:mysql://airport-system.c7ioqcigsjos.eu-north-1.rds.amazonaws.com:3306/" + DATABSE,
                        USERNAME,
                        PASSWORD);
                
            } catch (ClassNotFoundException|SQLException e) {
                e.printStackTrace();
            }
        }
        
        return connection;
    }
    
    public static ResultSet execute(String query) throws SQLException {

        Statement smt = getConnection().createStatement();
        if (query.toUpperCase().startsWith("SELECT")) {
            return smt.executeQuery(query);
        } else {
            smt.executeUpdate(query);
            return null;
        }

    }
    
}
