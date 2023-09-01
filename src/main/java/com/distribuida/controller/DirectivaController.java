package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
