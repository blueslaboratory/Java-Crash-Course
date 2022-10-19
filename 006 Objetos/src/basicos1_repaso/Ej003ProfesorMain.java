//Ejercicio 3.- Define una clase Profesor considerando los siguientes 
//atributos de clase: nombre (String), apellidos (String), edad (int), 
//casado (boolean), especialista (boolean). Define un constructor que 
//reciba los par�metros necesarios para la inicializaci�n y otro 
//constructor que no reciba par�metros. Crea los m�todos para poder 
//establecer y obtener los valores de los atributos.


package basicos1_repaso;

public class Ej003ProfesorMain {

	public static void main(String[] args) {
		
		//Apuntamos a la direccion de memoria:
		Ej003Profesor profesor1;
		//Creamos el objeto de la clase profesor con un constructor:
		profesor1 = new Ej003Profesor();
		//El constructor consiste en crear un objeto
		//de una clase con la palabra reservada new y rellenar los atributos.
		
		//Todo a la vez:
		Ej003Profesor profesor2 = new Ej003Profesor();
		
		//Podemos acceder a atributos private desde metodos public 
		//que se encuentran en la misma clase que esos atributos:
		//Set it para cambiar el valor:
		profesor1.setNombre("Muten");
		profesor1.setApellidos("Roshi");
		profesor1.setEdad(359);
		profesor1.setCasado(false);
		profesor1.setEspecialista(true);
		
		//Get it para que nos lo devuelva:
		System.out.println(profesor1.getNombre());
		System.out.println(profesor1.getApellidos());
		System.out.println(profesor1.getEdad());
		System.out.println(profesor1.isCasado());
		System.out.println(profesor1.isEspecialista());
		
		//Te imprimiria el hash si no tuviesemos el toString
		System.out.println(profesor1);
		
		//Igualamos el valor de 2 objetos
		profesor2 = profesor1;
		System.out.println(profesor2);
		
		
		//RELLENANDO CON UN CONSTRUCTOR
		Ej003Profesor profesor3 = new Ej003Profesor("John", "Lund", 44, false, true);
		//LLAMAMOS A toString:
		System.out.println(profesor3);
	}

}
