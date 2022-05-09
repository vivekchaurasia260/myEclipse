package com.HibernateExample.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vivek.hibernateDemo.HibernateExample.Student;

public class HQLExample {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		//HQL
		//Syntax
		//
		
		String query="from Student where city=:x and course=:y";
		
		Query q = session.createQuery(query);
		
		q.setParameter("x", "Punjab");
		q.setParameter("y", "Data Science with Python");
		
		// In q we get all the result of Student class.
		// We can get single(unique) result by using q.uniqueResult();
		// we can get result in list.
		
		List<Student> record = q.list();
		
		for(Student s : record) {
			
			System.out.println(s.getName() +" : " +s.getCerti().getCourse());
		}
		
		
		System.out.println("__________________________________________________________________________");
		// deleting a row by using HQL
				
//		Query q1 = session.createQuery("delete from Student where city=:c");
//		
//		q1.setParameter("c", "LKO");
//		
//		Transaction tx = session.beginTransaction();
//		
//		int num = q1.executeUpdate();
//		
//		tx.commit();
//		
//		System.out.println(num + " rows successfully deleted.");
		
		
		System.out.println("____________________________________________________________________________");
		
		// updating row by using HQL
		
		Transaction tx = session.beginTransaction();
//		
//		Query q2 = session.createQuery("Update from Student set city = 'Anand Vihar' where name=:n");
//		
//		q2.setParameter("n", "Rahul Kesari");	
//		
//		int updates = q2.executeUpdate();
//		
//		System.out.println(updates + " rows successfully updated");
		
		tx.commit();
		
		
		// How to execute join query
		
		Query q3 = session.createQuery("select q.ques, q.quesId, a.ans from Question as q INNER JOIN q.answer as a");
		
		List<Object []> list =  q3.getResultList();
		
		for(Object[] arr : list) {
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		session.close();
		factory.close();
		
	}
}
