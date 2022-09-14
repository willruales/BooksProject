package com.qa.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Book{

	@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Long id;
	
	 String name;
	 String authors;
	 String genre;
	
	public Book() {
		super();
	}
	
	
	
	public Book(Long id, String name, String authors, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.genre = genre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
	
