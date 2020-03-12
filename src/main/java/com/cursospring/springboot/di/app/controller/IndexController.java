package com.cursospring.springboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cursospring.springboot.di.app.models.service.IServicio;


@Controller
public class IndexController {
	
	@Autowired
	private IServicio servicio;
	
	
	@GetMapping({"/","", "/index"})
	public String index(Model model) {
		model.addAttribute("titulo", "Sin inyeccion de dependencia");
		model.addAttribute("operacion", servicio.operacion());
		return "index";
	}
	
	

}
