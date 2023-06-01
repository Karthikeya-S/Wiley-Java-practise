package com.ssk.jdbcapp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewApp {
	
	public void addOrders() {
		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
		try {
			conn = newDBConnection.createnewDBConnection();
			conn.setAutoCommit(false);
			String insertQuery = "INSERT INTO orders(orderNumber, orderDate,requiredDate,shippedDate,status,customerNumber) VALUES (?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(insertQuery);
			ps.setInt(1, 10429);
			ps.setDate(2, Date.valueOf("2023-05-22"));
			ps.setDate(3, Date.valueOf("2023-05-23"));
			ps.setDate(4, Date.valueOf("2023-05-22"));
			ps.setString(5, "In process");
			ps.setInt(6, 145);
			ps.executeUpdate();
			String sqlOrderDetails = "INSERT INTO orderdetails(orderNumber,productCode,quantityOrdered,priceEach,orderLineNumber) VALUES (?,?,?,?,?)";
			ps1 = conn.prepareStatement(sqlOrderDetails);
			ps1.setInt(1, 10429);
			ps1.setString(2, "S18_1749");
			ps1.setInt(3, 30);
			ps1.setDouble(4,136);
			ps1.setInt(5, 1);
			ps1.executeUpdate();
			conn.commit();
			conn.rollback();
			conn.setAutoCommit(true);
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void display() {
		Connection conn = newDBConnection.createnewDBConnection();
		String query = "SELECT * FROM orders where orderNumber = 10429";
		try {
			Statement stmt = conn.createStatement();
			System.out.println("Executing query...");
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\t%d", rs.getInt(1),rs.getDate(2),rs.getDate(3),rs.getDate(4),rs.getString(5),rs.getShort(6));
				System.out.println();
				System.out.println("------------------------------------------------");
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public static void main(String[] args) throws SQLException {
		NewApp nw = new NewApp();
		nw.addOrders();
		nw.display();
	}
}