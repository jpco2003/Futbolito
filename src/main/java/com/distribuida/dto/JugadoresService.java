package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Jugadores;

public interface JugadoresService {
	
	public List<Jugadores> findAll();
	public Jugadores findOne (int id);
	public void add (Jugadores jugadores);
	public void up (Jugadores jugadores);
	public void del(int id);
	
	public void add(int IdJugadores,String Nombre,String Apellido, String Dorsal,String Edad,String Nacionalidad,String Posicion, int idFormativa );
	public void up(int IdJugadores,String Nombre,String Apellido, String Dorsal,String Edad,String Nacionalidad,String Posicion, int idFormativa);
	
	public void imprimir (List <Jugadores> jugadoress);
}
