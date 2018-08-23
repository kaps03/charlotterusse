package com.healthcheck.charlotterusse_project.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static ConnectionUtility connectionUtility;
	private static Connection connection;
	private DBConnection() {
	}
	
	public static Connection getConnection() {
		try {
			if(connection == null) {
				Class.forName(ConnectionUtility.DRIVER_NAME);
				connection = DriverManager.getConnection(ConnectionUtility.URL , ConnectionUtility.USERNAME, ConnectionUtility.PASSWORD);				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
		
	} 
}
