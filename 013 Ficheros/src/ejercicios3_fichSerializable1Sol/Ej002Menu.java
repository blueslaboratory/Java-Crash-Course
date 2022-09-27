package ejercicios3_fichSerializable1Sol;

public class Ej002Menu {
	// Se implementa la interfaz serializable para que el objeto Cliente pueda
	// escribir todos sus datos en fichero.
	final static String ARCHIVO = "clientes.dat";
	final static int MAXOPC = 6;

	public static void main(String[] args) {
		/**
		 * Menu Presenta el menu de operaciones con todas las opciones disponibles
		 */
		int opcion = 0;

		do {
			try {
				opcion = Integer.parseInt(menu()); // Mostramos el menu
			} catch (NumberFormatException nfe) {
				// System.out.println(nfe.getMessage());
				System.out.println("Debes introducir una opcion correcta de menu");
				opcion = 10; // Para que salga el mensaje de default
			}
			switch (opcion) {
			case 1: // Anadir cliente
				// Creamos un nuevo objeto cliente de la clase Clientes
				Ej002Cliente cliente = new Ej002Cliente(Ej002UI.leerNombre(), Ej002UI.leerNif(), Ej002UI.leerTlf(), Ej002UI.leerDireccion(), Ej002UI.leerDeuda());
				// Llamada al metodo guardarEnArchivo.
				Ej002Archivo.guardarClienteEnArchivo(ARCHIVO, cliente);
				break;

			case 2: // Listar clientes
				@SuppressWarnings("unused")
				boolean vacio;
				// si el fichero existe pero esta vacio, debo decirlo, por eso uso esta
				// devolucion en el metodo
				if (Ej002Archivo.existeFichero(ARCHIVO)) {
					if ((vacio = Ej002Archivo.mostrarClientes(ARCHIVO)) == true)
						System.out.println("No hay clientes grabados");
				} else
					System.out.println("No hay clientes grabados");
				break;

			case 3: // Buscar clientes.
				if (Ej002Archivo.existeFichero(ARCHIVO))
					Ej002Archivo.buscarCliente(ARCHIVO);
				else
					System.out.println("No hay clientes grabados");
				break;

			case 4:// Borrar cliente
				if (Ej002Archivo.existeFichero(ARCHIVO))
					Ej002Archivo.borrarCliente(ARCHIVO);
				else
					System.out.println("No hay clientes grabados");
				break;

			case 5:// Borrar fichero de clientes. Ojo que no hay vuelta atras.
				if (Ej002Archivo.existeFichero(ARCHIVO))
					Ej002Archivo.borrarClientesDat(ARCHIVO);
				else
					System.out.println("No hay clientes grabados");
				break;

			case 6:// Salir del menu
				break;

			default:
				System.out.println("Introduzca un valor entre 1 y 6");
			}
		} while (opcion != MAXOPC);
	}

	/**
	 * menu() Menu de seleccion. Presenta el menu de opciones
	 * 
	 * @return opcion
	 */
	public static String menu() {
		System.out.println("\n          Menu\n");
		System.out.println("-------------------------------");
		System.out.println("1 - Anadir cliente");
		System.out.println("2 - Listar clientes");
		System.out.println("3 - Buscar cliente");
		System.out.println("4 - Borrar cliente");
		System.out.println("5 - Borrar fichero " + ARCHIVO);
		System.out.println("6 - Salir");
		System.out.println("-------------------------------");
		String opcion = Ej002Archivo.sc.nextLine();
		return opcion;
	}
}