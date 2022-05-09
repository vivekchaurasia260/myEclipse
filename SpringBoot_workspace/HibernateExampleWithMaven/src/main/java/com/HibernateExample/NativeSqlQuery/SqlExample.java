package com.HibernateExample.NativeSqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.vivek.hibernateDemo.HibernateExample.Student;

public class SqlExample {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		String q = "select * from student";
		
		NativeQuery nq = session.createSQLQuery(q);
		
		List<Object[]> list = nq.list();
		
		for(Object[] student : list) {
			System.out.println(student[4] + " : " +student[3]);
		}
		
		session.close();
		factory.close();
		
	}

}
