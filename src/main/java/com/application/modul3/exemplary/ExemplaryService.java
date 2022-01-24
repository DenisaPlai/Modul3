package com.application.modul3.exemplary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.modul3.book.Book;
import com.application.modul3.book.BookService;

@Service
public class ExemplaryService {

	@Autowired
	public ExemplaryRepository exemplaryRepository;
	
	@Autowired
	public BookService bookService;
	
	public Exemplary createExemplary(Integer bookId, Exemplary exemplary) {
		// TODO Auto-generated method stub
		Book book = bookService.getBookById(bookId);
		book.addExemplary(exemplary);
		return exemplaryRepository.saveAndFlush(exemplary);
	}

}
