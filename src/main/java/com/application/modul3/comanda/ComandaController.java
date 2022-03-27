package com.application.modul3.comanda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.modul3.comada.mapper.ComandaMapper;
import com.application.modul3.comanda.dto.ComandaCreateDTO;
import com.application.modul3.comanda.dto.ComandaDTO;

@RestController
@RequestMapping("/comenzi")
public class ComandaController {
	@Autowired
	private ComandaService comandaService;
	@Autowired
	private ComandaMapper comandaMapper;
	
	@PostMapping("/{clientId}")
	public ComandaDTO createComandaAdd(@RequestBody ComandaCreateDTO comandaCreateDTO, @PathVariable Integer clientId) {
		Comanda comanda = comandaService.createComandaAdd(comandaMapper.comandaCreateDTO2Comanda(comandaCreateDTO), clientId);
		return comandaMapper.Comanda2ComandaDTO(comanda);	
	}
	
	@DeleteMapping("comanda/{comandaId}")
	public void  deleteComandaId(@PathVariable Integer comandaId) {
		comandaService.deleteComandaId(comandaId);
	}
}
