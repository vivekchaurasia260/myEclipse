package com.example.jpaDemo.Repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.jpaDemo.Entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
	// customize method for finding data by using Name..
	
	Optional<Employee> findByName(String name);
	
	@Transactional
	@Modifying
	@Query("delete from Employee e where e.name =:n")
	void deleteByName(@Param("n") String name);
	
	
	// We can also do deletion by name
	
//	@Transactional
//  void deleteByName(String Name);
	
			
}