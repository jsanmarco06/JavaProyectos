package org.jsanmarco.entidades;

public class Empleado extends Persona {
	private Double remuneracion;
	private int empleadoId;
	
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion,
			int empleadoId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.remuneracion = remuneracion;
		this.empleadoId = empleadoId;
	}
	
	public Double getRemuneracion() {
		return remuneracion;
	}
	public int getEmpleadoId() {
		return empleadoId;
	}
	public void setRemuneracion(Double remuneracion) {
		this.remuneracion = remuneracion;
	}
	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", Remuneracion " + remuneracion + ", Empleado Id " + empleadoId;
	}
	
	public int aumentarRemuneracion(double porcentaje){
		double aumento = (remuneracion * porcentaje) / 100;
		this.setRemuneracion(this.remuneracion + aumento);
		return (int) aumento;
	}
	
}
