package com.application.modul3.book.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.application.modul3.book.Book;
import com.application.modul3.book.dto.BookDTO;

@Service
public class BookMapper {
	//@Autowired ExemplaryMapper exemplaryMapper;
	
	public BookDTO book2BookDTO(Book book) {
		BookDTO bookDTO = new BookDTO();
		bookDTO.setId(book.getId());
		bookDTO.setTitle(book.getTitle());
		bookDTO.setIsbn(book.getIsbn());
		bookDTO.setYear(book.getYear());
		//bookDTO.setExemplaryListDTO(exemplaryMapper.exemplaryList2ExemplaryListDTO(book.getExemplaryList()));
		return bookDTO;
	}
	
	public Book bookDTO2Book(BookDTO bookDTO) {
		Book book = new Book();
		book.setTitle(bookDTO.getTitle());
		book.setYear(bookDTO.getYear());
		book.setIsbn(bookDTO.getIsbn());
		return book;
	}

	public List<BookDTO> bookList2BookListDTO(List<Book> books) {
		return books.stream().map(book -> book2BookDTO(book)).collect(Collectors.toList());
//		List<BookDTO> bookListDTO = new ArrayList<>();
//		for(Book book : books) {
//			bookListDTO.add(book2BookDTO(book));
//		}
//		return bookListDTO;
	}
}