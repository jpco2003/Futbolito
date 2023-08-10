package com.distribuida.principal2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.JugadoresService;
import com.distribuida.entities.Jugadores;

public class PrincipalJugadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		JugadoresService jugadoresService = context.getBean("jugadoresServiceImpl",JugadoresService.class);
		List<Jugadores> jugadores = new ArrayList<Jugadores>();
		
		//Find All
		
		jugadoresService.findAll();
		jugadores = jugadoresService.findAll();
		//Find one
//		
//		jugadoresService.findOne(1);
//		//add
//		jugadoresService.add(0, "Nombre J", "ApellidoJ", "Dorsal","Edad", "Nacionalidad","Posicion", 0);
//		//up
//		jugadoresService.add(1, "Nombre J", "ApellidoJ", "Dorsal","Edad", "Nacionalidad","Posicion", 0);
//		//dell
//		jugadoresService.del(0);
		context.close();
	}

}
