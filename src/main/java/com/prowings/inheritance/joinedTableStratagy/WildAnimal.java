package com.prowings.inheritance.joinedTableStratagy;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
 
@Entity
@PrimaryKeyJoinColumn(name = "WildAnimal_Id")
 public class WildAnimal extends Animal {

	
	String name;

	public WildAnimal() {
		super();
 	}

	public WildAnimal(String species,String name) {
		super(species);
		this.name = name;
 	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "WildAnimal [name=" + name + "]";
	}
	
	
	
	
}
