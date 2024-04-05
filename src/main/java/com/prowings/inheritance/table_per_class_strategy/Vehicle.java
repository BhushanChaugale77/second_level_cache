package com.prowings.inheritance.table_per_class_strategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int vehicleId;
	@Column
	private String manufacturar;
	
	
	public Vehicle() {
		super();
 	}


	public Vehicle(String manufacturar) {
		super();
		this.manufacturar = manufacturar;
	}


	public int getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}


	public String getManufacturar() {
		return manufacturar;
	}


	public void setManufacturar(String manufacturar) {
		this.manufacturar = manufacturar;
	}


	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", manufacturar=" + manufacturar + "]";
	}
	
	
    
	
	
	
	
	
}
