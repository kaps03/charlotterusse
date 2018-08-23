package com.healthcheck.charlotterusse_project.utility;

public class ConnectionUtility {

	private ConnectionUtility() {
	}

	public static final String DRIVER_NAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String URL = "jdbc:sqlserver://NODE751\\SQL2012;databaseName=LEDBoard";
	public static final String USERNAME = "sa";
	public static final String PASSWORD = "root";
	
}
