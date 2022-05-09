package com.HibernateExample.FirstLevelCaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vivek.hibernateDemo.HibernateExample.Student;

public class FirstCachingDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// First level caching is by default enable.
		
		
		Student student = session.get(Student.class, 8);
		
		System.out.println(student);
		
		System.out.println("Working on something");
		
		Student student1 = session.get(Student.class, 8);
		
		System.out.println(student1);
		
		System.out.println(session.contains(student1));
		
		
		session.close();
		
		
		factory.close();
	}

}
