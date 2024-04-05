package com.prowings.inheritance.singleclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.HibernateUtil;

public class TestSingleTableStrategy {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Pen pen = new Pen("Reynolds", "Blue", 10);
		
		Book book = new Book("Effective Java", "James Gosling", 777);
		
		
		session.save(pen);
		session.save(book);
		
		tx.commit();
		
		session.close();
		
		sessionFactory.close();
		
		
		
		
		
	}
	
	
	
	
}
