package com.distribuida.entities;

public class Formativa {

	private int IdFormativa;
	private String Nombre;
	private String Direccion;
	private String Correo;
	private String Telefono;
	public int getIdFormativa() {
		return IdFormativa;
	}
	public void setIdFormativa(int idFormativa) {
		IdFormativa = idFormativa;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
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
	@Override
	public String toString() {
		return "Formativa [IdFormativa=" + IdFormativa + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Correo="
				+ Correo + ", Telefono=" + Telefono + "]";
	}
	public Formativa(int idFormativa, String nombre, String direccion, String correo, String telefono) {
		super();
		IdFormativa = idFormativa;
		Nombre = nombre;
		Direccion = direccion;
		Correo = correo;
		Telefono = telefono;
	}
	public Formativa() {
		super();
	}
	
}
