package com.vivek.hibernateDemo.HibernateExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		//get: by using studentId
		
		Student student = (Student)session.get(Student.class, 1);
		
		System.out.println(student);
		
		Address addr = (Address)session.get(Address.class, 2);
		
		System.out.println(addr.getImage());
		
		
		
		session.close();
		factory.close();
		

	}

}
