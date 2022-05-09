package com.vivek.hibernateDemo.HibernateExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure();
		SessionFactory factory = con.buildSessionFactory();
		
		Student student1 = new Student();
		student1.setId(6653);
		student1.setName("Keshav Pandey");
		student1.setCity("Punjab");
		
		Certificate certificate = new Certificate();
		certificate.setCourse("Ruby on Rails");
		certificate.setDuration("3 months");
		
		student1.setCerti(certificate);
		
		
		Student student2 = new Student();
		student2.setId(5452);
		student2.setName("Vivek Chaurasia");
		student2.setCity("Uttar Pradesh");
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Full Stack with Project");
		certificate1.setDuration("12 months");
		
		student2.setCerti(certificate1);
		
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		// saving the objects
		
		session.save(student1);
		session.save(student2);
		
		tx.commit();		
		session.close();		
		factory.close();
		
	}

}
