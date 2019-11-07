package com.tecso.spring.boot.backend.apirest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("2")
public class PersonaJuridica extends Titular {
	
	public PersonaJuridica() {
		
	}
	private static final long serialVersionUID = 1L;
	
	@Column(name = "razon_social", length = 100)
	private String razonSocial;
	
	@Column(name = "fecha_fundacion")
	@Temporal(TemporalType.DATE)
	private Date fechaFundacion;
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public Date getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(Date fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	
}
