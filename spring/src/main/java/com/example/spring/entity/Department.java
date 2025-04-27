package com.example.spring.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	private String name;
	private String location;
	@OneToMany(fetch=FetchType.EAGER,mappedBy="department", cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Employee>employees=new ArrayList<>();
	public Department() {
		
	}
	public Department(String name,String location) {
		this.name=name;
		this.location=location;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public List<Employee>getEmployees(){
		return employees;
	}
	public void addEmployee(Employee employee) {
		employees.add(employee);
		employee.setDepartment(this);
	}
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
		employee.setDepartment(null);
	}
	
}
