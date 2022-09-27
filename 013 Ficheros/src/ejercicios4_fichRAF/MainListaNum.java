/*
1. Utilizando las clases de acceso directo a ficheros, realiza un programa 
que le muestre al usuario un menu con las siguientes opciones:

a. Anadir numeros de tipo double al principio del fichero.
b. Anadir numeros de tipo double al final del fichero.
c. Mostrar el fichero creado.
d. Sustituir un numero indicado por el usuario por otro numero que tambien 
te indique el usuario.
e. Ordenar los numeros en el fichero descendentemente (ayudate de un ArrayList).

Nota: Un double en JAVA ocupa 8 bytes (en Java 8 existe un metodo para obtener 
el tamano). 

*/

package ejercicios4_fichRAF;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainListaNum {
	
	public static void main(String[] args) {
		
		String NOM_FICH = "numeros.txt";
		File f = new File(NOM_FICH);
		
		ListaNum lista = new ListaNum(f);
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		double n, s;
		
		do {
			opcion = menu(sc);
			
			switch(opcion) {
			case 1:
				n = ListaNum.introNum("Numero: ", sc);
				lista.addFirst(n);
				break;
			case 2:
				n = ListaNum.introNum("Numero: ", sc);
				lista.addLast2(n);
				break;
			case 3:
				lista.printFile();
				break;
			case 4:
				n = ListaNum.introNum("Numero a sustituir: ", sc);
				s = ListaNum.introNum("Sustitucion: ", sc);
				lista.sustituir(n, s);
				break;
			case 5: 
				lista.ordenar();
				break;
			case 6:
				break;
			default:
				System.out.println("Introduzca una opcion valida");
				break;
			}
			
		} while(opcion!=6);
		
		
		//Cerrando el raf
		try {
			if(lista.getRaf() != null)
				lista.getRaf().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static int menu(Scanner sc) {
		int opcion = -1;
		
		System.out.println("\n********MENU********");
		System.out.println("1. Anadir numeros de tipo double al principio del fichero.");
		System.out.println("2. Anadir numeros de tipo double al final del fichero.");
		System.out.println("3. Mostrar el fichero creado.");
		System.out.println("4. Sustituir un numero indicado por el usuario.");
		System.out.println("5. Ordenar los numeros en el fichero descendentemente");
		System.out.println("6. Salir");
		System.out.println();
		
		System.out.print("Opcion (1-6): ");
		
		try {
			opcion = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {	}		
		return opcion;
		
	}
}