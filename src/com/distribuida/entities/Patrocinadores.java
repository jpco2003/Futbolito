package com.distribuida.entities;

public class Patrocinadores {

	private	int IdPatrocinadores;
	private	String Nombre;
	private	String Telefono;
	private	String Correo;
	private	String Pais;
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
