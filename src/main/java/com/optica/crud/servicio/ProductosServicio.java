package com.optica.crud.servicio;

import java.util.Optional;

import com.optica.crud.modelo.Productos;

public interface ProductosServicio {

	public Productos save(Productos productos);
	public Optional<Productos> get(Integer id);
	public void update(Productos productos);
	public void delete(Integer id);
}
