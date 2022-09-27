/*
Construye una interfaz llamada Relacionable que incluya los 
siguientes metodos:

// Devuelve verdadero si a es mayor que b
boolean esMayor(Object b);
// Devuelve verdadero si a es menor que b
boolean esMenor(Object b);
// Devuelve verdadero si a es igual que b
boolean esIgual(Object b);
Crea 3 clases:
	Fraccion
	Linea //comparas longitud
	Rectangulo //comparas el area

que implementen el interfaz Relacionable.
Crea un programa que instancie cada una de las clases y aplique 
sus metodos para probarlos.
*/
package relacionable;

public class Main {
	
	public static void main(String[] args) {
		
		Fraccion f1 = new Fraccion(3, 4);
		Fraccion f2 = new Fraccion(2, 4);
		try {
			System.out.println(f1 +">" +f2 +": " +f1.esMayor(f2));
			System.out.println(f1 +"<" +f2 +": " +f1.esMenor(f2));
			System.out.println(f1 +"=" +f2 +": " +f1.esIgual(f2));
			System.out.println();
		} catch (NoEsFraccion e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
			//e.printStackTrace();
		}
		
		
		
		Punto p1 = new Punto(2,3);
		Punto p2 = new Punto(6,6);
		Punto p3 = new Punto(7,9);
		Punto p4 = new Punto(1,0);
		
		Linea l1 = new Linea(p1, p2);
		Linea l2 = new Linea(p3, p4);
		try {
			System.out.println(l1.longitud() +">" +l2.longitud() +": " +l1.esMayor(l2));
			System.out.println(l1.longitud() +"<" +l2.longitud() +": " +l1.esMenor(l2));
			System.out.println(l1.longitud() +"=" +l2.longitud() +": " +l1.esIgual(l2));
			System.out.println();
		} catch (NoEsLinea e1) {
			// TODO Auto-generated catch block
			System.out.println("Error");
			//e.printStackTrace();
		}
		
		
		
		Rectangulo r1 = new Rectangulo(p1, p2, p3, p4);
		Rectangulo r2 = new Rectangulo(p1, p2, p3, p4);
		try {
			System.out.println(r1.area() +">" +r2.area() +": " +r1.esMayor(r2));
			System.out.println(r1.area() +"<" +r2.area() +": " +r1.esMenor(r2));
			System.out.println(r1.area() +"=" +r2.area() +": " +r1.esIgual(r2));
			System.out.println();
		} catch (NoEsRectangulo e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		//Comparaciones de objetos distintos
		try {
			System.out.println(f1.esMayor(l1));
		} catch (NoEsFraccion e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Excepcion NoEsFraccion");
			System.out.println();
			//e.printStackTrace();
		}
		try {
			System.out.println(l1.esIgual(r2));
		} catch (NoEsLinea e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Excepcion NoEsLinea");
			System.out.println();
			//e.printStackTrace();
		}
		try {
			System.out.println(r2.esIgual(f1));
		} catch (NoEsRectangulo e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Excepcion NoEsRectangulo");
			System.out.println();
			//e.printStackTrace();
		}
		try {
			System.out.println(f1.esMayor(l1));
			System.out.println("No llega aqui, salta la excepcion antes");
			System.out.println(l1.esIgual(r2));
			System.out.println(r2.esIgual(f1));			
		} catch (NoEsFraccion | NoEsLinea | NoEsRectangulo e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Excepcion multiple");
			//e.printStackTrace();
		}
		
	}
}