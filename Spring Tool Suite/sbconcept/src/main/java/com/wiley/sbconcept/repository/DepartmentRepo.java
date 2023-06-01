package com.wiley.sbconcept.repository;

import com.wiley.sbconcept.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
	public Department findByDepartmentname(String departmentName);
}
