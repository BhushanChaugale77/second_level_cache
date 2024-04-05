package com.prowings.inheritance.table_per_class_strategy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTablePerClass {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Car car = new Car("Volkswagon","Taigun", "Turbo77");
		
		Truck truck = new Truck("TATA","Alpha","Intercoolor_Turbo_1613");
		
		session.save(car);
		session.save(truck);
		
		tx.commit();
		
		session.close();
		
		sessionFactory.close();
		
		
	}

}
