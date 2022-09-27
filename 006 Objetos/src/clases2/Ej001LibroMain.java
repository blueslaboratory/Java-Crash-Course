//1.- Crea una clase llamada Libro que guarde la informaci�n de cada uno 
//de los libros de una biblioteca. La clase debe guardar el t�tulo del libro, 
//autor, n�mero de ejemplares del libro y n�mero de ejemplares prestados. 
//La clase contendr� los siguientes m�todos:
//Constructor por defecto.
//Constructor con par�metros. 
//M�todos Setters/getters
//M�todo pr�stamo que incremente el atributo correspondiente cada vez que 
//se realice un pr�stamo del libro. No se podr�n prestar libros de los que 
//no queden ejemplares disponibles para prestar. Devuelve true si se ha podido 
//realizar la operaci�n y false en caso contrario.
//M�todo devoluci�n que decremente el atributo correspondiente cuando se produzca 
//la devoluci�n de un libro. No se podr�n devolver libros que no se hayan prestado. 
//Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
//M�todo toString para mostrar los datos de los libros. Este m�todo se hereda 
//de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
//Escribe un programa para probar el funcionamiento de la clase Libro.


package clases2;

public class Ej001LibroMain {
	
	public static void main(String[] args) {
		
		Ej001Libro libro1 = new Ej001Libro("La fundacion", "ISAAC ASIMOV", 10, 0);
		
		for(int i=0; i<11; i++)
			libro1.prestar();
		
		libro1.devolver();
		
		System.out.println(libro1);
	}
	
}