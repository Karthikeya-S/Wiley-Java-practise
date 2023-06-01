package com.wiley.sbconcept.controller;
import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.service.DepartmentService;
import com.wiley.sbconcept.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@SuppressWarnings("unused")
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService depService;
    @GetMapping("/departments") //mapping for GET request
    public List<Department> getAllDepartments(){
        return depService.getDepartmentsList();
    }
    //mapping for POST request
    @PostMapping("/departments")
    public Department createDepartment(@RequestBody Department department){
        return depService.createDepartment(department);
    }
    //mapping for GET request with specific id
    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) throws DepNotFoundException {
        return depService.getDepartmentById(departmentId);
    }
    @GetMapping("/deps/name/{name}")
    public Department getDepByName(@PathVariable("name")String depName) {
    	return depService.getDepartmentByName(depName);
    }
    @PutMapping("/deps/{id}")
    public Department updateDepartment(
    		@PathVariable("id") Long depId,
    		@RequestBody Department dep) {
    	return depService.updateDepartment(depId, dep);
    }
}