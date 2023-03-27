package temasDelCurso;

import javax.swing.JOptionPane;

public class BucleFor {

	public static void main(String[] args) {
		
		String[] nombres = {"Ale", "Fran","Juan", "Ana", "Lautaro","Agustin","Julian"};
		int count = nombres.length;
		String nombreABuscar = JOptionPane.showInputDialog("Ingrese un nombre a buscar (Puese ser Ale, Fran, Juan, Ana, Lautaro, Agustin, Julian)");
		
		for(int i = 0; i < count; i++) {
			if(nombres[i].equalsIgnoreCase(nombreABuscar)) {
				System.out.println("El nombre " + nombres[i] + " se encuntra en la posicion " + i);
			}
		}

	}

}
