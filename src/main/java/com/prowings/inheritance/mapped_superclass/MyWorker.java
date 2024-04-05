package com.prowings.inheritance.mapped_superclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyWorker extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String salary;
	
	@Column
	private String grade;

	public MyWorker() {
		super();
 	}

	public MyWorker(String salary, String grade,float weight,float height) {
		super(weight,height);
		this.salary = salary;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "MyWorker [id=" + id + ", salary=" + salary + ", grade=" + grade + "]";
	}
	
	
	
	
	
	
}
