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
@Table(name="Patrocinadores")

public class Patrocinadores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "IdPatrocinadores")
	private	int IdPatrocinadores;
	
	@Column(name = "Nombre")
	private	String Nombre;
	
	@Column(name = "Telefono")
	private	String Telefono;
	
	@Column(name = "Correo")
	private	String Correo;
	
	@Column(name = "Pais")
	private	String Pais;
	
	@Autowired
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
	@JoinColumn(name = "DirectivaId")
	private Directiva directiva;
	
	public int getIdPatrocinadores() {
		
		return IdPatrocinadores;
	}
	public void setIdPatrocinadores(int idPatrocinadores) {
		IdPatrocinadores = idPatrocinadores;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public Directiva getDirectiva() {
		return directiva;
	}
	public void setDirectiva(Directiva directiva) {
		this.directiva = directiva;
	}
	@Override
	public String toString() {
		return "Patrocinadores [IdPatrocinadores=" + IdPatrocinadores + ", Nombre=" + Nombre + ", Telefono=" + Telefono
				+ ", Correo=" + Correo + ", Pais=" + Pais + ", directiva=" + directiva + "]";
	}
	public Patrocinadores(int idPatrocinadores, String nombre, String telefono, String correo, String pais,
			Directiva directiva) {
		super();
		IdPatrocinadores = idPatrocinadores;
		Nombre = nombre;
		Telefono = telefono;
		Correo = correo;
		Pais = pais;
		this.directiva = directiva;
	}
	public Patrocinadores() {
		super();
	}
	
}
