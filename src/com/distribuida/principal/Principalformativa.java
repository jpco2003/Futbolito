package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.entities.Formativa;

public class Principalformativa {

	public static void main(String[] args) {
		
		//ApplicationContext
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Formativa formativa = context.getBean("formativa",Formativa.class);
		
		formativa.setIdFormativa(0);
		formativa.setNombre(null);
		formativa.setDireccion(null);
		formativa.setCorreo(null);
		formativa.setTelefono(null);
		
		

		context.close();
	}

}
