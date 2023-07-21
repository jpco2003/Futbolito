package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Directiva;



public class Principaldirectiva {

	public static void main(String[] args) {

		//ApplicationContext
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
		Directiva directiva = context.getBean("directiva",Directiva.class);
		
		directiva.setIdDirectiva(0);
		directiva.setNombre(null);
		directiva.setApellido(null);
		directiva.setCargo(null);
		directiva.setCorreo(null);
		directiva.setTelefono(null);
		directiva.setDireccion(null);
		
		
		context.close();
	}

}
