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

import com.distribuida.dto.FormativaService;
import com.distribuida.dto.JugadoresService;
import com.distribuida.entities.Formativa;
import com.distribuida.entities.Jugadores;


@Controller
@RequestMapping("/jugadores")

public class JugadoresController {
	
	 @Autowired

	    private JugadoresService jugadoresService;
	 
	 @Autowired
	 private FormativaService formativaService;
	 
		
		
		 @GetMapping("/findAll")

		    public String finadAll(Model modelmap) {

		        

		        List<Jugadores> jugadores = jugadoresService.findAll();
		        List<Formativa> formativa = formativaService.findAll();

		        modelmap.addAttribute("jugadoress", jugadores);
		        modelmap.addAttribute("formativas", formativa);

		        return "listar-jugadores";

		    }
		 @GetMapping("/findOne")
		    public String findOne(@RequestParam("idJugadores") @Nullable Integer idJugadores, @RequestParam("opcion") @Nullable Integer opcion, ModelMap modelMap ) {

		        if(idJugadores != null) {
		        	
		        	Jugadores jugadores = jugadoresService.findOne(idJugadores);
		        	Formativa formativa = formativaService.findOne(jugadores.getFormativa().getIdFormativa());

		        	modelMap.addAttribute("jugadores", jugadores);
		        	modelMap.addAttribute("formativa", formativa);
		        	 
		        	 modelMap.addAttribute("formativas", formativaService.findAll());
		        	
		        }
		        
		        else {
		        	
		        	 modelMap.addAttribute("formativas", formativaService.findAll());

		        	
		        }
		        
		        if(opcion==1) return "agregar-jugadores";
		        
		        else return  "eliminar-jugadores";

		     }
		 
		  @PostMapping("/add")
		    public String add(@RequestParam("idJugadores") @Nullable Integer idJugadores
		    		, @RequestParam("nombre") @Nullable String nombre
		    		, @RequestParam("apellido") @Nullable String apellido
		    		, @RequestParam("dorsal") @Nullable String dorsal
		    		, @RequestParam("edad") @Nullable String edad
		    		, @RequestParam("nacionalidad") @Nullable String nacionalidad
		    		, @RequestParam("posicion") @Nullable String posicion
		    		
		    		, @RequestParam("idFormativa") @Nullable Integer idFormativa
		    		) {
		    	if(idJugadores == null ) jugadoresService.add(0,nombre,apellido,dorsal,edad,nacionalidad,posicion,idFormativa);
		    	
		    	else jugadoresService.add(idJugadores,nombre,apellido,dorsal,edad,nacionalidad,posicion,idFormativa);
		    	
		    	return "redirect:/jugadores/findAll";
		    }
		  
		    @GetMapping("/del")
		    public String del(@RequestParam("idJugadores") @Nullable Integer idJugadores) {
		    	
		    	jugadoresService.del(idJugadores);
		    	 
		    	return "redirect:/jugadores/findAll";	   
		    	
		   }
}
