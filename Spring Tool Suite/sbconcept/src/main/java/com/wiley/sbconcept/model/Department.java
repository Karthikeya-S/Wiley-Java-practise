package com.wiley.sbconcept.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @SuppressWarnings("unused")
	private String departmentName;
    @SuppressWarnings("unused")
	private String departmentAddress;
    @SuppressWarnings("unused")
	private String departmentCode;
	public Object getDepartmentByName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getDepartmentAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDepartmentName(Object departmentByName) {
		// TODO Auto-generated method stub
		
	}
}
