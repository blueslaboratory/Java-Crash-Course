//################################################################################
//Realizar un ejemplo de menu, donde podemos escoger las distintas opciones hasta 
//que seleccionamos la opcion de "Salir".
//################################################################################
//Analisis
//La realizacion del menu la hacemos con un bucle repetir y una alternativa "segun"
//En el bucle se realiza las siguientes acciones:
// * Mostrar el menu con las distintas opciones
// * Leer opcion
// * Segun opcion ejecutamos las instrucciones necesarias.
// * En otro caso (opcion incorrecta): Mostramos opcion incorrecta
// La opcion de "salir" la podemos dejar vacia (no ejecutar ninguna instruccion).
// Se repetir el bucle hasta que elijamos la opcion de salir.
// Datos de entrada: opcion
// Informacion de salida: Segun la opcion escogida
// Variables: opcion(entero)
//################################################################################



package repaso;

import java.util.Scanner;


public class Ej019Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			//limpiar pantalla
			System.out.println("Menu de recomendaciones");
			System.out.println("   1. Literatura");
			System.out.println("   2. Cine");
			System.out.println("   3. Musica");
			System.out.println("   4. Videojuegos");
			System.out.println("   5. Salir");
			System.out.print("Elija una opcion (1-5): ");
			opcion = sc.nextInt();
			
			switch (opcion){
			case 1:
				System.out.println("Lecturas recomendables:");
				System.out.println(" + Esperandolo a Tito y otros cuentos de futbol (Eduardo Sacheri)");
				System.out.println(" + El juego de Ender (Orson Scott Card)");
				System.out.println(" + El sueño de los heroes (Adolfo Bioy Casares)");
                break;
			case 2:
				System.out.println("Peliculas recomendables:");
				System.out.println(" + Matrix (1999)");
				System.out.println(" + El ultimo samuray (2003)");
				System.out.println(" + Cars (2006)");
                break;
			case 3:
				System.out.println("Discos recomendables:");
				System.out.println(" + Despedazado por mil partes (La Renga, 1996)");
				System.out.println(" + Bufalo (La Mississippi, 2008)");
				System.out.println(" + Gaia (Mago de Oz, 2003)");
	            break;
			case 4:
				System.out.println("Videojuegos clasicos recomendables");
				System.out.println(" + Dia del tentaculo (LucasArts, 1993)");
				System.out.println(" + Terminal Velocity (Terminal Reality/3D Realms, 1995)");
				System.out.println(" + Death Rally (Remedy/Apogee, 1996)");
                break;
			case 5:
				System.out.println("Gracias, vuelva pronto");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
			
			System.out.println("Presione enter para continuar");
	        //Esperar Tecla;
		
		
		} while (opcion!=5);
		
		
		sc.close();
		
		
	}
	
}

