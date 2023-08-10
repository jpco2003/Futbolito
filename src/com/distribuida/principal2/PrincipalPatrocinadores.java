package com.distribuida.principal2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.PatrocinadoresService;
import com.distribuida.entities.Patrocinadores;

public class PrincipalPatrocinadores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		;	
		PatrocinadoresService patrocinadoresService = context.getBean("patrocinadoresServiceImpl",PatrocinadoresService.class);
		List<Patrocinadores> patrocinadores2 = new ArrayList<Patrocinadores>();
		
		
		// Find All
		patrocinadores2 = patrocinadoresService.findAll();
		patrocinadoresService.imprimir(patrocinadores2);
		
		
//		// Find one
//		patrocinadoresService.findOne(0);
//		// add
//		patrocinadoresService.add(0, "Nombre", "0995865960", "Correo@hotmail.com", "Pais", 0);
//		// up
//		patrocinadoresService.add(1, "Nombre", "0995865960", "Correo@hotmail.com", "Pais", 0);
//		// dell
//		patrocinadoresService.del(1);
		context.close();
	}
}