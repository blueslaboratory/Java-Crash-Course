//5.- Escribe una aplicaci�n en java que le pida al usuario que 
//escriba el nombre de una operaci�n en java entre las siguientes: 
//suma, resta, multiplicaci�n y divisi�n. En caso de introducir 
//una distinta se le comunicar� el error y se pedir� de nuevo la operaci�n.
//
//Con una instrucci�n switch, dise�a un men� que en funci�n de cu�l 
//sea la operaci�n elegida ejecutar� una de las cuatro funciones que 
//escribir�s para llevar a cabo la operaci�n (sumar(float, float), 
//multiplicar(float, float), restar(float, float), dividir(float, float)). 
//Cada funci�n de las anteriores recibir� los dos operadores y devolver� 
//al programa principal el resultado, desde donde se imprimir�. 
//En el men� habr� una opci�n de salir para poder terminar el programa.

//Intentos fallidos: 1 
//He tenido que mirar otros ejercicios para resolverlo

package funciones1;

import java.util.Scanner;
//Te autocompleta el import al crear el objeto Scanner

public class Ej005MenuOp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2;
		String opcion;
		Scanner sc = new Scanner(System.in);
		
		do {
						
			opcion = menu(sc);
			
			
			if (!opcion.equals("salir")) {
				
				num1 = leer("Dime N1: ", sc);
				num2 = leer("Dime N2: ", sc);
				
				switch(opcion) {
					case "suma":
						System.out.println("Suma: " +suma(num1,num2) +"\n");
						break;
					case "resta":
						System.out.println("Resta: " +resta(num1,num2) +"\n");						
						break;
					case "multiplicacion":
						System.out.println("Multiplicacion: " +multi(num1,num2) +"\n");
						break;
					case "division":
						System.out.println("Division: " +div(num1,num2) +"\n");
						break;
					default:
						break;
				}
			}
			
			
			
		} while(opcion.compareTo("salir")!=0);
		
		
		sc.close();

	}
	
	public static float leer(String msg, Scanner teclado) {
		System.out.print(msg);
		return Float.parseFloat(teclado.nextLine());
	}
	
	public static String menu(Scanner teclado) {
		String nombre;
		
		do {
			System.out.println("Dime el nombre de la operacion por escrito sin acentos: ");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("5. Salir");
			
			System.out.print("\nOperacion: ");
			nombre = (teclado.nextLine()).toLowerCase();
			
			if (nombre.compareTo("suma")!=0 &&
				nombre.compareTo("resta")!=0 &&
				!nombre.equals("multiplicacion") &&
				!nombre.equals("division") &&
				!nombre.equals("salir")){
				System.out.println("ERROR. Introduzca un valor valido, por ejemplo: suma");
			}
			//Recuerda que las condiciones ejecutan mientras son true por eso es &&
			
		} while(nombre.compareTo("suma")!=0 &&
				nombre.compareTo("resta")!=0 &&
				!nombre.equals("multiplicacion") &&
				!nombre.equals("division") &&
				!nombre.equals("salir"));
		return nombre;
	}
	
	public static float suma(float num1, float num2) {
		//System.out.println("Suma: " +(num1+num2));
		return (num1+num2);
	}
	
	public static float resta(float num1, float num2) {
		//System.out.println("Resta: " +(num1-num2));		
		return (num1-num2);
	}
	
	public static float multi(float num1, float num2) {
		//System.out.println("Multiplicacion: " +(num1*num2));		
		return (num1*num2);
	}
	
	public static float div(float num1, float num2) {
		//System.out.println("Division: " +(num1/num2));
		return (num1/num2);
	}
	
}
