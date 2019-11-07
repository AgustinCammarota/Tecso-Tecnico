package com.tecso.spring.boot.backend.apirest.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class PersonaFisica extends Titular {

	public PersonaFisica() {
	}

	private static final long serialVersionUID = 1L;

	@Column(name = "nombre", length = 80)
	private String nombre;
	
	@Column(name = "apellido", length = 250)
	private String apellido;
	
	@Column(name = "dni", length = 8)
	private int dni;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
}
