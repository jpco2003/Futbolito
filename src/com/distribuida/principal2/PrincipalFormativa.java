package com.distribuida.principal2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.FormativaService;
import com.distribuida.entities.Formativa;

public class PrincipalFormativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");

	
		FormativaService formativaService = context.getBean("formativaServiceImpl",FormativaService.class);
		List<Formativa> formativa1 = new ArrayList<Formativa>();
		
		
		//Find All
//		formativaService.imprimir(formativa1);
//		formativa1 = formativaService.findAll();
		//Find one
		
//		//add
		formativaService.add(0,"denis","pifa","Correo@hotmail.com","0995865960");
//		//up
//		formativaService.up(0,"Nombre","Direccion","Correo@hotmail.com","0995865960");
//		//dell
//		formativaService.del(0);
		context.close();
	}

}
