package com.optica.crud.modelo;

public class DetalleOrden {

	private Integer iddetalleorden;
	private String nombre;
	private double cantidad;
	private double precio;
	private double total;

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

	@Override
	public String toString() {
		return "DetalleOrden [iddetalleorden=" + iddetalleorden + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + ", total=" + total + "]";
	}

	
	
	
}
