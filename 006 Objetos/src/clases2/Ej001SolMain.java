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


// esta seria la version mas simple, donde autor no es una instancia
// de otra clase

import java.util.*;

public class Ej001SolMain {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String titulo, autor;
	        int ejemplares;

	        //se crea el objeto libro1 utilizando el constructor con parametros
	        Ej001Sol libro1 = new Ej001Sol("El Quijote", "Cervantes", 1, 0);
	        
	        
	        //se muestran por pantalla los datos del objeto libro1
	        //se utilizan los metodos getters para acceder al valor de los atributos
	        System.out.println("Libro 1:");
	        System.out.println("Titulo: " + libro1.getTitulo());
	        System.out.println("Autor: " + libro1.getAutor());
	        System.out.println("Ejemplares: " + libro1.getEjemplares());
	        System.out.println("Prestados: " + libro1.getPrestados());
	        System.out.println();

	        //se realiza un prestamo de libro1. El metodo devuelve true si se ha podido
	        //realizar el prestamo y false en caso contrario
	        if (libro1.prestamo()) {
	            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	        } else {
	            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	        }

	        //se realiza una devolucion de libro1. El metodo devuelve true si se ha podido
	        //realizar la devolucion y false en caso contrario
	        if (libro1.devolucion()) {
	            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
	        } else {
	            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
	        }

	        //se realiza otro prestamo de libro1
	        if (libro1.prestamo()) {
	            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	        } else {
	            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	        }

	        //se realiza otro prestamo de libro1. En este caso no se podra realizar ya que
	        //solo hay un ejemplar de este libro y ya esta prestado. Se mostrara por
	        //pantalla el mensaje No quedan ejemplares del libro
	        if (libro1.prestamo()) {
	            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
	        } else {
	            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
	        }
	        //mostrar los datos del objeto libro1
	        System.out.println("\nLibro 1:");
	        System.out.println("Titulo: " + libro1.getTitulo());
	        System.out.println("Autor: " + libro1.getAutor());
	        System.out.println("Ejemplares: " + libro1.getEjemplares());
	        System.out.println("Prestados: " + libro1.getPrestados());
	        System.out.println();

	        //se crea el objeto libro2 utilizando el constructor por defecto
	        Ej001Sol libro2 = new Ej001Sol();

	        System.out.print("Introduce titulo: ");
	        titulo = sc.nextLine();
	        System.out.print("Introduce autor: ");
	        autor = sc.nextLine();
	        System.out.print("Numero de ejemplares: ");//Prestados, inicialmente vale 0
	        ejemplares = sc.nextInt();
	        sc.close();
	        //se asigna a libro2 los datos pedidos por teclado.
	        //para ello se utilizan los metodos setters
	        libro2.setTitulo(titulo);
	        libro2.setAutor(autor);
	        libro2.setEjemplares(ejemplares);

	        //se realiza una devolucion de libro2. El metodo devuelve true si se ha podido
	        //realizar la devolucion y false en caso contrario
	        if (libro2.devolucion()) {
	            System.out.println("\nSe ha devuelto el libro " + libro2.getTitulo());
	        } else {
	            System.out.println("\nNo hay ejemplares del libro " + libro2.getTitulo() + " prestados");
	        }
	        
	        //mostrar los datos del objeto libro2
	        System.out.println("Libro 2:");
	        System.out.println("Titulo: " + libro2.getTitulo());
	        System.out.println("Autor: " + libro2.getAutor());
	        System.out.println("Ejemplares: " + libro2.getEjemplares());
	        System.out.println("Prestados: " + libro2.getPrestados());
	        System.out.println();
	        
	        System.out.println("\nProbamos toString()\n");
	        System.out.println("\nLibro1\n_______\n\n" +  libro1);
	        System.out.println("\nLibro2\n_______\n\n" + libro2);
	    }
	}