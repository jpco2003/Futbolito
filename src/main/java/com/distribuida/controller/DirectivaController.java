package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.distribuida.dto.DirectivaService;
import com.distribuida.entities.Directiva;

@Controller
@RequestMapping("/directiva")


public class DirectivaController {
	 @Autowired

	    private DirectivaService directivaService;
		
		
		 @GetMapping("/findAll")

		    public String finadAll(Model model) {

		        

		        List<Directiva> directiva = directivaService.findAll();

		        model.addAttribute("directiva", directiva);

		        return "listar-directiva";

		    }

}
