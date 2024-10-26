package com.optica.crud.controlador;


import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.optica.crud.modelo.Productos;
import com.optica.crud.modelo.Usuario;
import com.optica.crud.servicio.ProductosServicio;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	//creamos objeto tipo logger
	private final Logger LOGGER = LoggerFactory.getLogger(ProductosController.class);
	//implementacion en BD
	@Autowired
	private ProductosServicio productosservicio;
	//mapeo 
	@GetMapping("")
	public String vista() {
		return "productos/vista";
	}
	
	@GetMapping("/crear")
	public String crear() {
		return "productos/crear";
	}
	
	//metodo para mapear la info desde guardar
	@PostMapping("/save")
	public String save(Productos productos) {
		LOGGER.info("Este objeto es el producto{}", productos);
		Usuario u=new Usuario(1, "", "", "", "", "", "", "", null);
		productos.setUsuario(u);
		
		productosservicio.save(productos);
		return "redirect:/productos";
	}
	
}
