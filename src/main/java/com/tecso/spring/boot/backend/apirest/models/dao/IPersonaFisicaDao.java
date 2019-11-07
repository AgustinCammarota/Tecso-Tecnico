package com.tecso.spring.boot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tecso.spring.boot.backend.apirest.entity.PersonaFisica;

public interface IPersonaFisicaDao extends CrudRepository<PersonaFisica, Long> {

}
