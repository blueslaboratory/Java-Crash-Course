package ejercicios3_fichSerializable2Sol;

import java.util.Scanner;

public class AgendaApp {
	
	
	private final static String FICHERO = "agenda.dat";
	
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int n=0;
		do{
			System.out.print("Escribe el numero de la opcion que quieras:" + "\n"
					+ "\n 1.Anadir contacto."
					+ "\n 2.Buscar contacto."
					+ "\n 3.Modificar contacto."
					+ "\n 4.Eliminar contacto."
					+ "\n 5.Ordenar contactos."
					+ "\n 6.Mostrar contactos."
					+ "\n 0.Consultar contactos eliminados y salir.\n ");
			
			n = Integer.parseInt(scan.nextLine());
			System.out.println();
			switch (n){
				case 1:	agenda.alta(FICHERO, scan);
						break;
				case 2:	agenda.buscarContacto(FICHERO, scan);
						break;
				case 3: agenda.modificaContacto(FICHERO, scan);
						break;
				case 4: agenda.eliminaContacto(FICHERO, scan);
						break;
				case 5: agenda.ordenarContactos(FICHERO);
						break;
				case 6: agenda.mostrarContactos(FICHERO);
						break;
				case 0:	System.out.println("Lista de contactos eliminados:");
						agenda.salir();
						System.out.println("Adios");
						break;
				default: System.out.println("Opcion no contemplada.");
						 break;
			}
		}while (n!=0);
	}
}
