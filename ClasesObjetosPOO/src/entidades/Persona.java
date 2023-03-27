package entidades;

public class Persona {
	private String nombre;
	private String apellido;
	
	// construction
	public Persona() {
		super();
	}
	public Persona(String nombre, String apellido) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	// getter y setter
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
	
}
