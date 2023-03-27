package org.jsanmarco.entidades;

public class Profesor extends Persona {
	private String asignatura;

	public Profesor() {
		super();
		System.out.println("ejecutando el constructor de la clase profesor sin parametros ");
	}

	public Profesor(String nombre, String apellido, int edad, String email, String asignatura) {
		super(nombre, apellido, edad, email);
		this.asignatura = asignatura;
		System.out.println("creando el profesor!");
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return super.saludar() + "Soy el Profesor de la asignatura " + this.asignatura;
	}
	
	
	
}
