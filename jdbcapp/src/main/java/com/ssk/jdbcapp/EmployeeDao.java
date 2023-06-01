package com.ssk.jdbcapp;

public interface EmployeeDao {
//	Create Employee
	public void CreateEmployee(Employee emp);
//	Show All Employees
	public void GetAllEmployees();
//	Show Employee based on ID
	public void GetEmpById(int id);
//	Update Employee 
	public void UpdateEmpNameById(int id,String name);
//	Delete Employee
	public void DeleteEmpById(int id);
//	Search Employee Details By Name
	public void SearchByName(String name);
//	Sort Based on Salary (ASC/DSC)
	public void sortSalary(String cond);
}