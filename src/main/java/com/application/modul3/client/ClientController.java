package com.application.modul3.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.modul3.client.dto.ClientCreateDTO;
import com.application.modul3.client.dto.ClientDTO;
import com.application.modul3.client.mapper.ClientMapper;

@RestController
@RequestMapping("/clienti")
public class ClientController {
	@Autowired
	private ClientService clientService;

	@Autowired
	private ClientMapper clientMapper;
	
	@PostMapping
	public ClientDTO createClient(@RequestBody ClientCreateDTO clientCreateDTO) {
		Client client = clientService.createClient(clientMapper.clientCreateDTO2client(clientCreateDTO));
		return clientMapper.client2ClientDTO(client);
	}
	
	@GetMapping("/list")
	public List<ClientDTO> getAllClient() {
		return clientMapper.clientList2ClientListDTO(clientService.getAllPerson());
	}
	
	@DeleteMapping("/client/{clientId}")
	public void deleteClientId(@PathVariable Integer clientId) {
		clientService.deleteClientById(clientId);
	}
	
	@PutMapping("/client/{clientId}")
	public ClientDTO updateClient(@RequestBody ClientDTO clientDTO, @PathVariable Integer clientId) {
		Client client = clientService.updateClient(clientMapper.clientDTO2client(clientDTO), clientId);
		return clientMapper.client2ClientDTO(client);
	}
}
