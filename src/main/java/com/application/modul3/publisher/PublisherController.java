package com.application.modul3.publisher;

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

import com.application.modul3.publisher.dto.PublisherDTO;
import com.application.modul3.publisher.mapper.PublisherMapper;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

	@Autowired
	private PublisherService publisherService;
	@Autowired
	private PublisherMapper publisherMapper;
	
	@PostMapping
	public PublisherDTO createPublishe(@RequestBody PublisherDTO publisherDTO) {
		Publisher createdPublishe = publisherService.createPublisher(publisherMapper.publisherDTO2Publisher(publisherDTO));
		return publisherMapper.publisher2PublisherDTO(createdPublishe);
	}
	
	@GetMapping("/{id}")
	public Publisher getPublisherById (@PathVariable Integer id) {
		return publisherService.getPublisherById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletePublisherById(@PathVariable Integer id) {
		publisherService.deletePublisherById(id);
	}

	@PutMapping("/{id}")
	public Publisher updatePublisher(@RequestBody Publisher publisher, @PathVariable Integer id) {
		return publisherService.updatePublisher(publisher, id);
	}

	@GetMapping("/{name}")
	public List<Publisher> findByName(@PathVariable("name") String name) {
		return publisherService.findByName(name);

	}
	
}
