package com.vivekrest.test.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vivekrest.test.entities.Book;
import com.vivekrest.test.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBook() {
						
		List<Book> list = this.bookService.getAllBooks();
		
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(list);
		
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") int id) {
		 
		Book book = this.bookService.getBookById(id);
		
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(book));
		
	}
	
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		
		Book b=null;
		
		try {
			b = this.bookService.addBook(book);
			System.out.println(book);
			return ResponseEntity.status(HttpStatus.CREATED).body(b);
		}
		catch(Exception exc) {
			exc.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@DeleteMapping("/books/{bookId}")
	public ResponseEntity<?> deleteBook(@PathVariable("bookId") int bookId) {
		
		try {
			this.bookService.deleteBookById(bookId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		catch(Exception exc) {
			exc.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		 	
	}
	
	@PutMapping("/books/{bookId}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {
		
		try {
			this.bookService.updateBook(book, bookId);
			return ResponseEntity.ok().body(book);
		}
		catch(Exception exc) {
			exc.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
}
