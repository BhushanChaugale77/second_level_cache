package com.prowings.inheritance.table_per_class_strategy;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Truck extends Vehicle{

	@Column
	private String company;
	@Column
	private String engineName;
	
	
	public Truck() {
		super();
 	}
	public Truck(String manufacturar,String company,String engineName) {
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
		return "Truck [company=" + company + ", engineName=" + engineName + "]";
	}
	
	
	
	
	
}
