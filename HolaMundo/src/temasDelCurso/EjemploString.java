package temasDelCurso;

public class EjemploString {

	public static void main(String[] args) {
		
		String stringUno = "curso java";
		String stringDos = new String("hola");
		String stringTres = new String("Curso Java");
		
		System.out.println("String 1: "+ stringUno);
		System.out.println("String 2: "+ stringDos);
		
		//length()
		System.out.println("largo de String 1: "+ stringUno.length());
		System.out.println("largo de String 2: "+ stringDos.length());
		
		// String metodo equals
		boolean sonIguales = stringUno.equals(stringDos);
		System.out.println("son iguales? " + sonIguales);
		
		//String equalsIgnoreCase no distingue mayusculas de minusculas
		boolean sonIguales2 = stringUno.equalsIgnoreCase(stringTres);
		System.out.println("son iguales? " + sonIguales2);
		
		
		//caracter en un indice
		char caracter  = stringUno.charAt(3);
		System.out.println("caracter de la posicion 3 =  " + caracter);
		 

	}

}
