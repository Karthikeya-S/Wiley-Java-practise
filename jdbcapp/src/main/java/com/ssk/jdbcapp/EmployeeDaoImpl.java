package com.ssk.jdbcapp;
import java.sql.*;

// Dao - Data Access Object
public class EmployeeDaoImpl implements EmployeeDao{
	Connection conn;
//	conn = DBConnection.createDBConnection();
	public void CreateEmployee(Employee emp) {
		conn = DBConnection.createDBConnection();
		String query = "INSERT INTO employee VALUES (?,?,?,?)";
		
		try {
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, emp.getId());
			pstm.setString(2, emp.getName());
			pstm.setDouble(3, emp.getSalary());
			pstm.setInt(4, emp.getAge());
			int count = pstm.executeUpdate();
			if(count!=0) {
				System.err.println("Employee Inserted Successfully...!");
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void GetAllEmployees() {
		conn = DBConnection.createDBConnection();
		String query = "SELECT * FROM employee";
		System.out.println("------------------------------------------------");
		System.out.printf("%s\t%s\t\t%s\t\t%s","ID","NAME","SALARY","AGE");
		System.out.println();
		System.out.println("------------------------------------------------");
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.printf("%d\t%s\t%.2f\t%d", rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				System.out.println();
				System.out.println("------------------------------------------------");
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void GetEmpById(int id) {
		conn = DBConnection.createDBConnection();
		String query = "SElECT * FROM employee where id = "+id;
		System.out.println("------------------------------------------------");
		System.out.printf("%s\t%s\t\t%s\t\t%s","ID","NAME","SALARY","AGE");
		System.out.println();
		System.out.println("------------------------------------------------");
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.printf("%d\t%s\t%.2f\t%d", rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				System.out.println();
				System.out.println("------------------------------------------------");
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void UpdateEmpNameById(int id, String name) {
		conn = DBConnection.createDBConnection();
		String query = "UPDATE employee SET name = ? where id = ?";
		try {
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,name);
			pst.setInt(2, id);
			int count = pst.executeUpdate();
			if(count!=0) {
				System.out.println("Employee Details Updated Successfully");
			}
		} catch(Exception e) {
			e.getMessage();
		}
		
	}
	public void DeleteEmpById(int id) {
		conn = DBConnection.createDBConnection();
		String query = "DELETE FROM employee where id = ?";
		try {
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1,id);
			int count = pst.executeUpdate();
			if(count!=0) {
				System.out.println("Employee Details Deleted Successfully");
			}
		} catch(Exception e) {
			e.getMessage();
		}
	}
	public void SearchByName(String name) {
		conn = DBConnection.createDBConnection();
		String query = "SElECT * FROM employee where name LIKE '"+name+"%' ";
		System.out.println("------------------------------------------------");
		System.out.printf("%s\t%s\t\t%s\t\t%s","ID","NAME","SALARY","AGE");
		System.out.println();
		System.out.println("------------------------------------------------");
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.printf("%d\t%s\t%.2f\t%d", rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				System.out.println();
				System.out.println("------------------------------------------------");
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void sortSalary(String cond) {
		conn = DBConnection.createDBConnection();
		String query = "SELECT * FROM employee ORDER BY salary "+cond;
		System.out.println("------------------------------------------------");
		System.out.printf("%s\t%s\t\t%s\t\t%s","ID","NAME","SALARY","AGE");
		System.out.println();
		System.out.println("------------------------------------------------");
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.printf("%d\t%s\t%.2f\t%d", rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				System.out.println();
				System.out.println("------------------------------------------------");
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
}