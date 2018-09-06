package com.healthcheck.charlotterusse_project.utility;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	private static Connection connection;

	private DBConnection() {
	}

	public static Connection getConnection() {
		try {
			if (connection == null) {
				FileReader reader = new FileReader("db.properties");
				Properties properties = new Properties();
				properties.load(reader);
				Class.forName(properties.getProperty("sqlserver_driver_name"));
				connection = DriverManager.getConnection(properties.getProperty("sqlserver_url"),
						properties.getProperty("sqlserver_username"), properties.getProperty("sqlserver_password"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException exception) {

		}

		return connection;

	}
}
