package com.optica.crud.modelo;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="detalles")
public class DetalleOrden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddetalleorden;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;

	
	
	///
	@OneToOne
	private Orden orden;
	
	//
	@ManyToOne
	private Productos producto;
	
	// contructor vacio
	public DetalleOrden() {
		// super();
	}

	// contructor con parametros
	public DetalleOrden(Integer iddetalleorden, String nombre, double cantidad, double precio, double total) {
		// super();
		this.iddetalleorden = iddetalleorden;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	// getters and setters
	public Integer getIddetalleorden() {
		return iddetalleorden;
	}

	public void setIddetalleorden(Integer iddetalleorden) {
		this.iddetalleorden = iddetalleorden;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	
	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetalleOrden [iddetalleorden=" + iddetalleorden + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + ", total=" + total + "]";
	}

	
	
	
}
