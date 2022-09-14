package com.qa.rest;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.services.BookService;

@RestController
public class BookController {
	

		  private BookService service;

			public BookController(BookService service) 
		    
		    {
		        super();
		        this.service = service;
		    }

	//private List<Person> people = new ArrayList<>();

	//crud starts

	    @GetMapping("/test")
	    public String test() {
	        return "Hello, World! from Book";
	    } 	
	    
	    
	    
	    // Create
	    @PostMapping("/create")
	    public Book addPerson(@RequestBody Book book) {
	        return this.service.addBook(book);
	    }
	    
	    

	    
	    @GetMapping("/getAll")
	    public List<Book> getAllBooks() {
	        return this.service.getAllBooks();
	    }
	    
	    
	    //update
	    @PutMapping("/update")
	    public Book updateBook(@PathParam("id") Long id, @RequestBody Book book) {
	        return this.service.updateBook(id, book);
	    }

	    
	    
	  //delete
	    @DeleteMapping("/delete/{id}")
	    public boolean removeBook(@PathVariable Long id) {
	        return this.service.removeBook(id);
	    }

}
