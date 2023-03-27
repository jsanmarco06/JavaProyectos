package tareas;

import javax.swing.JOptionPane;

public class Tarea5 {

	public static void main(String[] args) {
		String nombreMes = (JOptionPane.showInputDialog(null, "Ingrese el mes:")).toLowerCase();
		
		switch (nombreMes) {
		case "enero":
			System.out.println(nombreMes + " es 1");
			System.out.println("el mes tiene 31 dias");
			break;
		
		case "febrero":
			System.out.println(nombreMes + " es 2");
			int anio = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un año para saber los dias"));
			if((anio % 400 == 0) || (anio % 4 == 0) || !(anio % 100 == 0)) {
				System.out.println("este año tiene 29 dias");
			}
			else {
				System.out.println("este año tiene 28 dias");
			}
			break;
			
		case "marzo":
			System.out.println(nombreMes + " es 3");
			System.out.println("el mes tiene 31 dias");
			break;
		
		case "abril":
			System.out.println(nombreMes + " es 4");
			System.out.println("el mes tiene 30 dias");
			break;
		case "mayo":
			System.out.println(nombreMes + " es 5");
			System.out.println("el mes tiene 31 dias");
			break;
		case "junio":
			System.out.println(nombreMes + " es 6");
			System.out.println("el mes tiene 30 dias");
			break;
		case "julio":
			System.out.println(nombreMes + " es 7");
			System.out.println("el mes tiene 31 dias");
			break;
		case "agosto":
			System.out.println(nombreMes + " es 8");
			System.out.println("el mes tiene 31 dias");
			break;
		case "septiembre":
			System.out.println(nombreMes + " es 9");
			System.out.println("el mes tiene 30 dias");
			break;
		case "octubre":
			System.out.println(nombreMes + " es 10");
			System.out.println("el mes tiene 31 dias");
			break;
		case "noviembre":
			System.out.println(nombreMes + " es 11");
			System.out.println("el mes tiene 30 dias");
			break;
		case "diciembre":
			System.out.println(nombreMes + " es 12");
			System.out.println("el mes tiene 31 dias");
			break;
		default:
			System.out.println("El numero no representa ningun mes");
		

		}
	}
}
