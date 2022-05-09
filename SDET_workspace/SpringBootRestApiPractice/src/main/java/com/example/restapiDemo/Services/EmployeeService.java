package com.example.restapiDemo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.restapiDemo.Entities.Employee;
import com.example.restapiDemo.Repository.EmployeeRepo;

@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	public List<Employee> getAllEmployee() {
		
		List<Employee> empList = (List<Employee>) this.employeeRepo.findAll();
		
		return empList;
		
	}
	
	public Optional<Employee> getByEmployeeId(int id) {
		
		Optional<Employee> emp = this.employeeRepo.findById(id);
		
		return emp;
	}
	
	
	public Employee addEmp(Employee employee) {
		
		System.out.println("Entered in service class");
		
		Employee emp = this.employeeRepo.save(employee);
		
		return emp;
		
	}
	
	
	public void updateEmployeeById(Employee employee, int id) {
		
		employee.setEmpEmail("pankajDas.sharam332@gmail.com");
		
		this.employeeRepo.save(employee);
				
	}
	
	public void deleteById(int id) {
		
		this.employeeRepo.deleteById(id);
		
	}
	
	
	
}