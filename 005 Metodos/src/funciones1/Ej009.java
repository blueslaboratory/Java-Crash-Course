//9.- Crea un aplicaci�n que nos convierta una cantidad de 
//euros introducida por teclado a otra moneda, estas pueden 
//ser dolares, yenes o libras. El m�todo tendr� como par�metros, 
//la cantidad de euros y la moneda a pasar que ser� una cadena. 
//Haz dos versiones del programa:
//
//El m�todo no devolver� ning�n valor, mostrar� 
//un mensaje indicando el cambio (void).
//El m�todo devolver� un valor que indica el cambio 
//y este se mostrar� en el programa principal.
//El cambio de divisas es:
//�	0.86 libras es un 1 �
//�	1.28611 $ es un 1 �
//�	129.852 yenes es un 1 �


package funciones1;

import java.util.Scanner;
//Te autocompleta el import al crear el objeto Scanner

public class Ej009 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String euros;
		int opcion;
		
		System.out.print("Euros: ");
		euros = sc.nextLine();
		
		
		
		do {
			opcion = menu(sc);
			
			switch(opcion) {
			case 1:
				euros_libras(euros);
				break;
			case 2:
				euros_dolar(euros);
				break;
			case 3:
				euros_yen(euros);
				break;
			default:
				System.out.println("Introduzca una opcion valida\n");
				break;
			}
		} while(opcion<1 || opcion>3);
		
		
		sc.close();
	}
	
	public static int menu(Scanner teclado) {
		int opcion;
		System.out.println("Introduzca el numero de la opcion de la operacion: ");
		System.out.println("1. Euros a libras");
		System.out.println("2. Euros a dolares");
		System.out.println("3. Euros a yenes");
		System.out.print("\nOpcion: ");
		opcion = teclado.nextInt();
		
		return opcion;
	}
	
	public static float euros_libras(String euros) {
		float libras = 0.86F*Float.parseFloat(euros);
		System.out.println(euros +" euros = " +libras +" libras");
		return libras;
	}
	
	public static float euros_dolar(String euros) {
		float dolar = 1.28611F*Float.parseFloat(euros);
		System.out.println(euros +" euros = " +dolar +" dolares");
		return dolar;
	}
	
	public static float euros_yen(String euros) {
		float yen = 129.852F*Float.parseFloat(euros);
		System.out.println(euros +" euros = " +yen +" yenes");
		return yen;
	}
	
}
