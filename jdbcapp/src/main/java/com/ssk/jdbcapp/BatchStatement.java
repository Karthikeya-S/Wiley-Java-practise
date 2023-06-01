package com.ssk.jdbcapp;
import java.sql.*;
public class BatchStatement {
	public static void Batch() throws SQLException {
		String query = "insert  into `orders`(`orderNumber`,`orderDate`,`requiredDate`,`shippedDate`,`status`,`comments`,`customerNumber`) values (12345,'2023-05-24','2023-05-30','2023-05-27','Shipped',NULL,363)";
		Connection conn = null;
//		ResultSet rs = null;
		try {
			newDBConnection dbcon = new newDBConnection();
			conn = dbcon.createnewDBConnection();
			Statement stmt = conn.createStatement();
			conn.setAutoCommit(false);
			stmt.addBatch(query);
			stmt.executeBatch();
			conn.commit();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) throws SQLException {
		Batch();
	}
}
