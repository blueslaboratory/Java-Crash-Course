package ejemplos008_metodos;

import java.util.Scanner;

public class MetodoSumasLeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2;
		int suma;
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Numero 1: ");
//		n1 = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("Numero 2: ");
//		n2 = Integer.parseInt(sc.nextLine());
		
		
		//Llamando al metodo leerInteger
		//Le pasas el objeto scanner
		n1 = leerInt("Numero 1: ", sc);
		n2 = leerInt("Numero 2: ", sc);
		
		
		//Llamando al metodo sumas
		System.out.println("Suma = " + sumas(n1, n2));
		suma = sumas(n1, n2);
		
		
		//Llamando al metodo tabla de multiplicar
		tabla(leerInt("Numero de la tabla de multiplicar: ", sc));
		//tabla(6);
		
		sc.close();	
	}
	
	
	//METODO LEER INT
	public static int leerInt(String msg, Scanner teclado) {
		//Pasamos el objeto de tipo Scanner como parametro
		
		int lectura;
		
		System.out.print(msg);
		lectura = Integer.parseInt(teclado.nextLine());
		
		return lectura;
	}
	
	
	//METODO SUMAS
	public static int sumas(int num1, int num2) {
		int resultado = num1+num2;
		return resultado;
	}
	
	
	//METODO TABLA MULTIPLICAR
	public static void tabla(int operador) {
		
		int t;
	
		for(t=1; t<=10; t++) {
			System.out.println(operador +"*" +t +" = " +operador*t);
		}
		return;
	}
	
}
