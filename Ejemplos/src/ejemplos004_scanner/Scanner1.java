package ejemplos004_scanner;

import java.util.Scanner;


public class Scanner1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		
		//Si no queremos hacer el import de import java.util.Scanner;
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		//Es como sustituir "Scanner" = "java.util.Scanner"
		
		
		String nombre;
		double radio;
		int n;
		
		
		System.out.print("Introduzca su nombre: ");
		nombre = sc.nextLine(); //leer un String/linea
		System.out.println("Hola " + nombre + "!!!");
		
		System.out.print("Introduzca el radio de la circunferencia: ");
		radio = sc.nextDouble(); //leer un double
		System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio); //clase Math
		
		System.out.print("Introduzca un numero entero: ");
		n = sc.nextInt(); //leer un entero
		sc.nextLine();
		//guarda el /n del entero para poder leer strings a continuación
		//pero lo mas adecuado es limpiar el buffer
		System.out.println("El area del cuadrado es: " + Math.pow(n,2)); //clase Math
		
		
		System.out.print("Introduzca otro nombre: ");
		nombre = sc.nextLine(); //leer un String/linea
		System.out.println("Hola " + nombre + "!!!");
		//Si pones este bloque sin previamente poner sc.nextLine(); te lee un /n 
		//que estaba antes guardado al introducir el numero
		
		sc.close();
	}
}