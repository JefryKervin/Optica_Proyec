	package com.optica.crud.controlador;

import java.io.IOException;

import java.util.Optional;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.optica.crud.model.Productos;
import com.optica.crud.model.Usuario;
import com.optica.crud.servicio.ProductosServicio;

import org.springframework.ui.Model;

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
	public String vista(Model model ) {
		model.addAttribute("productos",productosservicio.findAll());
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
	
	@GetMapping("/edit/{id}")
	public String edi(@PathVariable Integer id, Model model) {
		Productos productos=new Productos();
		Optional<Productos> optionalProductos=productosservicio.get(id);
		productos = optionalProductos.get();
		LOGGER.info("Producto buscado: ",productos);
		model.addAttribute("productos","productos");
		return "productos/edit";
	}
	@PostMapping("/update")
	public String update(Productos productos) {
		productosservicio.update(productos);
		return "redirect:/productos";
	}
	
}
