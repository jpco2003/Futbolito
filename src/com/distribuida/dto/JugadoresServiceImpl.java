package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.JugadoresDAO;
import com.distribuida.dao.FormativaDAO;
import com.distribuida.entities.Jugadores;
import com.distribuida.entities.Formativa;

@Service
public class JugadoresServiceImpl implements JugadoresService{
	
	@Autowired
	private JugadoresDAO jugadoresDAO;
	
	@Autowired
	private FormativaDAO formativaDAO;
	
	
	@Override
	public List<Jugadores> findAll() {
		// TODO Auto-generated method stub
		return jugadoresDAO.findAll();
	}

	@Override
	public Jugadores findOne(int id) {
		// TODO Auto-generated method stub
		return jugadoresDAO.findOne(id);
	}

	@Override
	public void add(Jugadores Jugadores) {
		// TODO Auto-generated method stub
		jugadoresDAO.add(Jugadores);
		
	}

	@Override
	public void up(Jugadores Jugadores) {
		// TODO Auto-generated method stub
		jugadoresDAO.up(Jugadores);
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		jugadoresDAO.del(findOne(id));
		
	}

	@Override
	public void add(int IdJugadores,String Nombre, String Apellido, String Dorsal, String Edad,String Nacionalidad,String Posicion, int idFormativa) {
		// TODO Auto-generated method stub
		Formativa formativa = formativaDAO.findOne(idFormativa);
	
		
		Jugadores jugadores = new Jugadores(IdJugadores, Nombre, Apellido, Dorsal, Edad, Nacionalidad, Posicion);

		jugadores.setFormativa(formativa);
		
		jugadoresDAO.add(jugadores);
		
		
	}

	@Override
	public void up(int IdJugadores,String Nombre, String Apellido, String Dorsal, String Edad,String Nacionalidad,String Posicion, int idFormativa) {
		// TODO Auto-generated method stub
		Formativa formativa = formativaDAO.findOne(idFormativa);
	
		
		Jugadores jugadores = new Jugadores(IdJugadores, Nombre, Apellido, Dorsal, Edad, Nacionalidad, Posicion);

		jugadores.setFormativa(formativa);
		
		jugadoresDAO.up(jugadores);
		
		
	}
	@Override
	public void imprimir(List<Jugadores> jugadoress) {
		// TODO Auto-generated method stub
		jugadoress.forEach(item ->{
			System.out.println (item);
		});
		
	}


}
