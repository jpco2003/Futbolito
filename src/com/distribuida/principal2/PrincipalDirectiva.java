package com.distribuida.principal2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.DirectivaService;
import com.distribuida.entities.Directiva;

public class PrincipalDirectiva {

	ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	
	DirectivaService directivaService = context.getBean("DirectivaServiceImpl",DirectivaService.class);
	
	
	//Find All
	
	//Find one
	
	//add
	
	//up
	
	//dell
	
}
