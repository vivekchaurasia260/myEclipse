package com.HibernateExample.SecondLevelCaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vivek.hibernateDemo.HibernateExample.Student;

public class SecondCachingDemo {

	public static void main(String[] args) {
		
		// In this we need to add 2 dependencies in POM file(hiberante cache + Encache)
		
		// In this we also add property and associated class name in our hibernate config xml file.
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session1 = factory.openSession();
		
		Student stud1 = session1.get(Student.class, 6);
		System.out.println(stud1);
		
		session1.close();
		
		Session session2 = factory.openSession();
		
		Student stud2 = session2.get(Student.class, 6);
		System.out.println(stud2);
		
		
		session2.close();
		
		factory.close();

	}

}
