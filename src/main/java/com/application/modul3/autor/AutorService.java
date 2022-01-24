package com.application.modul3.autor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
	
	@Autowired
	private AutorRepository autorRepository;

	public Autor createAutor(Autor autor) {
		// TODO Auto-generated method stub
		return autorRepository.saveAndFlush(autor);
	}

	public List<Autor> getAllAutors() {
		// TODO Auto-generated method stub
	  return autorRepository.findAll();
	}

	public Autor getAutorById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Autor> autorOpt = autorRepository.findById(id);
		return autorOpt.get();
	}

	public void deleteAutorById(Integer id) {
		// TODO Auto-generated method stub
		autorRepository.deleteById(id);
	}

}
