package com.prowings.inheritance.singleclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("my_pen")
public class Pen extends MyProduct {
	
	@Column
	private String colour;
	@Column
	private int price;
	
	public Pen() {
		super();
 	}

	public Pen(String name,String colour, int price) {
		super(name);
		this.colour = colour;
		this.price = price;
 	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [colour=" + colour + ", price=" + price + "Name =" + this.getName() +"]";
	}

}
