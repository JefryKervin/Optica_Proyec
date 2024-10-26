package com.optica.crud.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.optica.crud.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {

}
