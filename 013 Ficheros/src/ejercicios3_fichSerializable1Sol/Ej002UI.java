package ejercicios3_fichSerializable1Sol;

import java.util.Scanner;

public class Ej002UI {
	static Scanner teclado = new Scanner(System.in); // Para leer de teclado
	static boolean check;// Para hacer comprobaciones

	/**
	 * leerNombre()
	 * 
	 * @return nombre Nos permite establecer el nombre del cliente. Verifica que el
	 *         nombre introducido es correcto siempre y cuando la longitud del
	 *         String nombre se halle entre 3 y 40 caracteres.
	 */
	public static String leerNombre() {
		String nombre;

		System.out.println("Introduce el nombre del cliente (3-40 caracteres):");
		nombre = teclado.nextLine();
		while ((nombre.length() < 3) || (nombre.length() > 40)) {
			System.out.println("El nombre debe tener entre 3 y 40 caracteres");
			System.out.println("Introduce el nombre del cliente (3-40 caracteres):");
			nombre = teclado.nextLine();
		}

		return nombre;
	}

	/**
	 * leerNif()
	 * 
	 * @return nif Nos permite establecer el nif del cliente. Voy a dar por correcto
	 *         una cadena de 9 caracteres
	 */
	public static String leerNif() {
		String nif;

		System.out.println("Introduce el nif del cliente (9 caracteres):");
		nif = teclado.nextLine();
		while (nif.length() != 9) {
			System.out.println("El nif debe tener 9 caracteres");
			System.out.println("Introduce el nif del cliente (9 caracteres):");
			nif = teclado.nextLine();
		}

		return nif;
	}

	/**
	 * leerTlf()
	 * 
	 * @return tlf Nos permite establecer el telefono del cliente. Voy a dar por
	 *         correcto una cadena de 9 caracteres
	 */
	public static String leerTlf() {
		String tlf;

		System.out.println("Introduce el teléfono del cliente (9 caracteres):");
		tlf = teclado.nextLine();
		while ((tlf.length() != 9)) {
			System.out.println("El teléfono debe tener 9 caracteres");
			System.out.println("Introduce el teléfono del cliente (9 caracteres):");
			tlf = teclado.nextLine();
		}

		return tlf;
	}

	/**
	 * leerDireccion()
	 * 
	 * @return dir Nos permite establecer la direccion del cliente. Asume que la
	 *         direccion introducida es correcta siempre y cuando la longitud del
	 *         String dir se halle entre 3 y 50 caracteres.
	 */
	public static String leerDireccion() {
		String dir;

		System.out.println("Introduce la dirección cliente (3-50 caracteres):");
		dir = teclado.nextLine();
		while ((dir.length() < 3) || (dir.length() > 50)) {
			System.out.println("El nombre debe tener entre 10 y 50 caracteres");
			System.out.println("Introduce la dirección cliente (3-50 caracteres):");
			dir = teclado.nextLine();
		}

		return dir;
	}

	/**
	 * leerDeuda Nos permite establecer la cantidad que debe el cliente
	 * 
	 * @return deuda
	 */
	public static String leerDeuda() {
		String deuda;

		System.out.println("Indique la cantidad adeudada por el cliente: ");
		deuda = teclado.nextLine();

		return deuda;
	}
}
