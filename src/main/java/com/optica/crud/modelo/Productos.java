package com.optica.crud.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Productos {

	private int idproducto;
	private String nomprod;
	private double precio;
	private double cantidad;
	private double total;
	private String codbarras;
	private String nrolote;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	private Date fechaven;

	// contructor vacio
	public Productos() {
		// super();
	}

	// contructor con parametros
	public Productos(int idproducto, String nomprod, double precio, double cantidad, double total, String codbarras,
			String nrolote, Date fechaven) {
		// super();
		this.idproducto = idproducto;
		this.nomprod = nomprod;
		this.precio = precio;
		this.cantidad = cantidad;
		this.total = total;
		this.codbarras = codbarras;
		this.nrolote = nrolote;
		this.fechaven = fechaven;
	}

	// getters and setters
	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNomprod() {
		return nomprod;
	}

	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getCodbarras() {
		return codbarras;
	}

	public void setCodbarras(String codbarras) {
		this.codbarras = codbarras;
	}

	public String getNrolote() {
		return nrolote;
	}

	public void setNrolote(String nrolote) {
		this.nrolote = nrolote;
	}

	public Date getFechaven() {
		return fechaven;
	}

	public void setFechaven(Date fechaven) {
		this.fechaven = fechaven;
	}

	@Override
	public String toString() {
		return "Productos [idproducto=" + idproducto + ", nomprod=" + nomprod + ", precio=" + precio + ", cantidad="
				+ cantidad + ", total=" + total + ", codbarras=" + codbarras + ", nrolote=" + nrolote + ", fechaven="
				+ fechaven + "]";
	}

}