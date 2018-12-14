package com.utn.modelo;

//
//Clase PersonaVo. 
//
// Al utilizar este tipo de clases, aplicamos el patr�n Value Object o VO
// (Anteriormente conocidas como DTO Data Transfer Object) en el que representamos las entidades (Tablas) 
// de la base de datos, la tabla persona que creamos en MySql tiene los campos id, nombre, edad, profesi�n , tel�fono  entonces
// nuestra clase Vo tendr� estos mismos atributos y de esta manera podremos transportar un objeto persona con 
// todos estos valores por medio de los m�todos set y get de cada atributo.
//
//Este patr�n nos facilita enormemente el transporte de la informaci�n, evitando que se env�en gran
//cantidad de par�metros a un m�todo cuando queremos hacer un registro o actualizaci�n, tambi�n en caso de 
//que se modifique la tabla de la BD, nuestra clase deber� ser modificada as� como los m�todos que obtienen la 
//informaci�n, mas no los m�todos que la transportan.
public class PersonaVO {
	// definimos los atributos
	private Integer IdPersona;
	private String nombrePersona;
	private Integer edadPersona;
	private String profeciosPersona;
	private Integer telefonoPersona;

	// METODO CONSTRUCTOR con todos los atributos
	public PersonaVO(Integer idPersona, String nombrePersona, Integer edadPersona, String profeciosPersona,
			Integer telefonoPersona) {
		super();
		IdPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.edadPersona = edadPersona;
		this.profeciosPersona = profeciosPersona;
		this.telefonoPersona = telefonoPersona;
	}

	// GETTERS Y SETTERS
	public Integer getIdPersona() {
		return IdPersona;
	}

	public void setIdPersona(Integer idPersona) {
		IdPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Integer getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(Integer edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getProfeciosPersona() {
		return profeciosPersona;
	}

	public void setProfeciosPersona(String profeciosPersona) {
		this.profeciosPersona = profeciosPersona;
	}

	public Integer getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(Integer telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

}
