package basicos1_repaso;

import java.util.Scanner;

/*
* Basicos de clases
* Ejercicio 3

  Define una clase Profesor considerando los siguientes atributos de clase: nombre (String), apellidos (String),
  edad (int), casado (boolean), especialista (boolean). Define un constructor que reciba los parámetros 
  necesarios para la inicialización y otro constructor que no reciba parámetros. Crea los métodos para poder
  establecer y obtener los valores de los atributos.

*/
public class Ej001SolMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Ej001Sol persona1;
		persona1 = new Ej001Sol();
		persona1 = crearPersona1(sc);
		System.out.println(persona1);

		Ej001Sol persona2 = new Ej001Sol();
		crearPersona2(sc, persona2);
		System.out.println(persona2);

		// La verdad que esta versión no me gusta, crear un objeto por defecto para
		// luego rellenarlo
		persona1 = new Ej001Sol();
	}

	// En esta versión, devolvemos el objeto persona que se crea dentro de esta clase
	public static Ej001Sol crearPersona1(Scanner sc) {
		String nombre;
		String apellidos;
		int edad;
		char casadoC;
		boolean casado = false;
		String dni;

		System.out.println("- - - - - - - - - -");
		System.out.println("Introduce el nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduce los apellidos: ");
		apellidos = sc.nextLine();
		System.out.println("Introduce la edad: ");
		edad = Integer.parseInt(sc.nextLine());
		System.out.println("Está casado s/n: ");

		do {
			casadoC = (Character.toLowerCase(sc.nextLine().charAt(0)));
			if (casadoC == 's')
				casado = true;
			else if (casadoC == 'n')
				casado = false;
			else {
				System.out.println("Ha introducido valores incorrectos, introduzca s o n ");
				System.out.println("Está casado s/n: ");
			}
		} while (casadoC != 's' && casadoC != 'n');

		System.out.println("Número de DNI: ");
		dni = sc.nextLine();

		return new Ej001Sol(nombre, apellidos, edad, casado, dni);
	}

	// En esta versión, modificamos el objeto persona que se recibe por parametro
	public static void crearPersona2(Scanner sc, Ej001Sol persona) {
		char casadoC;

		System.out.println("- - - - - - - - - -");
		System.out.println("Introduce el nombre: ");
		persona.setNombre(sc.nextLine());
		System.out.println("Introduce los apellidos: ");
		persona.setApellidos(sc.nextLine());
		System.out.println("Introduce la edad: ");
		persona.setEdad(Integer.parseInt(sc.nextLine()));
		System.out.println("Esta casado s/n: ");

		do {
			casadoC = (Character.toLowerCase(sc.nextLine().charAt(0)));
			if (casadoC == 's')
				persona.setCasado(true);
			else if (casadoC == 'n')
				persona.setCasado(false);
			else {
				System.out.println("Ha introducido valores incorrectos, introduzca s o n ");
				System.out.println("Esta casado s/n: ");
			}
		} while (casadoC != 's' && casadoC != 'n');

		System.out.println("Número de DNI: ");
		persona.setNumeroDocumentoIdentidad(sc.nextLine());

	}

}
