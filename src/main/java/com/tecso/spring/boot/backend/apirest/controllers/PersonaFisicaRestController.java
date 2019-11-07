package com.tecso.spring.boot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tecso.spring.boot.backend.apirest.entity.PersonaFisica;
import com.tecso.spring.boot.backend.apirest.services.IPersonaFisicaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaFisicaRestController {
	
	@Autowired
	private IPersonaFisicaService personaFisicaService;
	
	@GetMapping("/personas_fisicas")
	public List<PersonaFisica> indx(){
		return personaFisicaService.findAll();
	}
	
	@GetMapping("/personas_fisicas/{id}")
	public PersonaFisica show(@PathVariable Long id) {
		return personaFisicaService.findById(id);
	}
	
	@PostMapping("/personas_fisicas")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonaFisica create(@RequestBody PersonaFisica personaFisica) {
		return personaFisicaService.save(personaFisica);
	}
	
	@PutMapping("/personas_fisicas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonaFisica update(@RequestBody PersonaFisica personaFisica, @PathVariable Long id) {
		PersonaFisica PersonaActual = personaFisicaService.findById(id);
		
		PersonaActual.setApellido(personaFisica.getApellido());
		PersonaActual.setCuit(personaFisica.getCuit());
		PersonaActual.setDni(personaFisica.getDni());
		PersonaActual.setNombre(personaFisica.getNombre());
		
		return personaFisicaService.save(PersonaActual);
	}
	
	@DeleteMapping("/personas_fisicas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		personaFisicaService.delete(id);
	}
}
