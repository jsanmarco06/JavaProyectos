package entidades;

public class Automovil {

	private int id;
	private String marca;
	private double cilindrada;
	private Color color;
	private Tanque tanque;
	private Rueda[] ruedas;
	private Persona duenio;
	
	public static int velocidadFinal = 180;
	public static final String COLOR_PATENTE = "negro";
	private static int ultimoId;
	
	//constructors
	
	public Automovil() {
		super();
		this.id = ++ultimoId;
	}
	
	public Automovil(String marca, Color color) {
		this();
		this.marca = marca;
		this.color = color;
	}
	public Automovil(String marca, double cilindrada, Color color, Tanque tanque) {
		this(marca, color);
		this.cilindrada = cilindrada;
		this.tanque = tanque;
	}

	
	//
	public String imprimirInformacion() {
		String detalle = "Marca: " + this.marca + "  Color: " + this.color + "  Cilindrada: " + this.cilindrada;
		return detalle;
	}
	
	// getter y setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Tanque getTanque() {
		return tanque;
	}

	public void setTanque(Tanque tanque) {
		this.tanque = tanque;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public static int getVelocidadFinal() {
		return velocidadFinal;
	}

	public static void setVelocidadFinal(int velocidadFinal) {
		Automovil.velocidadFinal = velocidadFinal;
	}

	public static int getUltimoId() {
		return ultimoId;
	}

	public static void setUltimoId(int ultimoId) {
		Automovil.ultimoId = ultimoId;
	}

	public static String getColorPatente() {
		return COLOR_PATENTE;
	}
}
