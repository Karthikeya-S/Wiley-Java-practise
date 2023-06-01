package com.wiley.sbconcept.service;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepo depRepo;
    @Override
    public Department createDepartment(Department department) {
        return depRepo.save(department);
    }

    @Override
    public Department saveDepartment(Department department) {
        return null;
    }

    @Override
    public List<Department> getDepartmentsList() {
        return depRepo.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId) throws DepNotFoundException{
        Optional<Department> dep = depRepo.findById(departmentId);
        if(!dep.isPresent()) {
        	throw new DepNotFoundException("Wiley Department Not Available with the ID you are search for");
        }
        return dep.get();
    }


    @Override
    public Department getDepartmentByName(String departmentName) {
        return null;
    }

    @Override
    public void deleteDepartmentById(Long departmentId) throws DepNotFoundException {
    	@SuppressWarnings("unused")
		Optional<Department> dep = depRepo.findById(departmentId);
    }

    @Override
    public Department updateDepartment(Department departmentId, Department department) {
        return null;
    }
    
    @Override
    public void delDepartment(Long departmentId) {
    	depRepo.deleteById(departmentId);
    }
    
    @Override
    public Department getDepByName(String name) {
    	depRepo.findByDepartmentname(name);
    	return depRepo.save(null);
    }
    
    @Override
    public Department updateDepartment(Long departmentId, Department dep) {
    	Department depFromDB = depRepo.findById(departmentId).get();
    	if(Objects.nonNull(dep.getDepartmentByName()) && !"".equalsIgnoreCase(dep.getDepartmentAddress())){
    		depFromDB.setDepartmentName(dep.getDepartmentByName());
    	}
    	return depRepo.save(null);
    }
}
