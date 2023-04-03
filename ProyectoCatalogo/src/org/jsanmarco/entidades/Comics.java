package org.jsanmarco.entidades;

import java.util.Date;

public abstract class Comics extends Libro{
	private String personaje;
	
	
	
	public Comics(Double precio, Date fechaPublicacion, String autor, String titulo, String editorial,
			String personaje) {
		super(precio, fechaPublicacion, autor, titulo, editorial);
		this.personaje = personaje;
	}
	public String getPersonaje() {
		return personaje;
	}
	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}


	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return super.getPrecioVenta();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", personaje = " + personaje;
	}
	
}
