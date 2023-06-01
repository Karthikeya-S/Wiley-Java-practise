package com.wiley.springcore;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Student {
	private int studentId;
	private String studentName;
	private String Address;
	private List<String> skills;
	private Set<String> Add;
	private Map<String, String> maps;
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String address, List<String> skills, Set<String> add,
			Map<String, String> maps) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		Address = address;
		this.skills = skills;
		Add = add;
		this.maps = maps;
	}
	public Set<String> getAdd() {
		return Add;
	}
	public void setAdd(Set<String> add) {
		Add = add;
	}
	public Map<String, String> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", Address=" + Address + ", skills="
				+ skills + ", Add=" + Add + ", maps=" + maps + "]";
	}
}