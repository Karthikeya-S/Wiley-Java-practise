package com.ssk.jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.Date;

import com.mysql.cj.protocol.Resultset;
public class App {
	public static void addCandidate(String first_name, String last_name, Date dob, String email, String phone,
			int skills[]) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement psSkills = null;
		Resultset rs = null;
		try {
			DBConnection dbcon = new DBConnection();
			conn = dbcon.createDBConnection();
//			JDBC Transactions 
			conn.setAutoCommit(false); //Disable autocommit
			String sqlinsert = "INSERT INTO candidates(first_name,last_name, dob, email, phone) VALUES (?,?,?,?,?)";
			ps = conn.prepareStatement(sqlinsert, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, first_name);
			ps.setString(2, last_name);
			ps.setDate(3, dob);
			ps.setString(4, email);
			ps.setString(5, phone);
			int rowAffected = ps.executeUpdate();
			rs = (Resultset) ps.getGeneratedKeys();
			System.out.println("Generated Keys: "+ rs);
			int candidateId = 0;
			if(((ResultSet) rs).next()) {
				candidateId = ((ResultSet) rs).getInt(1);
			}
			System.out.println("Candidate ID: "+candidateId);
			
			if(rowAffected == 1) {
				String sqlSkillInsert = "INSERT INTO candidate_skills(candidate_id, skill_id) VALUES (?,?)";
				psSkills = conn.prepareStatement(sqlSkillInsert);
				for(int skillId: skills) {
					psSkills.setInt(1, candidateId);
					psSkills.setInt(2, skillId);
					
					ps.executeUpdate();
				}
				conn.commit();
			}else {
				System.out.println("Rollback Done");
				conn.rollback();
			}
		} catch (Exception e) {
			try {
				if(conn!= null) {
					conn.rollback();
				}
			}catch(SQLException e2) {
				System.out.println(e2.getMessage());
			}
		} finally {
			try {
				if(rs != null) ((ResultSet) rs).close();
				if(ps != null) ps.close();
				if(psSkills != null) psSkills.close();
				if(conn != null) conn.close();
			} catch (SQLException e3) {
				System.out.println(e3.getMessage());
			}
		}
	}
	public static void main(String[] args) throws SQLException {
		int[] skills = {1,2,3};
		addCandidate("SSK","B",Date.valueOf("2001-05-21"),"karthikeya@gmail.com","9677043146",skills);
	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		EmployeeDaoImpl edi = new EmployeeDaoImpl();
//		System.out.println("\t\tWELCOME TO WILEY EMPLOYEE MANAGEMENT\n\n\n");
//		boolean exit = false;
//		while(!exit) {
//			System.out.println("1. CREATE EMPLOYEE\n");
//			System.out.println("2. DISPLAY ALL EMPLOYEES DETAILS\n");
//			System.out.println("3. DISPLAY EMPLOYEE BY ID\n");
//			System.out.println("4. UPDATE EMPLOYEE DETAILS\n");
//			System.out.println("5. DELETE EMPLOYEE DETAILS\n");
//			System.out.println("6. SEARCH EMPLOYEE\n");
//			System.out.println("7. SORT EMPLOYEE USING SALARY\n");
//			System.out.println("8. EXIT\n\n");
//			System.out.println("ENTER YOUR CHOICE: ");
//			int n = sc.nextInt();
//			switch(n) {
//			case 1:
//				System.out.println("Enter ID: ");
//				int id = sc.nextInt();
//				System.out.println("Enter Name: ");
//				String name = sc.next();
//				System.out.println("Enter Salary: ");
//				double sal = sc.nextDouble();
//				System.out.println("Enter Age: ");
//				int age = sc.nextInt();
//				Employee emp = new Employee(id,name,sal,age);
//				edi.CreateEmployee(emp);
//				break;
//			case 2:
//				edi.GetAllEmployees();
//				break;
//			case 3:
//				System.out.println("Enter Employee Number: ");
//				int empNo = sc.nextInt();
//				edi.GetEmpById(empNo);
//				break;
//			case 4:
//				System.out.println("Enter Employee number: ");
//				int number = sc.nextInt();
//				System.out.println("Enter the name you want to update: ");
//				String newName = sc.next();
//				edi.UpdateEmpNameById(number, newName);
//				break;
//			case 5:
//				System.out.println("Enter employee ID you want to delete: ");
//				int empID = sc.nextInt();
//				edi.DeleteEmpById(empID);
//				break;
//			case 6:
//				System.out.println("Enter the employee name you want to Search: ");
//				String empname = sc.next();
//				edi.SearchByName(empname);
//				break;
//			case 7:
//				System.out.println("How do you want to sort ? (Ascending - 'ASC' / Descending - 'DESC'):  ");
//				String cond = sc.next();
//				edi.sortSalary(cond);
//				break;
//			case 8:
//				exit = true;
//				System.out.println("\t\tThank you VISIT AGAIN! ");
//				break;
//			default:
//				System.out.println("Invalid Operation. Retry..!");
//				break;
//			}
//		}
//		sc.close();
//	}
}


// Search by empName (like)