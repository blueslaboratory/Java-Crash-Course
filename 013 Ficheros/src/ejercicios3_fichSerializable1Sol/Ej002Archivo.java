package ejercicios3_fichSerializable1Sol;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * Recoge todos los metodos necesarios para manipular el archivo clientes.dat
 * 
 * @author
 */
public class Ej002Archivo {

	// Inicializo los miembros de clase.
	private static FileOutputStream fos;
	private static ObjectOutputStream salida;
	// private static FileInputStream fis;
	// nunca utilizar aux para el nombre de los archivos
	final static String TEMPORAL = "temporal.dat";
	final static String ARCHIVO = "clientes.dat";
	static Scanner sc = new Scanner(System.in); // Para leer de teclado

	/**
	 * Lee los Clientes de clientes.dat
	 * 
	 * @param archivo
	 */
	public static boolean mostrarClientes(String archivo) {
		// Preparamos un objeto de la clase Cliente para poder mostrar su
		// contenido cuando leamos.
		Ej002Cliente cliente = null;
		boolean vacio = true;

		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
			// Como vamos a listar solamente, no vamos a modificar nada, abrimos
			// clientes.dat en modo lectura.
			// Puede ocurrir que el fichero exista, por eso llego hasta aqui, y que no haya
			// ningun registro
			while (true) {
				cliente = (Ej002Cliente) entrada.readObject();
				if (cliente instanceof Ej002Cliente)
					System.out.println(cliente);
				vacio = false;
			}

		} catch (EOFException ex) {
			return vacio;
		} catch (Exception ex) {
			System.out.println("Excepcion capturada en listarClientes" + ex.toString());
			return vacio;
		}

	}

	/**
	 * Nos posibilita la escritura de un nuevo registro en clientes.dat
	 * 
	 * @param archivo
	 * @param cliente
	 */
	public static void guardarClienteEnArchivo(String archivo, Ej002Cliente cliente) {
		try {
			// Creamos un fujo de salida hacia clientes.dat
			// ESTO VA A CAER EN EL EXAMEN
			if (existeFichero(archivo)) {
				// se suele anadir si existe y length > 0
				// if (tieneRegistros() == true){
				// Si clientes.dat existe.
				// El flujo ObjectOutputStream es el que procesa los datos de
				// salida y se ha de vincular a un objeto de la clase
				// FileOutputStream.(Serializar)
				fos = new FileOutputStream(archivo, true);
				salida = new Ej002MiObjectOutputStream(fos);
				////////////////////////////////////////////////////////////////
				// Evitamos que nos anada una cabecera en mitad del fichero //
				////////////////////////////////////////////////////////////////
			} else {
				fos = new FileOutputStream(archivo);
				// Si no existe uso la clase ObjectOutputStream para
				// escribir la cabecera y el PRIMER registro
				salida = new ObjectOutputStream(fos);
			}
			// Grabar cliente
			if (fos != null) {
				salida.writeObject(cliente);
			}
			// Captura de excepciones.
		} catch (IOException ex) {
			System.out.println("Excepcion capturada en guardarClienteEnArchivo" + ex.getMessage());
		} finally {
			try {
				if (salida != null)
					salida.close();
			} catch (IOException e) {
			}
		}
	}

	/**
	 * Nos permite buscar un cliente a traves de su dni
	 * 
	 * @param archivo
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void buscarCliente(String archivo) {
		// Preparamos un objeto de la clase Cliente para poder mostrar su
		// contenido cuando leamos.
		Ej002Cliente cliente = null;
		// Preguntamos por el nif a buscar.
		String buscado = Ej002UI.leerNif();
		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
			// Como vamos a buscar solamente, no vamos a modificar nada, abrimos
			// clientes.dat en modo lectura.

			// Comprobamos que hay algo en el flujo de datos fis

			while (true) {
				// Leemos el primer objeto cliente a traves del buffer "entrada"
				// que antes vinculamos al flujo de datos "fis" que lee el
				// archivo clientes.dat
				cliente = (Ej002Cliente) entrada.readObject();
				// con esto no haria falta hacer instanceof, es un overkill
				if (cliente instanceof Ej002Cliente) { 
					// Preguntamos por el cliente a buscar.
					String encontrado = cliente.getNif();
					// Comparamos buscado y encontrado
					if (buscado.equals(encontrado)) {
						System.out.println("Encontrado cliente." 
											+ "\nNombre: " + cliente.getNombre() 
											+ "\nNif: " + cliente.getNif() 
											+ "\nDireccion: " + cliente.getDireccion() 
											+ "\nTlf: " + cliente.getTlf() 
											+ "\nDeuda: " + cliente.getDeuda());
					}
				}
			}
		} catch (EOFException eof) {

		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		// Informamos del fin de la busqueda
		System.out.println("Busqueda finalizada.");
	}

	/**
	 * Borra un cliente que buscamos a traves de su nif tantas veces como lo
	 * encuentre dentro del fichero clientes.dat Para ello creamos un fichero
	 * temporal.dat que guarda los Clientes que vamos leyendo excepto aquellos cuyo
	 * nif coincida con el buscado. Posteriormente renombramos temporal.dat a
	 * clientes.dat. Despues borramos temporal.dat
	 * 
	 * @param archivo
	 */
	public static void borrarCliente(String archivo) {
		// Preparamos un objeto de la clase Cliente para poder comparar su
		// contenido cuando leamos.
		Ej002Cliente cliente = null;
		boolean check = false;

		// Preguntamos por el nif del cliente a borrar.
		// Seria mejor pasarlo por parametro
		String buscado = Ej002UI.leerNif();
		try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo));
			 ObjectOutputStream salidatemp = new ObjectOutputStream(new FileOutputStream(TEMPORAL))) {
			// Vamos a buscar. Abrimos clientes.dat en modo LECTURA

			while (true) {
				// Leemos el primer objeto cliente a traves del buffer "entrada"
				// vinculado al archivo clientes.dat
				cliente = (Ej002Cliente) entrada.readObject();
				if (cliente instanceof Ej002Cliente) {
					// Preguntamos por el nif del objeto cliente leido.
					String encontrado = cliente.getNif();
					// Comparamos buscado y encontrado
					if (buscado.equals(encontrado)) {
						System.out.println("Eliminado cliente." + cliente);
					} else
						salidatemp.writeObject(cliente);
				}

			}

		} catch (EOFException eof) {
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		// Informamos del fin de la busqueda
		System.out.println("Busqueda finalizada.");
		// Renombramos, copiamos y borramos.

		File ClienteDat = new File(archivo);
		File temp = new File(TEMPORAL);
		try {

			// Renombramos y comprobamos
			// Borramos clientes.dat
			borrarClientesDat(archivo);

			// Renombramos y comprobamos.
			check = temp.renameTo(ClienteDat);
			if (check)
				System.out.println(TEMPORAL + " renombrado a clientes.dat");
			else
				System.out.println("El renombrado no se ha podido realizar");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	/**
	 * Borra el archivo original
	 * 
	 * @param archivo
	 */
	public static boolean borrarClientesDat(String archivo) {
		// Instanciamos ClienteDat la clase File y le pasamos el nombre del
		// fichero con el que vamos a trabajar
		File ClienteDat = new File(archivo);
		// Para borrar el fichero deberemos de invocar el metodo .delete()
		// de la clase File. En caso de que se pueda realizar el borrado del
		// fichero, dicho metodo devolvera true.
		// En caso contrario devolvera false.

		if (ClienteDat.delete()) {// true
			System.out.println("Fichero borrado con exito");
			return true;
		}
		else {// false
			System.out.println("No se ha podido borrar el fichero");
			return false;
		}
		// Otra opcion lanzar una excepcion en vez de devolver un boolean
	}

	/**
	 * Comprobar existencia del archivo * @param archivo
	 */
	public static boolean existeFichero(String archivo) {
		File f = new File(archivo);

		return (f.exists() ? true : false);
	}
}