package com.example.jpaDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.jpaDemo.Entity.Employee;
import com.example.jpaDemo.Repo.EmployeeRepo;

@SpringBootApplication
public class SpringBootJpaPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootJpaPracticeApplication.class, args);
		
		EmployeeRepo empRepo = context.getBean(EmployeeRepo.class);
		
		
		// creating employee records in DB.
		
//		Employee emp1=new Employee();
//		emp1.setId(101);
//		emp1.setName("Rahul Gupta");
//		emp1.setSalary(35000);
//		emp1.setEmailId("gupta.rahul112@gmail.com");
//		emp1.setCompanyName("Micro Focus");
//		
//		
//		Employee emp2=new Employee();
//		emp2.setId(102);
//		emp2.setName("Ashish Mishra");
//		emp2.setSalary(42000);
//		emp2.setEmailId("amishra440@gmail.com");
//		emp2.setCompanyName("Global Logic");
//		
//		Employee emp3=new Employee();
//		emp3.setId(103);
//		emp3.setName("Rajat Patidar");
//		emp3.setSalary(67000);
//		emp3.setEmailId("rajat.patidar771@gmail.com");
//		emp3.setCompanyName("Accenture");
//		
//		Employee emp4=new Employee();
//		emp4.setId(104);
//		emp4.setName("Neha Yadav");
//		emp4.setSalary(17000);
//		emp4.setEmailId("yadavNeha223@gmail.com");
//		emp4.setCompanyName("Tata Consultancy");
//		
//		Employee emp5=new Employee();
//		emp5.setId(105);
//		emp5.setName("Rakesh Chopra");
//		emp5.setSalary(55000);
//		emp5.setEmailId("rakeshChopra734@gmail.com");
//		emp5.setCompanyName("Deloitte");
//		
//		List<Employee> employees = List.of(emp1, emp2, emp3, emp4, emp5);
//		
//		Iterable<Employee> res = empRepo.saveAll(employees);
//		
//		res.forEach(employee-> {
//			System.out.println(employee);
//		});
//		
//		System.out.println("Employee records successfully created!!");
		
		
		// updating the existing record in DB. // finding the record by ID.
		
//		Optional<Employee> employee = empRepo.findById(2);
//		
//		Employee emp = employee.get();
//		
//		emp.setName("Anjali Mishra");
//		
//		Employee res = empRepo.save(emp);
//		
//		System.out.println(res);
//		
//		System.out.println("Update done successfully");
		
		
		// retrieving the data by ID.
		
//		Optional<Employee> optional = empRepo.findById(3);
//		
//		Employee emp = optional.get();
//		
//		System.out.println(emp);
//		
//		System.out.println("Record fetched successfully!!!");
//		
//		
//		// retrieving the record by NAME.
//		
//		Optional<Employee> recordByName = empRepo.findByName("Rahul Gupta");
//		
//		Employee emp1 = recordByName.get();
//		
//		System.out.println(emp1);
//		
//		System.out.println("Record is successfully retrieve by Name!!");
//		
//		System.out.println("____________________________________________________________________________________________");
		
		
		// delete by ID.
		
//		List<Integer> res = List.of(2,3);
//		
//		empRepo.deleteAllById(res);
//		
//		
//		System.out.println("Employee record deleted successfully!!!");
//
		
		// delete by Name.
		
		empRepo.deleteByName("Neha Yadav");
		
		System.out.println("Records were delete successfully..");
				
		
	}

}
