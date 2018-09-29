/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MyPC
 */
public class ConnectionHandle {

    private Connection connection;
    private static ConnectionHandle connectionHandle;

    public static ConnectionHandle getInstance() {
        if (connectionHandle == null) {
            connectionHandle = new ConnectionHandle();
        }
        return connectionHandle;
    }
    
    public Connection getConnection() throws SQLException{
        if(connection == null || connection.isClosed()){
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manager?useUnicode=true&characterEncoding=utf-8", "root", "");
        }
        return connection;
    }
    
    public void closeConnection() throws SQLException{
        if(connection != null || !connection.isClosed()){
            connection.close();
        }
    }
}
