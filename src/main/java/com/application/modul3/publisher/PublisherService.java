package com.application.modul3.publisher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class PublisherService {
	
	@Autowired
	private PublisherRepository publisherRepository;
	
	// cream o inregistre si o salvam
		public Publisher createPublisher(Publisher publisher) {
			return publisherRepository.saveAndFlush(publisher);
		}
		
		// obtinem toate inre din db
		public List<Publisher> getAllPublishers() {
			return publisherRepository.findAll();
		}

	public Publisher getPublisherById(Integer id) {
		Optional<Publisher> publisherOpt = publisherRepository.findById(id);
		if (publisherOpt.isPresent()) {
			return publisherOpt.get();
		}
		return null;
	}

	public void deletePublisherById(Integer id) {
		publisherRepository.deleteById(id);
	}

	public Publisher updatePublisher(Publisher publisher, Integer id) {
		Publisher publisherUpdate = getPublisherById(id);
		publisherUpdate.setName(publisher.getName());
		publisherUpdate.setAddress(publisher.getAddress());
		publisherRepository.flush();
		return publisherUpdate;
	}

	public List<Publisher> findByName(String name) {
		List<Publisher> listPublisherByName = new ArrayList<>();
		
		listPublisherByName.addAll(publisherRepository.findByName(name));
		
		return listPublisherByName;
	}

	
}
