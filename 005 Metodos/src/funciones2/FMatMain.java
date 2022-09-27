//PARA PRACTICAR EL DEPURADOR


package funciones2;

import java.util.Scanner;


public class FMatMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(FMatNum.voltea(-123456789));
		System.out.println(FMatNum.voltea2(123456789));
		System.out.println(FMatNum.esCapicua(12344321));
		System.out.println(FMatNum.digitos(123456789));
		System.out.println(FMatNum.digitoN(123456789, 6));
		System.out.println(FMatNum.digitoN2(123456789, 6));	
		System.out.println(FMatNum.posicionDeDigito(12345678, 2));
		System.out.println(FMatNum.quitaPorDetras(12345678, 6));
		System.out.println(FMatNum.quitaPorDelante(1234560000, 3));		
		System.out.println(FMatNum.pegaPorDetras(1234, 56789));
		System.out.println(FMatNum.pegaPorDelante(5678, 1234));
		System.out.println(FMatNum.trozoDeNumero(123456789, 4, 7)); //4 y 7 incluidos
	}
	
	//CTRL + Space + "method" = create method
	//Al no poner public se asume que es eso por defecto
	//Como es una biblioteca mejor un estatico
	

	public static String leer(Scanner teclado) {
		return teclado.nextLine();
	}
	
	public static long toLong (String nS) {
		return Long.parseLong(nS);
	}
	
	//MENU
	public static int menu(Scanner teclado) {
		int opcion;
		
		System.out.println("1.- voltea");
		System.out.println("2.- esCapicua");
		System.out.println("3.- digitos");
		System.out.println("4.- digitoN");
		System.out.println("5.- posicionDeDigito");
		System.out.println("6.- quitaPorDetras");
		System.out.println("7.- quitaPorDelante");
		System.out.println("8.- pegaPorDetras");
		System.out.println("9.- pegaPorDelante");
		System.out.println("10.- trozoDeNumero");
		
		return opcion = teclado.nextInt();
	}
	
	
}