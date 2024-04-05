package com.prowings.inheritance.mapped_superclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.HibernateUtil;

 
public class TestMappedSuperClass {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		MyEmployee employee = new MyEmployee("Ram","IT",77.7f,7.3f);
		
		MyWorker worker = new MyWorker( "Sham", "Manager",99.5f,5.5f);
		
		session.save(employee);
		session.save(worker);
		tx.commit();
		
		session.close();
		
		sessionFactory.close();
	}
	
	
	
}
