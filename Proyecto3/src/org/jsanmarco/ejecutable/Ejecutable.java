package org.jsanmarco.ejecutable;

import org.jsanmarco.entidades.Fruta;
import org.jsanmarco.entidades.Lacteo;
import org.jsanmarco.entidades.Limpieza;
import org.jsanmarco.entidades.NoPerecible;
import org.jsanmarco.entidades.Producto;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lacteo queso = new Lacteo("Queso", 600.00, 25, 15);
		Lacteo leche = new Lacteo("Leche", 800.00, 1, 12);
		
		Fruta manzana = new Fruta("Manzana", 250.00,2.5,"Roja");
		Fruta banana = new Fruta("Banana", 350.00,4.0,"Amarilla");
		
		Limpieza skip = new Limpieza("Jabon Liquido", 680.00, "jabon, amoniaco",3.00);
		Limpieza mopa = new Limpieza("Mopa", 1500.00, "palo, trapo y balde",5.00);
		
		NoPerecible sal = new NoPerecible("Sal", 350.00, 100, 10);
		NoPerecible cafe = new NoPerecible("Cafe", 650.00, 220, 20);
		
		Producto[] productos = {queso, leche, manzana, banana, skip, mopa ,sal, cafe};
		
		System.out.println("Productos: ");
		for(int i = 0; i < 8 ; i++) {
			System.out.println(productos[i].toString());
		}
	}

}
