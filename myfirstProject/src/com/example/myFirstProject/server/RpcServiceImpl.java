package com.example.myFirstProject.server;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.myFirstProject.client.RpcService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;


public class RpcServiceImpl extends RemoteServiceServlet implements
		RpcService {
	public Connection getConnection(){
		Connection conn     = null;
            String url          = "jdbc:mysql://192.168.12.81:3306/";
            String db           = "test";
            String driver       = "com.mysql.jdbc.Driver";
            String user         = "root";
            String pass         = "";
              
        try {
                Class.forName(driver).newInstance();
        } catch (InstantiationException e) {
                e.printStackTrace();
        } catch (IllegalAccessException e) {
                e.printStackTrace();
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        }
        try {
                      
                        conn = DriverManager.getConnection(db, user,pass);
        } catch (SQLException e) {
                        System.err.println("Mysql Connection Error: ");
                e.printStackTrace();
        }
            return conn;	
		
	}
	
	
}
