package com.HibernateExample.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HibernateExample.ManyToOneMapping.Answer;
import com.HibernateExample.ManyToOneMapping.Question;

public class CascadeExample {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		
		Question q1 = new Question();
		
		q1.setQuesId(1121);
		q1.setQues("What is Python");
		
		List<Answer> list = new ArrayList<Answer>();
		
		Answer ans1 = new Answer();
		ans1.setAnsID(344);
		ans1.setAns("Python is a Programming Language");
		ans1.setQues(q1);
		
		Answer ans2 = new Answer();
		ans2.setAnsID(232);
		ans2.setAns("Python supports Interpreter");
		ans2.setQues(q1);
		
		Answer ans3 = new Answer();
		ans3.setAnsID(133);
		ans3.setAns("It is most powerful language");
		ans3.setQues(q1);
		
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		q1.setAnswer(list);
		
		
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		
		tx.commit();
		session.close();
		factory.close();

	}

}
