package com.distribuida.entities;

public class Directiva {

	private int IdDirectiva;
	private String Nombre;
	private String Apellido;
	private String Cargo;
	private String Correo;
	private String Telefono;
	private String Direccion;
	private Formativa formativa;
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
	@Override
	public String toString() {
		return "Directiva [IdDirectiva=" + IdDirectiva + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Cargo="
				+ Cargo + ", Correo=" + Correo + ", Telefono=" + Telefono + ", Direccion=" + Direccion + ", formativa="
				+ formativa + "]";
	}
	public Directiva(int idDirectiva, String nombre, String apellido, String cargo, String correo, String telefono,
			String direccion, Formativa formativa) {
		super();
		IdDirectiva = idDirectiva;
		Nombre = nombre;
		Apellido = apellido;
		Cargo = cargo;
		Correo = correo;
		Telefono = telefono;
		Direccion = direccion;
		this.formativa = formativa;
	}
	public Directiva() {
		super();
	}
	
}
