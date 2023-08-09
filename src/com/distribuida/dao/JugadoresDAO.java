package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Jugadores;

public interface JugadoresDAO {

	public List<Jugadores> findAll();
	public Jugadores findOne(int id);
	public void add (Jugadores jugadores);
	public void up (Jugadores jugadores);
	public void del (int id);
	public void del (Jugadores jugadores);
	
}
