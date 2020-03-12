package com.cursospring.springboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cursospring.springboot.di.app.models.domain.Factura;

@RequestMapping("/factura")
@Controller
public class FacturaController {

	@Autowired
	private Factura factura;
	
	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("factura", factura);
		model.addAttribute("titulo","ejemplo factura con inyeccion dependencia");
		
		return "factura/ver";
	}
}
