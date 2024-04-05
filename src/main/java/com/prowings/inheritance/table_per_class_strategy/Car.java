package com.prowings.inheritance.table_per_class_strategy;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Car extends Vehicle{

	@Column
	private String company;
	@Column
	private String engineName;
	
	
	public Car() {
		super();
 	}


	public Car(String manufacturar,String company,String engineName) {
		super(manufacturar);
		this.company = company;
		this.engineName = engineName;
		
 	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getEngineName() {
		return engineName;
	}


	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}


	@Override
	public String toString() {
		return "Car [company=" + company + ", engineName=" + engineName + "]";
	}

	
 
	
	
	
	
}
