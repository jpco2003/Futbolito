package com.distribuida.entities;

public class Formativa {

	private int IdFormativa;
	private String Nombre;
	private String Direccion;
	private String Correo;
	private String Telefono;
	private Equipo equipo;
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
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	@Override
	public String toString() {
		return "Formativa [IdFormativa=" + IdFormativa + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Correo="
				+ Correo + ", Telefono=" + Telefono + ", equipo=" + equipo + "]";
	}
	public Formativa(int idFormativa, String nombre, String direccion, String correo, String telefono, Equipo equipo) {
		super();
		IdFormativa = idFormativa;
		Nombre = nombre;
		Direccion = direccion;
		Correo = correo;
		Telefono = telefono;
		this.equipo = equipo;
	}
	public Formativa() {}
}
