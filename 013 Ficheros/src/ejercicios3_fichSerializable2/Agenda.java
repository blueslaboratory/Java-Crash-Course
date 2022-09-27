package ejercicios3_fichSerializable2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


public class Agenda {
	
	ArrayList<Contacto> agenda = null;
	ArrayList<Contacto> eliminados = null;
	
	// CONSTRUCTOR
	public Agenda() {
		agenda = new ArrayList<Contacto>();
		eliminados = new ArrayList<Contacto>();
	}
	
	// GETTERS
	public ArrayList<Contacto> getAgenda() {
		return agenda;
	}
	public ArrayList<Contacto> getEliminados() {
		return eliminados;
	}


	// Guardar fichero
	public void guardarFichero(String NOM_FICH, ArrayList<Contacto> lista) {
		try {
			// Este programa funcionara
			// tanto si ya existe el fichero, como si se crea de nuevo
			// Para ello pregunta si existe el fichero y si no existe
			// usa la clase que no anade cabecera
			// Si existe usara la otra clase (FileOutputStream)
			File f = new File(NOM_FICH);

//			Para evitar que se guarde varias veces encima hay que machacarlo y no hacer el if
//			es lo que tiene guardar un objeto ArrayList
//			if (f.exists() && f.length() > 0) {// si existe y tiene algo
//				ClaseOutput co = new ClaseOutput(new FileOutputStream(f, true));
//				co.writeObject(lista);
//				co.close();
//			} else {
				// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/ObjectOutputStream.html
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(lista);
				oos.close();
//			}
			
		System.out.println("Se ha guardado el fichero");
			
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	
	// Borrar fichero
	public boolean borrarFichero(String NOM_FICH) {
		File f = new File(NOM_FICH);
		return f.delete();
	}
	
	
	// Leer fichero
	// Lee todos los ArrayList y te guarda el ultimo ArrayList: ineficiente
	// (ahora guardar machaca el archivo: solo hay 1 arraylist)
	public void leerFichero(String NOM_FICH, String NOM_FICH2) {
		File f1 = new File(NOM_FICH);
		File f2 = new File(NOM_FICH2);
		
		// agenda
		if(f1.exists()) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH))) {
				try {
					while (true) 
						agenda = (ArrayList<Contacto>) ois.readObject();
				} catch (EOFException e) {}
			} catch (IOException ex) {
				System.out.println(ex);
			} catch (ClassNotFoundException ex) {
				System.out.println(ex);
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
		
		// eliminados
		if(f2.exists()) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOM_FICH2))) {
				try {
					while (true) 
						eliminados = (ArrayList<Contacto>) ois.readObject();
				} catch (EOFException e) {}
			} catch (IOException ex) {
				System.out.println(ex);
			} catch (ClassNotFoundException ex) {
				System.out.println(ex);
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
		
	}
	
	
	// 1. Crear contacto
	public void addContacto(Scanner sc) {
		String nombre, apellido, telefono, email;
		
		System.out.println("Introduzca los datos del contacto");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Apellido: ");
		apellido = sc.nextLine();
		System.out.print("Telefono: ");
		telefono = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
				
		
		agenda.add(new Contacto(nombre, apellido, telefono, email));
		System.out.println("\nEl contacto se ha anadido");
	}
	
	
	// 2. Buscar contacto
	public Contacto buscaContacto(Scanner sc) {
		Contacto c = null;
		String nombre, apellido;
		boolean flag = false;
		
		System.out.print("Nombre: ");
		nombre = sc.nextLine(); 
		System.out.print("Apellido: ");
		apellido = sc.nextLine();
		
		Iterator<Contacto> it = agenda.iterator();
		while (it.hasNext() && !flag) {
			c = it.next();
			if ((c.getNombre()).equalsIgnoreCase(nombre) && 
				(c.getApellido()).equalsIgnoreCase(apellido)) {
					System.out.println(c);
					flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("El contacto no existe");
			c = null;
		}
			
		
		return c;
	}
	
	
	// 3. Modificar tel/email
	public void modContacto(Scanner sc) {
		Contacto c = buscaContacto(sc);
		String telefono, email;
		
		if(c!=null) {
			System.out.print("Nuevo telefono: ");
			telefono = sc.nextLine();
			c.setTelefono(telefono);
			System.out.print("Nuevo email: ");
			email = sc.nextLine();
			c.setEmail(email);
			System.out.println("Se ha modificado el contacto");
		}
	}
	
	
	// 4. Eliminar contacto de agenda
	public void borraContacto(Scanner sc) {
		Contacto c = buscaContacto(sc);
		boolean flag = false;
		
		// agenda.remove(c);
		// con el iterator porque somos unos pros
		Iterator<Contacto> it = agenda.iterator();
		while (it.hasNext() && !flag) {
			if (it.next().equals(c)) {
				System.out.println("\nContacto a borrar: " + c);
				eliminados.add(c);
				it.remove();
				flag = true;
				System.out.println("\nContacto a borrado ");
			}
		}
	}
	
	
	// 5. Ordenar alfabeticamente 
	public void ordenarContactos() {
        Comparator<Contacto> alfabet = new OrdenarAlfab();
        Collections.sort(agenda, alfabet);
        System.out.println("Se ha ordenado alfabeticamente la agenda");
        //Necesitamos reescribir compare para esto
	}
	
	
	// 6. Listar contactos agenda
	public void printAgenda() {
		System.out.println();
		System.out.println("********************************");
		System.out.println("LISTA DE CONTACTOS EN LA AGENDA");
		
//		for each:
//		for(Contacto a : agenda) {
//			System.out.println(a);
//		}
		
		Iterator<Contacto> it = agenda.iterator();
		int cont = 1;
		
		while(it.hasNext()) {
			System.out.print(cont +" ");
			System.out.println(it.next());
			cont++;
		}
	}
	
	// 7. Listar contactos eliminados
	public void printEliminados() {
		System.out.println();
		System.out.println("********************************");
		System.out.println("CONTACTOS ELIMINADOS DE LA AGENDA");

//		for each:
//		for(Contacto e : eliminados) {
//			System.out.println(e);
//		}
		
		Iterator<Contacto> it = eliminados.iterator();
		int cont = 1;
		
		while(it.hasNext()) {
			System.out.print(cont +" ");
			System.out.println(it.next());
			cont++;
		}
	}
}