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
@Table(name="Directiva")

public class Directiva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "IdDirectiva")
	private int IdDirectiva;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	@Column(name = "Apellido")
	private String Apellido;
	
	@Column(name = "Cargo")
	private String Cargo;
	
	@Column(name = "Correo")
	private String Correo;
	
	@Column(name = "Telefono")
	private String Telefono;
	
	@Column(name = "Direccion")
	private String Direccion;
	
	
	@Autowired
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
	@JoinColumn(name = "FormativaId")
	private Formativa formativa;
	
	public Directiva() {
		
	}
	
	public int getIdDirectiva() {
		return IdDirectiva;
	}
	public void setIdDirectiva(int idDirectiva) {
		IdDirectiva = idDirectiva;
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
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public Formativa getFormativa() {
		return formativa;
	}
	public void setFormativa(Formativa formativa) {
		this.formativa = formativa;
	}
	
	public Directiva (Formativa formativa) {
		this.formativa = formativa;
	}
	
	@Override
	public String toString() {
		return "Directiva [IdDirectiva=" + IdDirectiva + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Cargo="
				+ Cargo + ", Correo=" + Correo + ", Telefono=" + Telefono + ", Direccion=" + Direccion + ", formativa="
				+ formativa + "]";
	}
	public Directiva(int idDirectiva, String nombre, String apellido, String cargo, String correo, String telefono,
			String direccion) {
		
		IdDirectiva = idDirectiva;
		Nombre = nombre;
		Apellido = apellido;
		Cargo = cargo;
		Correo = correo;
		Telefono = telefono;
		Direccion = direccion;
	}
	
	
	
}
