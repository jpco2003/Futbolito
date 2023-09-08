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
import com.distribuida.dto.PatrocinadoresService;
import com.distribuida.entities.Directiva;
import com.distribuida.entities.Formativa;
import com.distribuida.entities.Patrocinadores;


@Controller
@RequestMapping("/patrocinadores")

public class PatrocinadoresController {

	
	@Autowired

    private PatrocinadoresService patrocinadoresService;
	
	 @Autowired
	 private DirectivaService directivaService;
	
	 @GetMapping("/findAll")

	    public String finadAll(Model modelMap) {

	        

	        List<Patrocinadores> patrocinadores = patrocinadoresService.findAll();
	        List<Directiva> directiva = directivaService.findAll();
	        
	        modelMap.addAttribute("directivas", directiva);

	        modelMap.addAttribute("patrocinadoress", patrocinadores);

	        return "listar-patrocinadores";
	       

	    }
	 
	 @GetMapping("/findOne")
	    public String findOne(@RequestParam("idPatrocinadores") @Nullable Integer idPatrocinadores, @RequestParam("opcion") @Nullable Integer opcion, ModelMap modelMap ) {

	        if(idPatrocinadores != null) {
	        	
	        	Patrocinadores patrocinadores = patrocinadoresService.findOne(idPatrocinadores);
	        	Directiva directiva = directivaService.findOne(patrocinadores.getDirectiva().getIdDirectiva());

	        	modelMap.addAttribute("patrocinadores", patrocinadores);
	        	 modelMap.addAttribute("directiva", directiva);		        	 
	        	 modelMap.addAttribute("directivas", directivaService.findAll());

	        }
	        
	        else {
	        	
	        	 modelMap.addAttribute("directivas", directivaService.findAll());

	        	
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
	    		,@RequestParam("idDirectiva") @Nullable Integer idDirectiva
	    		
	    		
	    		
	    		
	    		) {
	    	if(idPatrocinadores == null ) patrocinadoresService.add(0,nombre,telefono,correo,pais,idDirectiva);
	    	
	    	else patrocinadoresService.add(idPatrocinadores,nombre,telefono,correo,pais,idDirectiva);
	    	
	    	return "redirect:/patrocinadores/findAll";
	    }
	  
	    @GetMapping("/del")
	    public String del(@RequestParam("idPatrocinadores") @Nullable Integer idPatrocinadores) {
	    	
	    	patrocinadoresService.del(idPatrocinadores);
	    	 
	    	return "redirect:/patrocinadores/findAll";	   
	    	
	   }
}
