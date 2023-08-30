package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.distribuida.dto.PatrocinadoresService;
import com.distribuida.entities.Patrocinadores;


@Controller
@RequestMapping("/patrocinadores")

public class PatrocinadoresController {

	
	@Autowired

    private PatrocinadoresService patrocinadoresService;
	
	
	 @GetMapping("/findAll")

	    public String finadAll(Model model) {

	        

	        List<Patrocinadores> patrocinadores = patrocinadoresService.findAll();

	        model.addAttribute("patrocinadores", patrocinadores);

	        return "listar-patrocinadores";

	    }
}
