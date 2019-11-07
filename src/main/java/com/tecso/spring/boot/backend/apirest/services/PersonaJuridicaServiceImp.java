package com.tecso.spring.boot.backend.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecso.spring.boot.backend.apirest.entity.PersonaJuridica;
import com.tecso.spring.boot.backend.apirest.models.dao.IPersonaJuridicaDao;

@Service
public class PersonaJuridicaServiceImp implements IPersonaJuridicaService{
	
	@Autowired
	private IPersonaJuridicaDao personaJuridicaDao;

	@Override
	@Transactional(readOnly = true)
	public List<PersonaJuridica> findAll() {
		return (List<PersonaJuridica>) personaJuridicaDao.findAll();
	}

	@Override
	@Transactional
	public PersonaJuridica save(PersonaJuridica personaJuridica) {
		return personaJuridicaDao.save(personaJuridica);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		personaJuridicaDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public PersonaJuridica findById(long id) {
		return personaJuridicaDao.findById(id).orElse(null);
	}

}
