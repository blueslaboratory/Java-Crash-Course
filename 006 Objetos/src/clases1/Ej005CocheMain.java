//SOLUCION

package clases1;

public class Ej005CocheMain {
	public static void main(String args[]){
		
		Ej005Coche cocheA = new Ej005Coche();	
		
		// Creo un coche con el constructor por defecto
		System.out.println("Coche por defecto");
		cocheA.escribeCoche();
		cocheA.ponMatricula("2222-DSD");
		cocheA.ponMarca("Nissan");
		cocheA.ponNumPuertas(4);
		cocheA.pintaCoche("verde");
		
		System.out.println("\nAntes de pintar");
		cocheA.escribeCoche();	
		
		cocheA.pintaCoche("naranja");
		System.out.println("\nDespues de pintar de naranja");
		cocheA.escribeCoche();
		
		System.out.println("\nPintamos el primer coche a traves de un metodo");
		cambiaCoche(cocheA);
		cocheA.escribeCoche();
		
		// Creo un coche con el constructor con parametros
		Ej005Coche cocheB = new Ej005Coche("rojo", "Volvo", "1111-ABC", 5 );
		cocheB.escribeCoche();
		
		System.out.println("\nImprimimos los coches con toString()");
		System.out.println(cocheA);
		System.out.println(cocheB);
	}
	
	public static void cambiaCoche(Ej005Coche coche) {
		coche.pintaCoche("rosa");
	}

}
