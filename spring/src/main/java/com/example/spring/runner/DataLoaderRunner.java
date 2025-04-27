package com.example.spring.runner;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring.entity.Department;
import com.example.spring.entity.Employee;
import com.example.spring.repository.DepartmentRepository;
import com.example.spring.repository.EmployeeRepository;

@Component
public class DataLoaderRunner implements CommandLineRunner {
	
	private final DepartmentRepository departmentRepository;
	private final EmployeeRepository employeeRepository;
	
	public DataLoaderRunner(DepartmentRepository departmentRepository,EmployeeRepository employeeRepository) {
		this.departmentRepository=departmentRepository;
		this.employeeRepository=employeeRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Department department = new Department("IT","New York");
		department.addEmployee(new Employee("Alice","Developer"));
		department.addEmployee(new Employee("Bob","Tester"));
		
		departmentRepository.save(department);
		System.out.println("Department and employees saved.");
		
		Long departmentId=department.getId();
		List<Employee>employees=employeeRepository.findByDepartment_Id(departmentId);
		System.out.println("Employees in Department ID"+departmentId+":");
		for(Employee e:employees) {
			System.out.println("- "+e.getName()+"("+e.getDesignation()+")");
			
		}
		Department existingDepartment=departmentRepository.findById(departmentId).orElseThrow();
		Employee newEmployee = new Employee("Charlie","Business Analyst");
		existingDepartment.addEmployee(newEmployee);
		departmentRepository.save(existingDepartment);
		System.out.println("Added a new employee to department.");
		
		employees=employeeRepository.findByDepartment_Id(departmentId);
		System.out.println("Updated Employees list:");
		for(Employee e:employees) {
			System.out.println("- "+e.getName()+"("+e.getDesignation()+")");
		}
	}

}
