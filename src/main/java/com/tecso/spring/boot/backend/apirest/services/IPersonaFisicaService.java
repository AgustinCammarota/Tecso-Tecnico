package com.tecso.spring.boot.backend.apirest.services;

import java.util.List;

import com.tecso.spring.boot.backend.apirest.entity.PersonaFisica;

public interface IPersonaFisicaService {
	public List<PersonaFisica> findAll();
	public PersonaFisica save(PersonaFisica personaFisica);
	public void delete(Long id);
	public PersonaFisica findById(Long id);
}
