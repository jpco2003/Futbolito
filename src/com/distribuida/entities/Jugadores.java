package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Jugadores")

public class Jugadores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "IdJugadores")
	private int IdJugadores;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "Apellido")
	private String Apellido;
	
	@Column(name = "Dorsal")
	private String Dorsal;
	
	@Column(name = "Edad")
	private String Edad;
	
	@Column(name = "Nacionalidad")
	private String Nacionalidad;
	
	@Column(name = "Posicion")
	private String Posicion;
	
	@Autowired
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
	@JoinColumn(name = "FormativaId")
	private Formativa formativa;
	
	public int getIdJugadores() {
		
		return IdJugadores;
	}
	public void setIdJugadores(int idJugadores) {
		IdJugadores = idJugadores;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDorsal() {
		return Dorsal;
	}
	public void setDorsal(String dorsal) {
		Dorsal = dorsal;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public String getPosicion() {
		return Posicion;
	}
	public void setPosicion(String posicion) {
		Posicion = posicion;
	}
	public Formativa getFormativa() {
		return formativa;
	}
	public void setFormativa(Formativa formativa) {
		this.formativa = formativa;
	}
	@Override
	public String toString() {
		return "Jugadores [IdJugadores=" + IdJugadores + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Dorsal="
				+ Dorsal + ", Edad=" + Edad + ", Nacionalidad=" + Nacionalidad + ", Posicion=" + Posicion
				+ ", formativa=" + formativa + "]";
	}
	public Jugadores(int idJugadores, String nombre, String apellido, String dorsal, String edad, String nacionalidad,
			String posicion) {
		super();
		IdJugadores = idJugadores;
		Nombre = nombre;
		Apellido = apellido;
		Dorsal = dorsal;
		Edad = edad;
		Nacionalidad = nacionalidad;
		Posicion = posicion;
		
	}

	
}
