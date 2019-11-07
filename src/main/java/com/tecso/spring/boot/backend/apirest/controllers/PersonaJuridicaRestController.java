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

import com.tecso.spring.boot.backend.apirest.entity.PersonaJuridica;
import com.tecso.spring.boot.backend.apirest.services.IPersonaJuridicaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaJuridicaRestController {
	
	@Autowired
	private IPersonaJuridicaService personaJuridicaService;
	
	@GetMapping("/personas_juridica")
	public List<PersonaJuridica> indx() {
		return personaJuridicaService.findAll();
	}
	
	@GetMapping("/personas_juridica/{id}")
	public PersonaJuridica show(@PathVariable Long id) {
		return personaJuridicaService.findById(id);
	}
	
	@PostMapping("/personas_juridica")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonaJuridica create(@RequestBody PersonaJuridica personaJuridica) {
		return personaJuridicaService.save(personaJuridica);
	}
	
	@PutMapping("/personas_juridica/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public PersonaJuridica update(@RequestBody PersonaJuridica personaJuridica, @PathVariable Long id) {
		PersonaJuridica personaActual = personaJuridicaService.findById(id);
		
		personaActual.setFechaFundacion(personaJuridica.getFechaFundacion());
		personaActual.setRazonSocial(personaJuridica.getRazonSocial());
		
		return personaJuridicaService.save(personaActual);
	}
	
	@DeleteMapping("/personas_juridica/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		personaJuridicaService.delete(id);
	}
}
