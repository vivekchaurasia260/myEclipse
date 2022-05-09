package com.vivekrest.test.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vivekrest.test.dao.BookRepository;
import com.vivekrest.test.entities.Book;

@Component
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
//	private static List<Book> list = new ArrayList<Book>();
	
//	static {
//		list.add(new Book(3322, "The Alchemist", "Paulo Coelho"));
//		list.add(new Book(9912, "The Lottery", "Shirley Jackson"));
//		list.add(new Book(1816, "Lord of the Rings", "J.R.R Tokien"));
//		list.add(new Book(2913, "Wing of Fire", "A.P.J Abdul Kalam"));	
//	}
	
	//get all books
	public List<Book> getAllBooks() {
		
		List<Book> list = (List<Book>)this.bookRepository.findAll();
		return list;
	}
	
	//get single book
	public Book getBookById(int id) {
		
		Book book = null;
		try {
			// book=list.stream().filter(e->e.getId() == id).findFirst().get();
			book = this.bookRepository.findById(id);
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
		return book;
		
	}
	
	// adding new book
	public Book addBook(Book newBook) {
		//list.add(newBook);
		
		Book book = this.bookRepository.save(newBook);
		
		return book;
	}
	
	//delete book by id
	public void deleteBookById(int bookId) {
		
//		list = list.stream().filter(book -> {
//			if(book.getId()!=bookId) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		
	//	list = list.stream().filter(book-> book.getId()!=bookId).collect(Collectors.toList());
		
		
		this.bookRepository.deleteById(bookId);
		
		
	}
	
	// update book by id
	public void updateBook(Book book, int bookId) {
		
//		list = list.stream().map(b-> {
//			if(b.getId()==bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());
		
		book.setId(bookId);
		this.bookRepository.save(book);
		
	}
}
