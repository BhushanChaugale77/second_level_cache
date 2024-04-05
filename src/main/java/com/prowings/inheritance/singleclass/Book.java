package com.prowings.inheritance.singleclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("my_book")
public class Book  extends MyProduct{

	@Column
	private String author;
	@Column
	private int ISBN;
	
	public Book() {
		super();
 	}

	public Book(String name,String author, int iSBN) {
		super(name);
		this.author = author;
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", ISBN=" + ISBN + "Name=" + this.getName() +"]";
	}
	 
	 
	
	
}
