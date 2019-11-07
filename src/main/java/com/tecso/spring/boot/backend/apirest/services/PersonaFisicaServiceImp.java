package com.tecso.spring.boot.backend.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecso.spring.boot.backend.apirest.entity.PersonaFisica;
import com.tecso.spring.boot.backend.apirest.models.dao.IPersonaFisicaDao;

@Service
public class PersonaFisicaServiceImp implements IPersonaFisicaService {
	
	@Autowired
	private IPersonaFisicaDao personaFisicaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<PersonaFisica> findAll() {
		return (List<PersonaFisica>) personaFisicaDao.findAll();
	}

	@Override
	@Transactional
	public PersonaFisica save(PersonaFisica personaFisica) {
		return personaFisicaDao.save(personaFisica);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		personaFisicaDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public PersonaFisica findById(Long id) {
		return personaFisicaDao.findById(id).orElse(null);
	}

}
