package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.distribuida.dto.JugadoresService;
import com.distribuida.entities.Jugadores;


@Controller
@RequestMapping("/jugadores")

public class JugadoresController {
	
	 @Autowired

	    private JugadoresService jugadoresService;
		
		
		 @GetMapping("/findAll")

		    public String finadAll(Model model) {

		        

		        List<Jugadores> jugadores = jugadoresService.findAll();

		        model.addAttribute("jugadoress", jugadores);

		        return "listar-jugadores";

		    }

}
