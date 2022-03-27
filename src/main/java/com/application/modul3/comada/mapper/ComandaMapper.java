package com.application.modul3.comada.mapper;

import com.application.modul3.comanda.Comanda;
import com.application.modul3.comanda.dto.ComandaCreateDTO;
import com.application.modul3.comanda.dto.ComandaDTO;

public class ComandaMapper {

	public Comanda comandaCreateDTO2Comanda(ComandaCreateDTO comandaCreateDTO) {
		Comanda comanda = new Comanda();
		comanda.setCod(comandaCreateDTO.getCod());
		comanda.setData(comandaCreateDTO.getData());
		
		return comanda;
	}

	public ComandaDTO Comanda2ComandaDTO(Comanda comanda) {
		ComandaDTO comandaDTO = new ComandaDTO();
		comandaDTO.setId(comanda.getId());
		comandaDTO.setCod(comanda.getCod());
		comandaDTO.setData(comanda.getData());
		
		return comandaDTO;
	}
}
