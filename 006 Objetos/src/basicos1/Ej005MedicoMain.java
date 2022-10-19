//Ejercicio 5.- Se pide definir una clase Medico (que representa a un m�dico de un 
//hospital) con los siguientes atributos de clase: nombre (String), apellidos 
//(String), edad (int), casado (boolean), numeroDocumentoIdentidad (String), 
//especialidad (String). Definir un constructor que permita asignar valores de defecto 
//a los atributos y los m�todos para poder establecer y obtener los valores de los 
//atributos. En cada m�todo, incluye una instrucci�n para que se muestre por consola 
//un mensaje informando del cambio. Por ejemplo si cambia la especialidad del m�dico, 
//debe aparecer un mensaje que diga: 
//"Ha cambiado la especialidad del m�dico de nombre � . La nueva especialidad es: �".


//Ejercicio 6.-
//Dada la clase Medico del ejercicio anterior, a�ade un m�todo de nombre 
//"calculoParaMultiploEdad" que no recibe par�metros y que permita determinar 
//cu�ntos a�os faltan para que la edad del m�dico sea m�ltiplo de 5 y mostrar 
//un mensaje informativo por pantalla. Por ejemplo si el m�dico tiene 22 a�os 
//deber� en primer lugar obtener el resto de la divisi�n de 22 entre 5, que 
//es 2. Ahora obtendr� los a�os que faltan para que el m�dico tenga una edad 
//m�ltiplo de 5, que ser�n 5-2 = 3 a�os. A continuaci�n deber� mostrar un 
//mensaje por consola del tipo: "El m�dico de nombre � con especialidad � "
//+ "tendr� una edad m�ltiplo de 5 dentro de � a�os".

package basicos1;

import java.util.Scanner;

public class Ej005MedicoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//CREANDO EL OBJETO MEDICO DENTRO DE ESTA CLASE
		Ej005Medico medico;
		medico = crearMedico(sc);
		System.out.println(medico);
		
		
		
		//CREANDO EL OBJETO MEDICO FUERA DE ESTA CLASE
		Ej005Medico medico1 = new Ej005Medico();
		
		//Llamando al constructor
		medico1 = new Ej005Medico("nombre", "apellidos", "dNI", "especialidad", 24, false);
		
		medico1.setNombre("Pedro Pablo");
		medico1.setApellidos("Martinez");
		medico1.setEspecialidad("Cardiologia");
		
		
		medico1.getNombre();
		medico1.getApellidos();
		
		
		//EJ 6
		int edad;
		
		System.out.println("Introduzca la edad del medico: ");
		edad = Integer.parseInt(sc.nextLine());
		medico1.setEdad(edad);
		
		System.out.println("El medico " +medico1.getNombre() 
						  +" con especialidad " +medico1.getEspecialidad() 
						  +" tendra una edad multiplo de 5 dentro de " 
						  +medico1.calculoParaMultiploEdad() +" anyos.");
	}

	
	//CREANDO EL OBJETO MEDICO DENTRO DE ESTA CLASE
	//En esta version, devolvemos el objeto medico que se crea dentro
		public static Ej005Medico crearMedico(Scanner sc) {
			String nombre, apellidos;
			int edad;
			char casadoC;
			boolean casado = false;
			String dni, especialidad;

			System.out.println("- - - - - - - - - -");
			System.out.println("Introduce el nombre: ");
			nombre = sc.nextLine();
			System.out.println("Introduce los apellidos: ");
			apellidos = sc.nextLine();
			System.out.println("Introduce la edad: ");
			edad = Integer.parseInt(sc.nextLine());
			System.out.println("Esta casado s/n: ");

			do {
				casadoC = (Character.toLowerCase(sc.nextLine().charAt(0)));
				if (casadoC == 's')
					casado = true;
				else if (casadoC == 'n')
					casado = false;
				else {
					System.out.println("Ha introducido valores incorrectos, introduzca s o n ");
					System.out.println("Esta casado s/n: ");
				}
			} while (casadoC != 's' && casadoC != 'n');

			System.out.println("Numero de DNI: ");
			dni = sc.nextLine();
			
			System.out.println("Especialidad: ");
			especialidad = sc.nextLine();

			return new Ej005Medico(nombre, apellidos, dni, especialidad, edad, casado);
		}
}
