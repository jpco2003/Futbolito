package com.distribuida.entities;

public class Jugadores {
	private int IdJugadores;
	private String Nombre;
	private String Apellido;
	private String Edad;
	private String Nacionalidad;	
	private String Pie;
	private String Tiro;
	private String Velocidad;
	private String Talento;
	private String Defensa;
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
	public String getPie() {
		return Pie;
	}
	public void setPie(String pie) {
		Pie = pie;
	}
	public String getTiro() {
		return Tiro;
	}
	public void setTiro(String tiro) {
		Tiro = tiro;
	}
	public String getVelocidad() {
		return Velocidad;
	}
	public void setVelocidad(String velocidad) {
		Velocidad = velocidad;
	}
	public String getTalento() {
		return Talento;
	}
	public void setTalento(String talento) {
		Talento = talento;
	}
	public String getDefensa() {
		return Defensa;
	}
	public void setDefensa(String defensa) {
		Defensa = defensa;
	}
	public Formativa getFormativa() {
		return formativa;
	}
	public void setFormativa(Formativa formativa) {
		this.formativa = formativa;
	}
	@Override
	public String toString() {
		return "Jugadores [IdJugadores=" + IdJugadores + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad="
				+ Edad + ", Nacionalidad=" + Nacionalidad + ", Pie=" + Pie + ", Tiro=" + Tiro + ", Velocidad="
				+ Velocidad + ", Talento=" + Talento + ", Defensa=" + Defensa + ", formativa=" + formativa + "]";
	}
	public Jugadores(int idJugadores, String nombre, String apellido, String edad, String nacionalidad, String pie,
			String tiro, String velocidad, String talento, String defensa, Formativa formativa) {
		
		IdJugadores = idJugadores;
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		Nacionalidad = nacionalidad;
		Pie = pie;
		Tiro = tiro;
		Velocidad = velocidad;
		Talento = talento;
		Defensa = defensa;
		this.formativa = formativa;
	}
	public Jugadores() {}
}
