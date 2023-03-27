package org.jsanmarco.entidades;

public class AlumnoInternacional extends Alumno{
	private String pais;
	private Double notaIdiomas;
	
	
	
	public AlumnoInternacional() {
		super();
		System.out.println("ejecutando el constructor de la clase alumno internacional sin parametros ");
	}
	
	public AlumnoInternacional(String nombre, String apellido, int edad, String email, String institucion,
			double notaMatematica, double notaCastellano, double notaHistoria, String pais, Double notaIdiomas) {
		super(nombre, apellido, edad, email, institucion, notaMatematica, notaCastellano, notaHistoria);
		this.pais = pais;
		this.notaIdiomas = notaIdiomas;
		System.out.println("ejecutando el constructor de la clase alumno internacional con parametros ");
	}


	public String getPais() {
		return pais;
	}
	public Double getNotaInternacional() {
		return notaIdiomas;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void setNotaIdiomas(Double notaIdiomas) {
		this.notaIdiomas = notaIdiomas;
	}


	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return super.saludar();
	}


	@Override
	public Double calcularPromedio() {
		// TODO Auto-generated method stub
		return (this.getNotaCastellano() + this.getNotaHistoria() + this.getNotaMatematica() + this.notaIdiomas) / 4;
	}
	
	
	
}
