package com.tecso.spring.boot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tecso.spring.boot.backend.apirest.entity.PersonaJuridica;

public interface IPersonaJuridicaDao extends CrudRepository<PersonaJuridica, Long> {

}
