package com.prowings.inheritance.mapped_superclass;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
 
@MappedSuperclass
public class Person {
	
	@Column
	private float weight;
	@Column
	private float height;

	public Person() {
		super();
	}
	
	public Person(float weight, float height) {
		this.weight = weight;
		this.height = height;	
	}
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
}
