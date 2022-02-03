package com.application.modul3.book.dto;

//DTO - Data Transfer Object -> arata 1:1 ca si campuri cu entitatile pe care le folosim la BD
public class BookDTO {
	private Integer id;
	private String title;
	private Integer year;
	private String isbn;
	//private List<ExemplaryDTO> exemplaryDTO; -> de facut getter + setter
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
