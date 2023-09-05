package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dto.DirectivaService;
import com.distribuida.dto.FormativaService;
import com.distribuida.entities.Directiva;
import com.distribuida.entities.Formativa;

@Controller
@RequestMapping("/directiva")


public class DirectivaController {
	 @Autowired
	 private DirectivaService directivaService;
	 
	 @Autowired
	 private FormativaService formativaService;
		
		 @GetMapping("/findAll")
		    public String finadAll(Model modelMap) {
		        List<Directiva> directiva = directivaService.findAll();
		        List<Formativa> formativa = formativaService.findAll();
		        modelMap.addAttribute("directivas", directiva);
		        modelMap.addAttribute("formativas", formativa);
		        return "listar-directiva";

		    }
		 
		 @GetMapping("/findOne")
		    public String findOne(@RequestParam("idDirectiva") @Nullable Integer idDirectiva, @RequestParam("opcion") @Nullable Integer opcion, Model model ) {

		        if(idDirectiva != null) {
		        	
		        	Directiva directiva = directivaService.findOne(idDirectiva);
		        	 model.addAttribute("directiva", directiva);
		        	
		        }
		        if(opcion==1) return "agregar-directiva";
		        
		        else return  "eliminar-directiva";

		     }
		 
		  @PostMapping("/add")
		    public String add(@RequestParam("idDirectiva") @Nullable Integer idDirectiva
		    		, @RequestParam("nombre") @Nullable String nombre
		    		, @RequestParam("apellido") @Nullable String apellido
		    		, @RequestParam("cargo") @Nullable String cargo
		    		, @RequestParam("correo") @Nullable String correo
		    		, @RequestParam("telefono") @Nullable String telefono
		    		, @RequestParam("direccion") @Nullable String direccion

		    		) {
		    	if(idDirectiva == null ) directivaService.add(0,nombre,apellido,cargo,correo,telefono,direccion,0);
		    	
		    	else directivaService.add(idDirectiva,nombre,apellido,cargo,correo,telefono,direccion,0);
		    	
		    	return "redirect:/directiva/findAll";
		    }
		  
		    @GetMapping("/del")
		    public String del(@RequestParam("idDirectiva") @Nullable Integer idDirectiva) {
		    	
		    	directivaService.del(idDirectiva);
		    	 
		    	return "redirect:/directiva/findAll";	   
		    	
		   }

}
