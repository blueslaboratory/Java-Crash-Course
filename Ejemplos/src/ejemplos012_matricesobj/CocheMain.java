package ejemplos012_matricesobj;

import java.util.Scanner;

public class CocheMain {
	public static void main(String args[]){
		final int TAM = 3;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		//ARRAY DE COCHES
		//son espacios de refencia donde se guarda la direccion de los coches
		//no estamos creando los coches
		Coche[] misCoches = new Coche[TAM];
		
		
		// Creo un coche con el constructor con par�metros
		Coche coche1 = new Coche("rojo", "Volvo", "1111-ABC", 5 );
		misCoches[i++] = coche1;
		
		//Me puedo ahorrar el coche1:
		misCoches[i++] =  new Coche("rojo", "Volvo", "1111-ABC", 5 );
		
		
		System.out.println(coche1);
		System.out.println(misCoches[0]);//Esto solo me muestra la referencia
		
		System.out.println();
		for(Coche c: misCoches) {
			if(c!=null) System.out.println(c);
		}
			
		System.out.println();
		for(int j=0; j<misCoches.length; j++)
			System.out.println(j +": " +misCoches[j]);
		
		
		//No podemos acceder a un coche que no existe: Excepcion Null
		//System.out.println(misCoches[3].devColor());
		
		
		//metodo rellenar coches
		System.out.println("\nRellenar coches:");
		rellenarCoches(misCoches, sc);
		//metodo imprimir coches
		System.out.println("\nImprimir coches:");
		imprimirCoches(misCoches);
		//metodo coches determinado color
		System.out.println("\nImprimir coches de un color:");
		imprimirCocheColor(misCoches, "rojo");
		
	}
	
	public static void rellenarCoches(Coche[] coches, Scanner teclado) {
		
		for(int j=0; j<coches.length; j++) {
			System.out.println("Coche " +j);
			coches[j] = new Coche();
			
			System.out.print("Color: ");
			coches[j].pintaCoche(teclado.nextLine()); 
			System.out.print("Marca: ");
			coches[j].ponMarca(teclado.nextLine());
			System.out.print("Matricula: ");
			coches[j].ponMatricula(teclado.nextLine());
			System.out.print("Puertas: ");
			coches[j].ponNumPuertas(Integer.parseInt(teclado.nextLine()));
		}
	}
	
	public static void imprimirCoches(Coche[] coches) {
		for(Coche c: coches) {
			if(c!=null) System.out.println(c);
		}
	}
	
	public static void imprimirCocheColor(Coche[] coches, String color) {
		for(int j=0; j<coches.length; j++) {
			if((coches[j].devColor()).equalsIgnoreCase(color)) 
				System.out.println(coches[j]);
		}
	}
	
	
}

