package tareas;

import javax.swing.JOptionPane;

public class Tarea6 {

	public static void main(String[] args) {
		int numeroMes =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes:"));
		int anio = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un año para saber los dias"));
		
		switch (numeroMes) {
		case 1:
			System.out.println(numeroMes + " es Enero");
			System.out.println("Tiene 31 dias");
			break;
		
		case 2:
			System.out.println(numeroMes + " es Febrero");
			if((anio % 400 == 0) || (anio % 4 == 0) || !(anio % 100 == 0)) {
				System.out.println( anio + " Tiene 29 dias");
			}
			else {
				System.out.println(anio + " Tiene 28 dias");
			}
			break;
			
		case 3:
			System.out.println(numeroMes + " es Marzo");
			System.out.println("Tiene 31 dias");
			break;
		
		case 4:
			System.out.println(numeroMes + " es Abril");
			System.out.println("Tiene 30 dias");
			break;
		case 5:
			System.out.println(numeroMes + " es Mayo");
			System.out.println("Tiene 31 dias");
			break;
		case 6:
			System.out.println(numeroMes + " es Junio");
			System.out.println("Tiene 30 dias");
			break;
		case 7:
			System.out.println(numeroMes + " es Julio");
			System.out.println("Tiene 31 dias");
			break;
		case 8:
			System.out.println(numeroMes + " es Agosto");
			System.out.println("Tiene 31 dias");
			break;
		case 9:
			System.out.println(numeroMes + " es Septiembre");
			System.out.println("Tiene 30 dias");
			break;
		case 10:
			System.out.println(numeroMes + " es Octubre");
			System.out.println("Tiene 31 dias");
			break;
		case 11:
			System.out.println(numeroMes + " es Noviembre");
			System.out.println("Tiene 30 dias");
			break;
		case 12:
			System.out.println(numeroMes + " es Diciembre");
			System.out.println("El mes tiene 31 dias");
			break;
		default:
			System.out.println("El numero no representa ningun mes");

		}
		
		if((anio % 400 == 0) || (anio % 4 == 0) || !(anio % 100 == 0)) {
			System.out.println("El año " + anio + " es Biciesto");
		}
		else {
			System.out.println("El año" + anio + " no es Biciesto");
		}
	}
}
