package com.application.modul3.autor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/autors")
public class AutorController {

	@Autowired
	private AutorService autorService;
	
	@PostMapping
	public Autor createAutor(@RequestBody Autor autor) {
		return autorService.createAutor(autor);
	}
	
	@GetMapping("/list")
    public List<Autor> getAllUsers(){
		return autorService.getAllAutors();
	}
	
	@GetMapping("/{id}")
	public Autor getAutorById(@PathVariable Integer id) {
		return autorService.getAutorById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserById(@PathVariable Integer id) {
		autorService.deleteAutorById(id);
	}
}
