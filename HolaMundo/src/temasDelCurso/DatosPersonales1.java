package temasDelCurso;

import javax.swing.JOptionPane;

public class DatosPersonales1 {
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
		String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido:");
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad:"));
		String lugarDeResidencia = JOptionPane.showInputDialog(null, "Ingrese su Lugar De Residencia:");
		
		JOptionPane.showMessageDialog(null, "SUS DATOS:\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nLugar De Residencia: " + lugarDeResidencia);
		System.out.println("SUS DATOS:\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nLugar De Residencia: " + lugarDeResidencia);
	}
}
