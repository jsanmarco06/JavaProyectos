package org.jsanmarco.entidades;

public class Persona {
	private String nombre;
	private String apellido;
	private String numeroFiscal;
	private String direccion;
	
	
	public Persona() {
		super();
	}
	public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroFiscal = numeroFiscal;
		this.direccion = direccion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getNumeroFiscal() {
		return numeroFiscal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setNumeroFiscal(String numeroFiscal) {
		this.numeroFiscal = numeroFiscal;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	@Override
	public String toString() {
		return "Nombre= " + nombre + ", Apellido= " + apellido + ", NumeroFiscal= " + numeroFiscal
				+ ", Direccion= " + direccion;
	}
	
}
