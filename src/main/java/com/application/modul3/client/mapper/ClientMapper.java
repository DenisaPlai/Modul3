package com.application.modul3.client.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.application.modul3.client.Client;
import com.application.modul3.client.dto.ClientCreateDTO;
import com.application.modul3.client.dto.ClientDTO;

public class ClientMapper {

	public Client clientCreateDTO2client(ClientCreateDTO clientCreateDTO) {
		Client client = new Client();
		client.setAdresa(clientCreateDTO.getAdresa());
		client.setNume(clientCreateDTO.getNume());
		client.setVarsta(clientCreateDTO.getVarsta());
		return client;
	}
	
	public ClientDTO client2ClientDTO(Client client) {
		ClientDTO clientDTO = new ClientDTO();
		clientDTO.setId(client.getId());
		clientDTO.setAdresa(client.getAdresa());
		clientDTO.setNume(client.getNume());
		clientDTO.setVarsta(client.getVarsta());
		return clientDTO;
	}
	
	public Client clientDTO2client(ClientDTO clientDTO) {
		Client client = new Client();
		client.setId(clientDTO.getId());
		client.setAdresa(clientDTO.getAdresa());
		client.setNume(clientDTO.getNume());
		client.setVarsta(clientDTO.getVarsta());
		return client;
	}
	
	public List<ClientDTO> clientList2ClientListDTO(List<Client> clienti) {
		return clienti.stream().map(client -> client2ClientDTO(client)).collect(Collectors.toList());
	}
}
