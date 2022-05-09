package com.example.restapiDemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapiDemo.Entities.Employee;
import com.example.restapiDemo.Services.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeService employeeService;
	
	// It will give all employee object present in DB....
	
	@GetMapping("/employees")
	public void getEmployee() {
		
		List<Employee> list = this.employeeService.getAllEmployee();
		
		System.out.println("All Employees in the org are: ");
		
		list.stream().forEach(e->System.out.println(e));
		
	}
	
	// find by Id..
	
	@GetMapping("/empById/{id}")
	public void getEmployeeById(@PathVariable("id") int id) {
		
		Optional<Employee> emp = this.employeeService.getByEmployeeId(id);
		
		System.out.println("Employee with id " + id + " is \n" + emp.get());
		
	}
	
	@PostMapping("/addEmp")
	public void addEmployee(@RequestBody Employee employee) {
		Employee emp = null;
		
		try {
			
			emp = this.employeeService.addEmp(employee);
			System.out.println("Added successfully... " +emp);
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
				
	}
	
	
	// updating employee by id....
	
	@PutMapping("/updateEmp/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id) {
		
		this.employeeService.updateEmployeeById(employee, id);
		
		System.out.println("Record updated successfully..");
				
	}
	
	@DeleteMapping("/deleteId/{id}")
	public void deleteById(@PathVariable("id") int id) {
		
		try {
			this.employeeService.deleteById(id);
			System.out.println("Record deleted successfully");
		}
		catch(IllegalArgumentException exc) {
			exc.printStackTrace();
		}
		
	}
	

}
