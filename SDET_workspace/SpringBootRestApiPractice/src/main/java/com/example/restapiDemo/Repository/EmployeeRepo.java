package com.example.restapiDemo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.restapiDemo.Entities.Employee;


public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	
	

}
