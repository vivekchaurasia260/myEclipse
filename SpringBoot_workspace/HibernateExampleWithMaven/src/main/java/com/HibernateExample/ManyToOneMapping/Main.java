package com.HibernateExample.ManyToOneMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		
//		Question ques1 = new Question();
//		ques1.setQuesId(1);
//		ques1.setQues("What is Java");
//		
//		
//		List<Answer> list = new ArrayList<Answer>();
//		
//		Answer ans1 = new Answer();
//		ans1.setAnsID(112);
//		ans1.setAns("Java is a Object Oriented Programming Language");
//		ans1.setQues(ques1);
//		
//		Answer ans2 = new Answer();
//		ans2.setAnsID(131);
//		ans2.setAns("It has Collection Framework");
//		ans2.setQues(ques1);
//		
//		Answer ans3 = new Answer();
//		ans3.setAnsID(141);
//		ans3.setAns("Java byte code in platform independent");
//		ans3.setQues(ques1);
//		
//		list.add(ans1);
//		list.add(ans2);
//		list.add(ans3);
//		
//		
//		ques1.setAnswer(list);
		
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
//		session.save(ques1);
//		session.save(ans1);
//		session.save(ans2);
//		session.save(ans3);
		
		Question ques = (Question)session.get(Question.class, 1);
		
		System.out.println(ques.getQues());
		
		for(Answer a : ques.getAnswer()) 
			System.out.println(a.getAns());
		
		tx.commit();
		
		
		session.close();
		factory.close();
		
		
		

	}

}
