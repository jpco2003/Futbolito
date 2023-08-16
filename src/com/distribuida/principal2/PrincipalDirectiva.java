package com.distribuida.principal2;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dto.DirectivaService;
import com.distribuida.entities.Directiva;

public class PrincipalDirectiva {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");

	DirectivaService directivaService = context.getBean("directivaServiceImpl",DirectivaService.class);
	List<Directiva> directivas = new ArrayList<Directiva>();
	
	//Find All
//	directivas = directivaService.findAll();
//	directivaService.imprimir(directivas);
//	//Find one
//	directivaService.findOne(0);
//	//add
	directivaService.add(0, "juan", "carrion", "dt", "jpcrrion19",  "95865960" , "Direccion", 0);
//	//up
//	directivaService.add(0, "Nombre", "Apellido", "Cargo", "Cargo",  "95865960" , "Direccion", 0);
//	//dell
//	directivaService.add(0, "Nombre", "Apellido", "Cargo", "Cargo",  "95865960" , "Direccion", 0);
	
	context.close();
}
}
