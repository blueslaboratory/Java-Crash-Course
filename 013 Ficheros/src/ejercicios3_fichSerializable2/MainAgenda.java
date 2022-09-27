/*
Escribe un programa que permita almacenar en un fichero serializable 
una agenda telefonica. Cada registro de la agenda debera contener los 
siguientes datos: Nombre, Apellidos, Nº de Telefono, E-mail. 

El programa debera permitir las siguientes operaciones, mediante un menu:

a) Leer los datos de un nuevo registro (dar de alta), almacenandolo en el fichero. 
b) Buscar una persona de la agenda leyendo de teclado su nombre y apellidos. 
Se visualizaran los datos de la persona. 
c) Modificar el telefono y/o e_mail de una persona que se pedira por teclado 
(por su nombre y apellido). 
d) Eliminar una persona de la agenda telefonica dando su nombre y apellidos. 
Todas las personas que se eliminen del fichero binario, se guardaran en un 
fichero de texto, llamado Eliminados.txt, en el que se guardara un registro 
por linea. 
e) Ordenar el fichero alfabeticamente por nombre y apellido
f) Mostrar el contenido del fichero
g) Finalmente, cuando se salga del menu, se escribira en consola el contenido 
del fichero de texto Eliminados.txt.

*/

package ejercicios3_fichSerializable2;

import java.io.File;
import java.util.Scanner;

public class MainAgenda {	
	
	public static void main(String[] args) {
		String NOM_FICH = "agenda.txt";
		String NOM_FICH2 = "eliminados.txt";
		
		Agenda agenda = new Agenda();
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		File f1 = new File(NOM_FICH);
		File f2 = new File(NOM_FICH2);
		
		do {
			opcion = menu(sc);
			
			// Cargamos los contactos
			agenda.leerFichero(NOM_FICH, NOM_FICH2);
			
			switch(opcion) {
			case 1:
				agenda.addContacto(sc);
				agenda.guardarFichero(NOM_FICH, agenda.getAgenda());
				break;
			case 2:
				agenda.buscaContacto(sc);
				break;
			case 3:
				agenda.modContacto(sc);
				if(f1.exists())
					agenda.guardarFichero(NOM_FICH, agenda.getAgenda());
				break;
			case 4:
				agenda.borraContacto(sc);
				if(f1.exists()) {
					agenda.guardarFichero(NOM_FICH, agenda.getAgenda());
					agenda.guardarFichero(NOM_FICH2, agenda.getEliminados());				
				}
				break;
			case 5: 
				agenda.ordenarContactos();
				if(f1.exists()) 
					agenda.guardarFichero(NOM_FICH, agenda.getAgenda());
				break;
			case 6:
				agenda.printAgenda();
				break;
			case 7:
				break;	
			default:
				System.out.println("Introduzca una opcion valida");
				break;
			}
			
		} while(opcion!=7);
		
		agenda.leerFichero(NOM_FICH, NOM_FICH2);
		agenda.printEliminados();
	}
	
	
	public static int menu(Scanner sc) {
		int opcion = -1;
		
		System.out.println("\n**************MENU**************");
		System.out.println("\t1. Crear contacto");
		System.out.println("\t2. Buscar contacto");
		System.out.println("\t3. Modificar telefono/email");
		System.out.println("\t4. Eliminar contacto");
		System.out.println("\t5. Ordenar contactos alfabeticamente");
		System.out.println("\t6. Mostrar contactos en la agenda");
		System.out.println("\t7. Salir de la aplicacion");
		System.out.println();
		
		System.out.print("Opcion (1-7): ");
		
		try {
			opcion = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {	}		
		return opcion;
		
	}

}