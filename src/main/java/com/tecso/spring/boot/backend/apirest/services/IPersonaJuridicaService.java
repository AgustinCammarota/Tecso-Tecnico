package com.tecso.spring.boot.backend.apirest.services;

import java.util.List;

import com.tecso.spring.boot.backend.apirest.entity.PersonaJuridica;

public interface IPersonaJuridicaService {
	public List<PersonaJuridica> findAll();
	public PersonaJuridica save(PersonaJuridica personaJuridica);
	public void delete (Long id);
	public PersonaJuridica findById(long id);
	
}
