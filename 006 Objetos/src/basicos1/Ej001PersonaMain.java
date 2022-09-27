//Ejercicio 1.- Define una clase Persona considerando los siguientes 
//atributos de clase: nombre (String), apellidos (String), edad (int), 
//casado (boolean), numeroDocumentoIdentidad (String). 
//Define un constructor y los metodos para poder establecer y obtener 
//los valores de los atributos.


package basicos1;

public class Ej001PersonaMain {

	public static void main(String[] args) {
		
		//Apuntamos a la direccion de memoria:
		Ej001Persona persona1;
		//Creamos el objeto de la clase persona con un constructor:
		persona1 = new Ej001Persona();
		//El constructor consiste en crear un objeto
		//de una clase con la palabra reservada new y rellenar los atributos..
		
		//Todo a la vez:
		Ej001Persona persona2 = new Ej001Persona();
		
		//Podemos acceder a atributos private desde metodos public 
		//que se encuentran en la misma clase que esos atributos:
		//Set it para cambiar el valor:
		persona1.setNombre("Pepito");
		//Get it para que nos lo devuelva:
		System.out.println(persona1.getNombre());
		
		
		//CONSTRUCTOR
		Ej001Persona persona3 = new Ej001Persona("Mercedes", "Perez", "77713969Y", 42, true);
		
		//OVERWRITE toString()
		System.out.println(persona3.toString());
		//NO HACE FALTA PONER EL .toString()
		System.out.println(persona3);
	}

}
