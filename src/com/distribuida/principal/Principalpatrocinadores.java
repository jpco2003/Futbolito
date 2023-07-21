package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Patrocinadores;

public class Principalpatrocinadores {

	public static void main(String[] args) {

		//ApplicationContext
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
		Patrocinadores patrocinadores = context.getBean("patrocinadores",Patrocinadores.class);	
		
		patrocinadores.setIdPatrocinadores(0);
		patrocinadores.setNombre(null);
		patrocinadores.setTelefono(null);
		patrocinadores.setCorreo(null);
		patrocinadores.setPais(null);
		patrocinadores.setDirectiva(null);
		
		
		context.close();
		
	}	
}
