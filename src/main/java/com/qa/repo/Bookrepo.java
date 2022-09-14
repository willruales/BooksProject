package com.qa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.rest.Book;

@Repository 
public interface Bookrepo extends JpaRepository<Book, Long> {

}
