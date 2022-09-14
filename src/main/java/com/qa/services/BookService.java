package com.qa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.repo.Bookrepo;
import com.qa.rest.Book;


@Service 
public class BookService {

	private Bookrepo repo;

	
	public BookService(Bookrepo repo) {
		super();
		this.repo = repo;
	}
	
	public Book addBook(Book book) {
		   return this.repo.save(book);
	} 
	 public List<Book> getAllBooks() {
	        return this.repo.findAll();
	    }
	  public Book updateBook(Long id, Book newBook) {
	        Optional<Book> existingOptional = this.repo.findById(id);
	        Book existing = existingOptional.get();

	        existing.setName(newBook.getName());
	        existing.setGenre(newBook.getGenre());

	        return this.repo.save(existing);
	    }


	    public boolean removeBook(Long id) {
	        // removes the entity
	        this.repo.deleteById(id);
	        // checks to see if it still exists
	        boolean exists = this.repo.existsById(id);
	        // returns true if entity no longer exists
	        return !exists;
	    }
	    //test

	
}
