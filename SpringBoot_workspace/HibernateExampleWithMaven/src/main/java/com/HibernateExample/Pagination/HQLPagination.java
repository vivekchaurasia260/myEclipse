package com.HibernateExample.Pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.vivek.hibernateDemo.HibernateExample.Student;

public class HQLPagination {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		Query q = session.createQuery("from Student");
		
		// implementing pagination using hibernate...
		
		// set First mein kaha se start krna hai wo pass krte hai.
		q.setFirstResult(0);
		
		// set max result mein maximum result kitne ka chahiye.
		q.setMaxResults(4);
		
		List<Student> list = q.list();
		
		for(Student s : list) {
			System.out.println(s.getId() + " : " + s.getName() + " : " + s.getCity() + " : " + s.getCerti().getCourse());
		}
		
		
		
		session.close();
		factory.close();

	}

}
