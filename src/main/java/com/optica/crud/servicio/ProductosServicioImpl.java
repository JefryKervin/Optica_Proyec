package com.optica.crud.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optica.crud.model.Productos;
import com.optica.crud.repositorio.ProductosRepository;


@Service
public class ProductosServicioImpl implements ProductosServicio{
	//aplicamos la inyeccion de dependencia...
	@Autowired ProductosRepository productosRepository;

	@Override
	public Productos save(Productos productos) {
		//// metodo guardar
		return productosRepository.save(productos);
	}//fin del metodo

	@Override
	public Optional<Productos> get(Integer id) {
		//// metodo buscar
		return productosRepository.findById(id);
	}//fin del metodo

	@Override
	public void update(Productos productos) {
		//// metodo actualizar
		productosRepository.save(productos);
		
	}//fin del metodo

	@Override
	public void delete(Integer id) {
		//// metodo eliminar
		productosRepository.deleteById(id);
	}//fin del metodo

	@Override
	public List<Productos> findAll() {
		// metodo listar
		return productosRepository.findAll();
	}

	
		
	

	
}
