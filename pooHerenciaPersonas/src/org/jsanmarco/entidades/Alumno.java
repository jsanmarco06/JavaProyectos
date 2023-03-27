package org.jsanmarco.entidades;

public class Alumno extends Persona{
	private String institucion;
	private double notaMatematica;
	private double notaCastellano;
	private double notaHistoria;
	
	
	
	public Alumno() {
		super();
		System.out.println("ejecutando el constructor de la clase alumno sin parametros ");
	}


	public Alumno(String nombre, String apellido, int edad, String email, String institucion, double notaMatematica,
			double notaCastellano, double notaHistoria) {
		super(nombre, apellido, edad, email);
		this.institucion = institucion;
		this.notaMatematica = notaMatematica;
		this.notaCastellano = notaCastellano;
		this.notaHistoria = notaHistoria;
		System.out.println("ejecutando el constructor de la clase alumno con parametros ");
	}
	
	
	public String getInstitucion() {
		return institucion;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public double getNotaCastellano() {
		return notaCastellano;
	}
	public double getNotaHistoria() {
		return notaHistoria;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public void setNotaCastellano(double notaCastellano) {
		this.notaCastellano = notaCastellano;
	}
	public void setNotaHistoria(double notaHistoria) {
		this.notaHistoria = notaHistoria;
	}


	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return super.saludar() + "Soy el Alumno de la institucion " + this.institucion;
	}
	
	public Double calcularPromedio() {
		return (this.notaCastellano + this.notaHistoria + this.notaMatematica) / 3;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + 
				"\ninstitucion = " + this.institucion +
				 "\nnota matematica = " + this.notaMatematica +
				  "\nnota castellano= " + this.notaHistoria +
				   "\nnota historia= " + this.notaCastellano +
				    "\nnota promedio= " + this.calcularPromedio() ;
	}
	
	
	
}
