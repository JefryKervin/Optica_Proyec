package com.optica.crud.modelo;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@jakarta.persistence.Entity
@Table(name="ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idorden;
    private String numero;
    private Date fechcreacion;
    private Date fecharecibica;
    private double total;
    //
    @ManyToOne
    private Usuario usuario;
    
    //
    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;
 // contructor vacio
	public Orden() {
		//super();
	}

	// contructor con parametros
public Orden(int idorden, String numero, Date fechcreacion, Date fecharecibica, double total) {
	super();
	this.idorden = idorden;
	this.numero = numero;
	this.fechcreacion = fechcreacion;
	this.fecharecibica = fecharecibica;
	this.total = total;
}

// getters and setters
public int getIdorden() {
	return idorden;
}

public void setIdorden(int idorden) {
	this.idorden = idorden;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public Date getFechcreacion() {
	return fechcreacion;
}

public void setFechcreacion(Date fechcreacion) {
	this.fechcreacion = fechcreacion;
}

public Date getFecharecibica() {
	return fecharecibica;
}

public void setFecharecibica(Date fecharecibica) {
	this.fecharecibica = fecharecibica;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

@Override
public String toString() {
	return "Orden [idorden=" + idorden + ", numero=" + numero + ", fechcreacion=" + fechcreacion + ", fecharecibica="
			+ fecharecibica + ", total=" + total + ", usuario=" + usuario + "]";
}
    
    
    
}
