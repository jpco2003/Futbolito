package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.distribuida.dto.FormativaService;
import com.distribuida.entities.Formativa;

@Controller
@RequestMapping("/formativa")

public class FormativaController {
	

    @Autowired

    private FormativaService formativaService;
	 @GetMapping("/findAll")

	    public String finadAll(Model model) {
	        List<Formativa> formativa = formativaService.findAll();
	        model.addAttribute("formativas", formativa);
	        return "listar-formativa";
	    }


}
