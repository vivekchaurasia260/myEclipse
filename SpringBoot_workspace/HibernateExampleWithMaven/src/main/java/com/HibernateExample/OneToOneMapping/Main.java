package com.HibernateExample.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vivek.hibernateDemo.HibernateExample.Certificate;
import com.vivek.hibernateDemo.HibernateExample.Student;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		
		Question ques1 = new Question();
		ques1.setQuestionId(1);
		ques1.setQuestion("What is Java?");
		
		Answer ans1 = new Answer();
		ans1.setAnswerId(324);
		ans1.setAnswer("Java is a Object Oriented Programming language");
		ans1.setQuestion(ques1);
		
		ques1.setAnswer(ans1);
		
		Question ques2 = new Question();
		ques2.setQuestionId(2);
		ques2.setQuestion("What is Collection?");
		
		Answer ans2 = new Answer();
		ans2.setAnswerId(311);
		ans2.setAnswer("Collection is a Framework which has pre-defined methods.");
		ans2.setQuestion(ques2);
		
		ques2.setAnswer(ans2);
	
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		// saving the objects
		
		session.save(ques1);
		session.save(ques2);
		session.save(ans1);
		session.save(ans2);
		
		tx.commit();
		
		
		Question newQ = (Question)session.get(Question.class, 2);
		
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		session.close();		
		factory.close();
				
		
	}

}
