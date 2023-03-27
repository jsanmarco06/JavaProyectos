package org.jsanmarco.entidades;

public class Gerente extends Empleado{
	private Double presupuesto;
	
	public Gerente() {
		super();
	}

	public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion,
			int empleadoId, Double presupuesto) {
		super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
		this.presupuesto = presupuesto;
	}

	public Double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", Presupuesto " + presupuesto;
	}
	
}
