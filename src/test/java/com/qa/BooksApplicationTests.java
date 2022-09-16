package com.qa;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.repo.Bookrepo;
import com.qa.rest.Book;
import com.qa.services.BookService;

@SpringBootTest
class BooksApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Autowired
	private BookService service;

	@MockBean
	private Bookrepo repo;

	

	@Test
	void testGetAllBooks() {
		final List<Book> books = List.of(new Book(1l, "Jack", "Kangaroo", "Red"),
				new Book(2l, "Wally", "Wallaby", "Grey"));

		Mockito.when(this.repo.findAll()).thenReturn(books);

		assertThat(this.service.getAllBooks()).isEqualTo(books);

		Mockito.verify(this.repo, Mockito.times(1)).findAll();
	}
	
	@Test
	void testCreate(){
	    // GIVEN is our testing data - you can make this a final local variable if you want, e.g.:
	    final Book TEST_BOOK = new Book(2l, "asf", "JH", "213d");
	    final Book TEST_SAVED_BOOK = new Book(1L, "asds", "JH", "abc");

	    // WHEN
	    Mockito.when(this.repo.save(TEST_BOOK)).thenReturn(TEST_SAVED_BOOK);

	    // THEN
	    assertThat(this.repo.save(TEST_BOOK)).isEqualTo(TEST_SAVED_BOOK);

	    // verify that our repo was accessed exactly once
	    Mockito.verify(this.repo, Mockito.times(1)).save(TEST_BOOK);
	}
	@Test
	void testDelete() {
		final Long id = 1l;

		Mockito.when(this.repo.existsById(id)).thenReturn(false);

		assertThat(this.service.removeBook(id)).isEqualTo(true);

		Mockito.verify(this.repo, Mockito.times(1)).existsById(id);
	}
}
