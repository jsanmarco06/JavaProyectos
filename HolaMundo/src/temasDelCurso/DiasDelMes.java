package temasDelCurso;

public class DiasDelMes {

	public static void main(String[] args) {
		int numero = 3;
		
		if(numero == 11 ||  numero == 4 ||numero == 6 ||numero == 9 ) {
			System.out.println("el mes tiene 30 dias!");
		}
		else if(numero == 11 ||numero == 1 ||numero == 3 ||numero == 5 ||numero == 7 ||numero == 8 ||numero == 10 ||numero == 12) {
			System.out.println("el mes tiene 31 dias!");
		}
		else if(numero == 2) {
			System.out.println("el mes tiene 28 0 29 dias!");
		}
	}

}
