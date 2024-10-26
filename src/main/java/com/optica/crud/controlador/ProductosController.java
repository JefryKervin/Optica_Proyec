package com.optica.crud.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	
	@GetMapping("")
	public String vista() {
		return "productos/vista";
	}
}
