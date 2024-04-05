package com.prowings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.entity.Employee;

public class EmployeeDao {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Sham","Deveops",999999);
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session1 = sessionFactory.openSession();
		Transaction transaction = session1.beginTransaction();
		Employee emp1 = session1.get(Employee.class, 1);
		System.out.println(emp1);
		
		session1.save(employee1);
		transaction.commit();
		
		
		Session session2 = sessionFactory.openSession();
		Transaction transaction2 = session2.beginTransaction();
		Employee emp2 = session2.get(Employee.class, 1);
		System.out.println(emp2);
		transaction2.commit();
		session1.close();
		session2.close();

	}

}
