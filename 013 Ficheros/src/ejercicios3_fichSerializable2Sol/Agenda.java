package ejercicios3_fichSerializable2Sol;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Agenda {

	public Contacto crearContacto(Scanner sc) {

		System.out.print("Introduce el nombre del contacto: ");
		String nombre = sc.nextLine();
		System.out.print("Introduce el apellido del contacto: ");
		String apellido = sc.nextLine();
		System.out.print("Introduce el numero de telefono del contacto: ");
		String numero = sc.nextLine();
		System.out.print("Introduce el e-mail del contacto: ");
		String email = sc.nextLine();
		return new Contacto(nombre, apellido, numero, email);
	}

	/*
	 * alta() de un nuevo contacto
	 */
	public void alta(String nomFichero, Scanner sc) {

		File f1 = new File(nomFichero);

		if (f1.exists()) {
			try (ClaseOutput co = new ClaseOutput(new FileOutputStream(f1, true))) {
				co.writeObject(crearContacto(sc));
			} catch (IOException e) {
				System.out.println(e);
			}
		} else {
			try (ObjectOutputStream co = new ObjectOutputStream(new FileOutputStream(f1))) {
				co.writeObject(crearContacto(sc));
			} catch (IOException e) {
				System.out.println(e);
			}
		}

		System.out.println();
	}

	/*
	 * buscarContacto()
	 */
	public void buscarContacto(String nomFichero, Scanner sc) {
		boolean check = false;
		String nombre, apellido;
		Contacto c1, c2;

		System.out.print("Introduce el nombre de la persona que buscas: ");
		nombre = sc.nextLine();

		System.out.print("Introduce el apellido de la persona que buscas: ");
		apellido = sc.nextLine();

		c2 = new Contacto(nombre, apellido);
		File f1 = new File(nomFichero);

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1))) {

			try {
				while (true) {
					c1 = (Contacto) ois.readObject();

					if (c1.compareTo(c2) == 0) {
						check = true;
						System.out.println("\nContacto encontrado. Detalles del contacto:\n");
						System.out.println(c1);
					}
				}

			} catch (EOFException e) {
				if (!check)
					System.out.println("\nContacto no encontrado.");
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		System.out.println();
	}

	/*
	 * modificaContacto()
	 */
	public void modificaContacto(String nomFichero, Scanner sc) {
		Contacto c1, c2;
		String nombre, apellido;
		boolean check = false;
		String resp = "";
		final String FICHERO_TEMP = "temp.dat";

		System.out.print("Introduce el nombre del contacto que quieres modificar: ");
		nombre = sc.nextLine();

		System.out.print("Introduce el apellido del contacto que quieres modificar: ");
		apellido = sc.nextLine();

		c2 = new Contacto(nombre, apellido);

		System.out.println();

		File f1 = new File(nomFichero);
		File f2 = new File(FICHERO_TEMP);

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
			 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f2))) {

			try {
				// este bucle es en el que va copiando los objetos
				// 1) compara para ver si es igual
				// 2) si es igual modifica el contacto y lo escribe en el temporal
				// 3) si no es igual, no modifica y el contacto que carga lo escribe en el temporal
				while (true) { // Entramos en el bucle que recorra el fichero original, f1
					c1 = (Contacto) ois.readObject();
					// Si en el recorrido encuentra al usuario buscado
					if (c1.compareTo(c2) == 0) {
						check = true;
						System.out.println("Contacto encontrado. Detalles del contacto:\n" + c1 + "\n");

						do { // Preguntamos si quiere cambiar el telefono
							System.out.println("Quieres modificar su numero de telefono? (S/N)");
							resp = sc.nextLine().toUpperCase();
							if (!resp.equals("S") && !resp.equals("N"))
								System.out.println("Respuesta no contemplada.");
						} while (!resp.equals("S") && !resp.equals("N"));

						if (resp.equals("S")) {
							System.out.print("Introduce el nuevo numero de telefono: ");
							c1.setNumero(sc.nextLine());
						}
						System.out.println();

						do { // Preguntamos si quiere cambiar el email
							System.out.println("Quieres modificar su email? (S/N)");
							resp = sc.nextLine().toUpperCase();
							if (!resp.equals("S") && !resp.equals("N"))
								System.out.println("Respuesta no contemplada.");
						} while (!resp.equals("S") && !resp.equals("N"));

						if (resp.equals("S")) {
							System.out.print("Introduce el nuevo email: ");
							c1.setEmail(sc.nextLine());
						}

						System.out.println("\nEl contacto queda: " + c1);
					}
					oos.writeObject(c1); // Escribimos el contacto c1 en el fichero temporal f2
				}

			} catch (EOFException e) {
				if (!check)
					System.out.println("Contacto no encontrado.");
			}

			ois.close();
			oos.close();

			
			if (f1.delete())
				if (f2.renameTo(f1))
					System.out.println("\nLa agenda se ha modificado.");
				else
					System.out.println("\nEl contacto no ha podido modificarse.");
			else
				System.out.println("\nLa agenda no ha podido modificarse.");
			

		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		System.out.println();
	}

	/*
	 * eliminaContacto()
	 */
	public void eliminaContacto(String nomFichero, Scanner sc) {
		Contacto c1, c2;
		boolean check = false;
		int cont = 0;
		final String FICHERO_ELIM = "Eliminados.txt";
		final String FICHERO_TEMP = "temp.dat";
		String nombre, apellido;

		System.out.print("Introduce el nombre del contacto que quieres eliminar: ");
		nombre = sc.nextLine();
		System.out.print("Introduce el apellido del contacto que quieres eliminar: ");
		apellido = sc.nextLine();

		c2 = new Contacto(nombre, apellido);

		System.out.println();

		File fdel = new File(FICHERO_ELIM);
		File f1 = new File(nomFichero);
		File f2 = new File(FICHERO_TEMP);

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
			 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f2))) {

			try {
				while (true) {
					c1 = (Contacto) ois.readObject();

					if (c1.compareTo(c2) == 0) {
						check = true;
						cont++;
						try (BufferedWriter bw = new BufferedWriter(new FileWriter(fdel, true))) {
							bw.write(c1.toString() + "\r\n");
						} catch (IOException e) {
							System.out.println(e);
						}
					} else
						oos.writeObject(c1); // escribimos en f2
				}
			} catch (EOFException e) {
				if (!check)
					System.out.println("Contacto no encontrado.");
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			}

			oos.close(); // Si no lo cierro aqui, no se borrara
			ois.close();

			// Borramos el fichero f1 (original) y renombramos f2 (temporal) a f1
			if (f1.delete())
				if (f2.renameTo(f1))
					System.out.println("Contactos borrados: " + cont);
				else
					System.out.println("Error al borrar contactos del fichero");
			else
				System.out.println("Error al borrar contactos del fichero");
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println();
	}

	/*
	 * ordenarContactos() como tiene el mismo tamano y cargo todo en memoria, se
	 * puede machacar
	 */
	public void ordenarContactos2(String nomFichero) {
		Contacto c1;
		final String FICHERO_TEMP = "temp.dat";
		ArrayList<Contacto> fichero = new ArrayList<Contacto>();

		System.out.println();

		File f1 = new File(nomFichero);
		if (f1.length() == 0) {
			System.out.println("No hay contactos.\n");
		} else {
			File f2 = new File(FICHERO_TEMP);

			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
				 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f2))) {

				try { // Guardamos en una lista el contenido del fichero
					while (true) { // Entramos en el bucle que recorra el fichero original, f1
						c1 = (Contacto) ois.readObject();
						fichero.add(c1);
					}
				} catch (EOFException e) {
				}

				// Cierro fichero de entrada
				ois.close();

				Collections.sort(fichero);

				Iterator<Contacto> it = fichero.iterator();
				while (it.hasNext())
					oos.writeObject(it.next()); // Escribimos el contacto en el fichero temporal f2

				oos.close();

				if (f1.delete())
					if (f2.renameTo(f1))
						System.out.println("\nOrdenado el fichero.");
					else
						System.out.println("\nError al ordenar el fichero.");
				else
					System.out.println("\nError al ordenar el fichero.");

			} catch (IOException e) {
				System.out.println(e);
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println();
		}
	}

	/*
	 * ordenarContactos()
	 */
	public void ordenarContactos(String nomFichero) {
		Contacto c1;
		ArrayList<Contacto> lista_fichero = new ArrayList<Contacto>();

		System.out.println();

		File f1 = new File(nomFichero);
		if (f1.length() == 0) {
			System.out.println("No hay contactos.\n");
		} else {

			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1))) {

				try { // Guardamos en una lista el contenido del fichero
					while (true) { // Entramos en el bucle que recorra el fichero original, f1
						c1 = (Contacto) ois.readObject();
						lista_fichero.add(c1);
					}
				} catch (EOFException e) {
				}

				// Cierro fichero de entrada
				ois.close();

				Collections.sort(lista_fichero);
			} catch (IOException e) {
				System.out.println(e);
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			} catch (Exception e) {
				System.out.println(e);
			}

			try (ObjectOutputStream co = new ObjectOutputStream(new FileOutputStream(f1))) {
				Iterator<Contacto> it = lista_fichero.iterator();
				while (it.hasNext())
					co.writeObject(it.next()); // Escribimos el contacto

			} catch (IOException e) {
				System.out.println(e);
			}
			System.out.println();
		}
	}

	/*
	 * mostrarContactos()
	 */
	public void mostrarContactos(String nomFichero) {
		File f = new File(nomFichero);

		if (f.length() == 0) {
			System.out.println("No hay contactos.\n");
		} else {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
				try {
					while (true)
						System.out.println((Contacto) ois.readObject());
				} catch (EOFException e) {
				}
			} catch (IOException e) {
				System.out.println(e);
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			}
			System.out.println();
		}

	}

	/*
	 * salir()
	 */
	public void salir() {
		String dato;
		final String FICHERO_ELIM = "Eliminados.txt";

		File fdel = new File(FICHERO_ELIM);

		try (BufferedReader br = new BufferedReader(new FileReader(fdel))) {

			while ((dato = br.readLine()) != null) { // Mientras (dato = siguiente linea) != null
				System.out.println(dato);
			}

		} catch (EOFException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			// Si no se ha eliminado ninguno saldria este error
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println();
	}
}
