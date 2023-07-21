package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Jugadores;

public class Principaljugadores {

	public static void main(String[] args) {
		
		//ApplicationContext
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Jugadores jugadores = context.getBean("jugadores",Jugadores.class);
		
		
		jugadores.setIdJugadores(0);
		jugadores.setNombre(null);
		jugadores.setApellido(null);
		jugadores.setDorsal(null);
		jugadores.setEdad(null);
		jugadores.setNacionalidad(null);
		jugadores.setPosicion(null);
		
		
		
		
		context.close();
	}

}
