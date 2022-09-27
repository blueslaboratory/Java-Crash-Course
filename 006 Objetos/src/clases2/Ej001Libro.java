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

public class Ej001Libro {
	
	//NO SE INICIALIZAN AQUI
	//CADA OBJETO SE INICIALIZA EN EL MAIN
	//ESTO ES UNA PLANTILLA
	String titulo;
	String autor;
	int numEjem;
	int numEjemPrest;
	
	
	//PRESTAR
	public boolean prestar() {
		if (numEjem>0) {
			numEjem--;
			numEjemPrest++;
			return true;
		}
		
		else {
			System.out.println("Ejemplares disponibles: " +numEjem);
			return false;
		}
	}
	
	//DEVOLVER
	public boolean devolver() {
		if (numEjemPrest>0) {
			numEjem++;
			numEjemPrest--;
			return true;
		}
		
		else {
			System.out.println("Ejemplares disponibles: " +numEjem);
			return false;
		}
	}
	

	
	//CONSTRUCTOR POR DEFECTO
	public Ej001Libro() {};
	
	//CONSTRUCTOR CON PARAMETROS
	public Ej001Libro(String titulo, String autor, int numEjem, int numEjemPrest){
		this.titulo = titulo;
		this.autor = autor;
		this.numEjem = numEjem;
		this.numEjemPrest = numEjemPrest;
	}
	
	
	//SET: ALT+SHIFT+S	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setNumEjem(int numEjem) {
		this.numEjem = numEjem;
	}
	public void setNumEjemPrest(int numEjemPrest) {
		this.numEjemPrest = numEjemPrest;
	}
	
	
	//GET: ALT+SHIFT+S
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getNumEjem() {
		return numEjem;
	}
	public int getNumEjemPrest() {
		return numEjemPrest;
	}
	
	
	//TOSTRING (OVERRIDE)
	public String toString(){
		return "\nTitulo: " +titulo
			  +"\nAutor: " +autor
			  +"\nNumero de ejemplares disponibles: " +numEjem
			  +"\nNumero de ejemplares prestados: " +numEjemPrest;
	}
}
