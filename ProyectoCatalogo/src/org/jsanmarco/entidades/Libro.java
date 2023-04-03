package org.jsanmarco.entidades;

import java.util.Date;

public class Libro extends Producto implements ILibro{
	private Date fechaPublicacion;
	private String autor;
	private String titulo;
	private String editorial;
	
	
	
	public Libro(Double precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
		super(precio);
		this.fechaPublicacion = fechaPublicacion;
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
	}
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.getPrecioVenta();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", fechaPublicacion =" + fechaPublicacion + ", autor =" + autor + ", titulo =" + titulo
				+ ", editorial =" + editorial;
	}

	
	
}
