package com.HibernateExample.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HibernateExample.ManyToOneMapping.Question;

public class MappingDemo {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		
//		Employee emp1 = new Employee();
//		Employee emp2 = new Employee();
//		
//		emp1.setEmpId(103);
//		emp1.setName("Rajan Singh");
//		
//		emp2.setEmpId(104);
//		emp2.setName("Madhav Shukla");
//		
//		Project prj1 = new Project();
//		Project prj2 = new Project();
//		
//		prj1.setPid(5523);
//		prj1.setProjectName("Health Management Systems");
//		
//		prj2.setPid(7712);
//		prj2.setProjectName("Internet of Things");
//
//		List<Project> projects = new ArrayList<Project>();
//		List<Employee> employees = new ArrayList<Employee>();
//		
//		projects.add(prj1);
//		projects.add(prj2);
//		
//		employees.add(emp1);
//		employees.add(emp2);
//		
//		
//		emp1.setProjects(projects);
//		
//		prj2.setEmployees(employees);
		
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
//		session.save(emp1);
//		session.save(emp2);
//		session.save(prj1);
//		session.save(prj2);
		
		
		Project prj = (Project)session.get(Project.class, 7712);
		
		System.out.println(prj.getPid());
		System.out.println(prj.getProjectName());
		
		System.out.println(prj.getEmployees().size());
		
	
		tx.commit();
		
		session.close();
		
		factory.close();
		
	}

}
