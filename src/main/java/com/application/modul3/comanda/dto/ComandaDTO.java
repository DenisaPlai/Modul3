package com.application.modul3.comanda.dto;

import java.time.LocalDate;

public class ComandaDTO {
	private Integer id;
	private String cod;
	private LocalDate data;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
	
}
