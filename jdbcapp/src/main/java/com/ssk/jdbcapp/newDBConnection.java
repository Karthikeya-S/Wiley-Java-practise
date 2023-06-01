package com.ssk.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
public class newDBConnection {
	static Connection conn;

	public static Connection createnewDBConnection() {
		try {
//			String driver = "com.mysql.cj.jdbc.Driver";
//			Class.forName(driver);
			// connection string
			String url = "jdbc:mysql://localhost:3306/wileyclassic";
			String username = "root";
			String password = "Karthik1*";

			conn = DriverManager.getConnection(url, username, password);

			System.out.println("Connection Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}