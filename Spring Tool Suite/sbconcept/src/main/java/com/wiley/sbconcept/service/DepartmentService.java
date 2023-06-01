package com.wiley.sbconcept.service;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Department;

import java.util.List;

public interface DepartmentService {
    public Department createDepartment(Department department);
    public Department saveDepartment(Department department);
    public List<Department> getDepartmentsList();
    public Department getDepartmentById(Long departmentId) throws DepNotFoundException;
    public Department getDepartmentByName(String departmentName);
    public void deleteDepartmentById(Long departmentId) throws DepNotFoundException;
    public Department updateDepartment(Department departmentId, Department department);
	Department getDepByName(String name);
	void delDepartment(Long departmentId);
	Department updateDepartment(Long departmentId, Department dep);
}
