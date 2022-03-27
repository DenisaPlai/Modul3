package com.application.modul3.comanda.dto;

import java.time.LocalDate;

public class ComandaCreateDTO {

	private String cod;
	private LocalDate data;
	private Integer clientId;
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
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	
	
}
