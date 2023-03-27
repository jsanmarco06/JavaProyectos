package temasDelCurso;

public class Operaciones {

	public static void main(String[] args) {
		int x = 5 + 10;
		int suma = x + 20; //35
		int multiplicacion = suma * 2; //35 * 2 = 70
		int resta = suma - x; // 35 - 15 = 20
		double division = (float)(70) / (float)(20); // 3,5 
		float division2 = 70 / 20; //  3.00, debido a que los numeros tambien deben ser float 
		int modulo = 124 % 15; // 4, es el resto de una division ej 15 * 8 = 120 mas 4 que es un resto = 124
		
		System.out.println(x);
		System.out.println(suma);
		
		++x; // incrementa en 1 
		--suma;// decrementa en 1 
		
		System.out.println(x);
		System.out.println(suma);
		System.out.println(multiplicacion);
		System.out.println(resta);
		System.out.println(division);
		System.out.println(division2);
		System.out.println(modulo);
	}

}
