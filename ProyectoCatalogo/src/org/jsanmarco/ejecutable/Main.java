package org.jsanmarco.ejecutable;

import org.jsanmarco.entidades.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IProducto [] productos = new Producto[6];
		productos[0] = new TvLcd(60000.00, "Sony", 40);
		productos[1] = new IPhone(150000.00, "Apple", "13 pro", "Dorado");
		productos[2] = new Libro(20500.00, null, "Jose Hernandez", "Martin Fierro", "--");
		productos[3] = new IPhone(220000.00, "Apple", "13 pro max", "Verde");
		productos[4] = new TvLcd(50000.00, "Samsumg", 32);
		productos[5] = new Libro(4000.00, null, "Antonie de Saint", "El Principito", "el gato de hojalata");
		
		for(int i = 0; i < 6; i++) {
			System.out.println(productos[i].toString());
		}
		
	}

}
