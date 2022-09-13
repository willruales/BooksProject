package com.qa.rest;

public class Book{

	
	

	//add fields
	private String name;
	private String[] authors;
	private float price; 
	 
	
	/**
	 *  add Constructor for book
	 * @param name String title of the book
	 * @param authors String array up to five authors
	 * @param d double price of the book
	 */
	
	public Book(String name, String[] authors, float d) {
		this.name = name;
		this.authors = authors;
		this.price = d;
	}

	// add getter/setter or methods
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	/**
	 * Set the authors of the book, replaced the old array entirely
	 * Will only accept up to 5 authors in the array, otherwise an 
	 * error is thrown and no change is made
	 * 
	 * @param authors array of authors to replace the current set
	 */
	

	

	
	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String[]addAuthor() {
		
		//add code to add authors to the book !
		return authors;
	}
	
}
