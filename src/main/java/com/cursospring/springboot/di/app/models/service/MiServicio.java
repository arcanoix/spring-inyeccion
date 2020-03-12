package com.cursospring.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
public class MiServicio implements IServicio{
	
	@Override
	public String operacion() {
		return "una operacion aplicada....";
	}

}
