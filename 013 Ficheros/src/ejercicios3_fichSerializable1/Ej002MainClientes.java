/*
2.- Se trata de hacer una aplicacion en Java que gestione los 
clientes de una empresa. Los datos de los clientes, se almacenaran 
en un fichero serializado, denominado clientes.dat.
Los datos que se almacenaran sobre cada cliente son:
	- NIF.
	- Nombre.
	- Telefono.
	- Direccion.
	- Deuda. 

Mediante un menu se podran realizar determinadas operaciones:
Anadir cliente. Esta opcion pedira los datos del cliente y anadira 
el registro correspondiente en el fichero.
Listar clientes. Recorrera el fichero mostrando los clientes almacenados 
en el mismo.
Buscar clientes. Pedira al usuario el nif del cliente a buscar, y 
comprobara si existe en el fichero, mostrando sus datos.
Borrar cliente. Pedira al usuario el nif del cliente a borrar, y si existe, 
lo borrara del fichero.
Borrar fichero de clientes completamente. Elimina del disco el fichero clientes.dat
Salir de la aplicacion.

*/

package ejercicios3_fichSerializable1;

import java.io.File;
import java.util.Scanner;

public class Ej002MainClientes {
	final static String NOM_FICH = "clientes.dat";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej002ListaClientes listaClientes = new Ej002ListaClientes();
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		File f1 = new File(NOM_FICH);
		
		do {
			opcion = menu(sc);
			
			// Cargamos los clientes
			if(f1.exists())
				listaClientes.leerFichero();
			
			switch (opcion) {
			case 1:
				listaClientes.addCliente(sc);
				listaClientes.guardarFichero();
				break;
			case 2:
				listaClientes.printClientes();
				break;
			case 3:
				listaClientes.buscaCliente(sc);
				break;
			case 4:
				listaClientes.borraCliente(sc);
				listaClientes.guardarFichero();
				break;
			case 5:
				System.out.println((listaClientes.borrarFichero()) ? 
				"El fichero se ha borrado" : "No se ha podido borrar el fichero");
				break;
			case 6:
				break;
				
			default:
				System.out.println("Introduzca una opcion valida");
				break;
			}
			
		} while (opcion!=6);
		
	}
	
	public static int menu(Scanner sc) {
		int opcion;
		
		System.out.println("\n**************MENU**************");
		System.out.println("\t1. Anadir cliente");
		System.out.println("\t2. Listar clientes");
		System.out.println("\t3. Buscar cliente");
		System.out.println("\t4. Borrar cliente");
		System.out.println("\t5. Borrar fichero de clientes");
		System.out.println("\t6. Salir de la aplicacion");
		
		System.out.print("Opcion (1-6): ");
		opcion = Integer.parseInt(sc.nextLine());
		
		return opcion;
		
	}

}