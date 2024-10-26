package com.optica.crud.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

//atritbutos
public class Usuario {
	private int idusuario;
	private String nombre;
	private String apellido;
	private String email;
	private String dni;
	private String direccion;
	private String telefono;
	private String contraseña;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	private Date fechanacimc;

	// constructor vacio
	public Usuario() {
		// super();
	}

	// constructor con parametros
	public Usuario(int idusuario, String nombre, String apellido, String email, String dni, String direccion,
			String telefono, String contraseña, Date fechanacimc) {
		// super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.contraseña = contraseña;
		this.fechanacimc = fechanacimc;
	}

	// getters and setters
	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Date getFechanacimc() {
		return fechanacimc;
	}

	public void setFechanacimc(Date fechanacimc) {
		this.fechanacimc = fechanacimc;
	}

	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono + ", contraseña=" + contraseña
				+ ", fechanacimc=" + fechanacimc + "]";
	}

	
	
}
