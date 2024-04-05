package com.prowings.inheritance.joinedTableStratagy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.HibernateUtil;

public class TestJoinedTableStratagy {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Pet pet = new Pet("DOG", "Suji", 40);
		
		WildAnimal wild_animal = new WildAnimal("CAT","Black Panthor" );
		
		session.save(pet);
		session.save(wild_animal);
		
		Pet p = session.get(Pet.class, 1);
		
		System.out.println(p.getId());
		System.out.println(p.getSpecies());
		System.out.println(p.getName());
		System.out.println(p.getWeight());
		
		tx.commit();
		session.close();
		sessionFactory.close();	
		
	}
	
	
	
	
}
