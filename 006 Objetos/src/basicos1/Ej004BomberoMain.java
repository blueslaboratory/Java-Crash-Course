//Ejercicio 4.- Define una clase Bombero considerando los siguientes 
//atributos de clase: nombre (String), apellidos (String), edad (int), 
//casado (boolean), especialista (boolean). Define un constructor que 
//reciba los par�metros necesarios para la inicializaci�n y los m�todos 
//para poder establecer y obtener los valores de los atributos.


package basicos1;

public class Ej004BomberoMain {

	public static void main(String[] args) {
		
		//Apuntamos a la direccion de memoria:
		Ej004Bombero bombero1;
		//Creamos el objeto de la clase bombero con un constructor:
		bombero1 = new Ej004Bombero();
		//El constructor consiste en crear un objeto
		//de una clase con la palabra reservada new y rellenar los atributos.
		
		//Todo a la vez:
		Ej004Bombero bombero2 = new Ej004Bombero();
		
		//Podemos acceder a atributos private desde metodos public 
		//que se encuentran en la misma clase que esos atributos:
		//Set it para cambiar el valor:
		bombero1.setNombre("Pepito");
		//Get it para que nos lo devuelva:
		System.out.println(bombero1.getNombre());
	}

}
