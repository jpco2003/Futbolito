package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dto.FormativaService;
import com.distribuida.entities.Formativa;

@Controller
@RequestMapping("/formativa")

public class FormativaController {
	

    @Autowired
    private FormativaService formativaService;
    
	 @GetMapping("/findAll")
	    public String finadAll(Model model) {
	        List<Formativa> formativas = formativaService.findAll();
	        model.addAttribute("formativas", formativas);
	        return "listar-formativa";
	    }
	 
	 @GetMapping("/findOne")
	    public String findOne(@RequestParam("idFormativa") @Nullable Integer idFormativa, @RequestParam("opcion") @Nullable Integer opcion, Model model ) {

	        if(idFormativa != null) {
	        	
	        	Formativa formativa = formativaService.findOne(idFormativa);
	        	 model.addAttribute("formativa", formativa);
	        	
	        }
	        if(opcion==1) return "agregar-formativa";
	        
	        else return  "eliminar-formativa";

	     }
	 
	  @PostMapping("/add")
	    public String add(@RequestParam("idFormativa") @Nullable Integer idFormativa
	    		, @RequestParam("nombre") @Nullable String nombre
	    		, @RequestParam("direccion") @Nullable String direccion
	    		, @RequestParam("correo") @Nullable String correo
	    		, @RequestParam("telefono") @Nullable String telefono
	    		, @RequestParam("logo") @Nullable String logo

	    		) {
	    	if(idFormativa == null ) formativaService.add(0,nombre,direccion,correo,telefono,logo);
	    	
	    	else formativaService.add(idFormativa,nombre,direccion,correo,telefono,logo);
	    	
	    	return "redirect:/formativa/findAll";
	    }
	  
	    @GetMapping("/del")
	    public String del(@RequestParam("idFormativa") @Nullable Integer idFormativa) {
	    	
	    	formativaService.del(idFormativa);
	    	 
	    	return "redirect:/formativa/findAll";	   
	    	
	   }
}


