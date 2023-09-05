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

import com.distribuida.dto.PatrocinadoresService;
import com.distribuida.entities.Directiva;
import com.distribuida.entities.Patrocinadores;


@Controller
@RequestMapping("/patrocinadores")

public class PatrocinadoresController {

	
	@Autowired

    private PatrocinadoresService patrocinadoresService;
	
	
	 @GetMapping("/findAll")

	    public String finadAll(Model model) {

	        

	        List<Patrocinadores> patrocinadores = patrocinadoresService.findAll();

	        model.addAttribute("patrocinadoress", patrocinadores);

	        return "listar-patrocinadores";

	    }
	 
	 @GetMapping("/findOne")
	    public String findOne(@RequestParam("idPatrocinadores") @Nullable Integer idPatrocinadores, @RequestParam("opcion") @Nullable Integer opcion, Model model ) {

	        if(idPatrocinadores != null) {
	        	
	        	Patrocinadores patrocinadores = patrocinadoresService.findOne(idPatrocinadores);
	        	 model.addAttribute("patrocinadores", patrocinadores);
	        	
	        }
	        if(opcion==1) return "agregar-patrocinadores";
	        
	        else return  "eliminar-patrocinadores";

	     }
	 
	  @PostMapping("/add")
	    public String add(@RequestParam("idPatrocinadores") @Nullable Integer idPatrocinadores
	    		, @RequestParam("nombre") @Nullable String nombre
	    		, @RequestParam("telefono") @Nullable String telefono
	    		, @RequestParam("correo") @Nullable String correo
	    		, @RequestParam("pais") @Nullable String pais
	    		
	    		) {
	    	if(idPatrocinadores == null ) patrocinadoresService.add(0,nombre,telefono,correo,pais,0);
	    	
	    	else patrocinadoresService.add(idPatrocinadores,nombre,telefono,correo,pais,0);
	    	
	    	return "redirect:/patrocinadores/findAll";
	    }
	  
	    @GetMapping("/del")
	    public String del(@RequestParam("idPatrocinadores") @Nullable Integer idPatrocinadores) {
	    	
	    	patrocinadoresService.del(idPatrocinadores);
	    	 
	    	return "redirect:/patrocinadores/findAll";	   
	    	
	   }
}
