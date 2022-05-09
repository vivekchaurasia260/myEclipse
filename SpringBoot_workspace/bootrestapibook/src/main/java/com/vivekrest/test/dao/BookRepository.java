package com.vivekrest.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.vivekrest.test.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	public Book findById(int id);

}
