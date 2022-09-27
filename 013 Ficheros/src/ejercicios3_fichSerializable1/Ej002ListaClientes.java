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

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Ej002ListaClientes implements Serializable{
	final static String NOM_FICH = "clientes.dat";
	
	ArrayList<Ej002Cliente> listaClientes = null;
	//esto se suele asignar en un constructor
	
	// CONSTRUCTOR
	public Ej002ListaClientes() {
		listaClientes = new ArrayList<Ej002Cliente>();
	}
	
	public void setListaClientes(ArrayList<Ej002Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


	// Guardar fichero
	public void guardarFichero() {
		try {
			// Este programa funcionara
			// tanto si ya existe el fichero, como si se crea de nuevo
			// Para ello pregunta si existe el fichero y si no existe
			// usa la clase que no anade cabecera
			// Si existe usara la otra clase (FileOutputStream)
			File f = new File(NOM_FICH);

			if (f.exists() && f.length() > 0) {// si existe y tiene algo
				Ej002ClaseOutput co = new Ej002ClaseOutput(new FileOutputStream(f, true));
				co.writeObject(listaClientes);
				co.close();
			} else {
				// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectOutputStream.html
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(listaClientes);
				oos.close();
			}
			
			System.out.println("Se ha guardado el fichero");
			
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	
	// Borrar fichero
	public boolean borrarFichero() {
		File f = new File(NOM_FICH);
		return f.delete();
	}
	
	
	// Leer fichero
	public void leerFichero() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {
			try {
				while (true) // ois.available()>0
					listaClientes = (ArrayList<Ej002Cliente>) ois.readObject();
			} catch (EOFException e) {}
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	
	// 1. Anadir cliente
	public void addCliente(Scanner sc) {
		String NIF, nombre, tel, dir;
		float deuda = -1;
		
		System.out.println("Introduzca los datos del cliente");
		System.out.print("NIF: ");
		NIF = sc.nextLine();
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Telefono: ");
		tel = sc.nextLine();
		System.out.print("Direccion: ");
		dir = sc.nextLine();
		
		do {
			try {
				System.out.print("Deuda: ");
				deuda = Float.parseFloat(sc.nextLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
				deuda = -1;
			}
		} while(deuda==-1);
				
		
		listaClientes.add(new Ej002Cliente(NIF, nombre, tel, dir, deuda));
		System.out.println("\nEl cliente se ha anadido");
	}
	public Ej002Cliente getCliente(int index) {
		return listaClientes.get(index);
	}
	
	
	// 2. Listar clientes
	public void printClientes() {

		Iterator<Ej002Cliente> it = listaClientes.iterator();
		int cont = 1;
		
		System.out.println();
		System.out.println("********************************");
		System.out.println("LISTA DE CLIENTES EN LA LIBRETA");
		
		while(it.hasNext()) {
			System.out.print(cont +" ");
			System.out.println(it.next());
			cont++;
		}
		
	}
	
	
	// 3. Buscar cliente
	public void buscaCliente(Scanner sc) {
		Ej002Cliente c;
		String NIF;
		boolean flag = false;
		
		System.out.print("NIF: ");
		NIF = sc.nextLine(); 
		
		// curioso: no hace falta busquedaSecuencial para evitar la excepcion
		Iterator<Ej002Cliente> it = listaClientes.iterator();
		while (it.hasNext()) {
			c = it.next();
			if ((c.getNIF()).equals(NIF)) {
				System.out.println(c);
				flag = true;
			}
		}
		
		
		if(!flag)
			System.out.println("El cliente no existe");
		
	}
	
	
	// 4. Borrar cliente
	public void borraCliente(Scanner sc) {
		Ej002Cliente c;
		String NIF;
		
		System.out.print("NIF: ");
		NIF = sc.nextLine(); 
		
		int pos = busquedaSecuencial(listaClientes, NIF);
		if (pos != -1) {
			Iterator<Ej002Cliente> it = listaClientes.iterator();
			while (it.hasNext()) {
				c = it.next();
				if ((c.getNIF()).equals(NIF)) {
					System.out.println("\nCliente borrado: " + c);
					it.remove();
				}
			}
		} else
			System.out.println("El cliente no existe");
	}
	
	public static int busquedaSecuencial(ArrayList<Ej002Cliente> lista, String NIF) {
		for (int i=0; i<lista.size(); i++) {
			if ((lista.get(i).getNIF()).equals(NIF))
				return i;
		}

		return -1;
	}
}
