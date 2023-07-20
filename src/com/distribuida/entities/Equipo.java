package com.distribuida.entities;

public class Equipo {

	private	int IdEquipo;
	private	String Nombre;
	private	String NumJugadores;
	private	String Pratrocinadores;
	private	String Telefono;
	private	String Correo;
	private	String Pais;
	private Jugadores jugadores;
	public int getIdEquipo() {
		return IdEquipo;
	}
	public void setIdEquipo(int idEquipo) {
		IdEquipo = idEquipo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getNumJugadores() {
		return NumJugadores;
	}
	public void setNumJugadores(String numJugadores) {
		NumJugadores = numJugadores;
	}
	public String getPratrocinadores() {
		return Pratrocinadores;
	}
	public void setPratrocinadores(String pratrocinadores) {
		Pratrocinadores = pratrocinadores;
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
	public Jugadores getJugadores() {
		return jugadores;
	}
	public void setJugadores(Jugadores jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [IdEquipo=" + IdEquipo + ", Nombre=" + Nombre + ", NumJugadores=" + NumJugadores
				+ ", Pratrocinadores=" + Pratrocinadores + ", Telefono=" + Telefono + ", Correo=" + Correo + ", Pais="
				+ Pais + ", jugadores=" + jugadores + "]";
	}
	public Equipo(int idEquipo, String nombre, String numJugadores, String pratrocinadores, String telefono,
			String correo, String pais, Jugadores jugadores) {
		
		IdEquipo = idEquipo;
		Nombre = nombre;
		NumJugadores = numJugadores;
		Pratrocinadores = pratrocinadores;
		Telefono = telefono;
		Correo = correo;
		Pais = pais;
		this.jugadores = jugadores;
	}
	public Equipo() {}
	
}
