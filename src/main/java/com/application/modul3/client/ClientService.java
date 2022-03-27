package com.application.modul3.client;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class ClientService {
	@Autowired
	private ClientRepository clientRepository;

	public Client createClient(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.saveAndFlush(client);
	}

	public List<Client> getAllPerson() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	public void deleteClientById(Integer clientId) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(clientId);
	}

	public Client updateClient(Client client, Integer clientId) {
		Client  updateClient  = getClientById(clientId);
		updateClient.setNume(client.getNume());
		updateClient.setVarsta(client.getVarsta());
		updateClient.setAdresa(client.getAdresa());
		clientRepository.flush();
		return updateClient;
	}

	public Client getClientById(Integer clientId) {
		Optional<Client> optclient = clientRepository.findById(clientId);
		if (optclient.isPresent()) {
			return optclient.get();
		}
		return null;
	}

}
