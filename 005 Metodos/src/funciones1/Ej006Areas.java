//6.- Crea una aplicaci�n que nos calcule el �rea de un c�rculo, 
//cuadrado o un tri�ngulo. Pediremos de qu� figura queremos calcular 
//su �rea (nos dar�n una de las tres) y seg�n lo introducido pedir� 
//los valores necesarios para calcular el �rea. Crea un m�todo por 
//cada figura para calcular cada �rea que devolver� un n�mero real 
//como valor del �rea. Muestra el resultado por pantalla. A�ade un 
//men� para mejorar el ejercicio. En el men� habr� una opci�n de 
//salir para poder terminar el programa.
//Datos para el c�lculo del �rea de cada figura:
//�	Circulo: (radio^2)*PI
//�	Triangulo: (base * altura) / 2
//�	Cuadrado: lado * lado


package funciones1;

import java.util.Scanner;
//Te autocompleta el import al crear el objeto Scanner

public class Ej006Areas {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2;
		int opcion, seleccion;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			opcion = menu(sc);
			
			if (opcion != 4) {
				
				switch(opcion) {
					case 1:
						num1 = leer("Dime el radio: ", sc);
						System.out.println("Area circulo = " +circulo(num1));
						break;
					case 2:
						num1 = leer("Dime la base: ", sc);
						num2 = leer("Dime la altura: ", sc);
						System.out.println("Area triangulo = " +triangulo(num1,num2));						
						break;
					case 3:
						num1 = leer("Dime el lado: ", sc);
						System.out.println("Area cuadrado = " +cuadrado(num1));
						break;
					default:
						break;
				}
			}
			
		} while(opcion!=4);
		
		
		sc.close();

	}
	
	public static float leer(String msg, Scanner teclado) {
		System.out.print(msg);
		return Float.parseFloat(teclado.nextLine());
	}
	
	
	public static int menu(Scanner sc) {
		int opcion;
		
		
		System.out.println("\nMenu: ");
		System.out.println("1. Area circulo");
		System.out.println("2. Area triangulo");
		System.out.println("3. Area cuadrado");
		System.out.println("4. Salir");
		
		do {
			System.out.print("Introduzca el numero de la opcion: ");
			opcion = Integer.parseInt(sc.nextLine());
			
			if (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4) {
//			if (opcion<1 || opcion>4) {
				System.out.println("ERROR. Introduzca un valor valido, por ejemplo: 3");
			}
			
		} while(opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4);
//		} while(opcion<1 || opcion>4)
//		Recuerda que las condiciones ejecutan mientras son true por eso es &&
		
		return opcion;
	}
	
	
	public static float circulo(float r) {
		final float PI = 3.14F;
		float area = 2*PI*r;
		return area;
	}
	
	
	public static float triangulo(float b, float a) {
		float area=(b*a)/2;
		return area;
	}
	
	public static float cuadrado(float l) {
		float area=l*l;
		return area;
	}

	
}
