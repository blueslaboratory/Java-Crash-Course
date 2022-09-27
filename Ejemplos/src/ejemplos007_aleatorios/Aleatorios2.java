package ejemplos007_aleatorios;

import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom; //Forma 3

public class Aleatorios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		
		
		System.out.print("\nGeneramos 10 enteros\n");
		for (int i=0; i<10; i++) {
			System.out.print("\t" +rnd.nextInt()); //tabulador
		}
		System.out.println("");
		
		
		System.out.print("\nGeneramos 10 enteros largos\n");
		for (int i=0; i<10; i++) {
			System.out.print("\t" +rnd.nextLong()); //tabulador
		}
		System.out.println("");
		
		
		//Dos secuencias de 5 numero (distinta semilla)
	    System.out.println("\nPrimera secuencia");
	    for (int i = 0; i < 5; i++) {
	        System.out.print("\t"+rnd.nextDouble());
	    }
	    System.out.println("");

	    System.out.println("\nSegunda secuencia");
	    for (int i = 0; i < 5; i++) {
	        System.out.print("\t"+rnd.nextDouble());
	    }
	    System.out.println("");

	    
	    //Dos secuencias de 5 numero (misma semilla)
	    rnd.setSeed(3816L);
	    System.out.println("\nPrimera secuencia");
	    for (int i = 0; i < 5; i++) {
	        System.out.print("\t"+rnd.nextDouble());
	    }
	    System.out.println("");

	    rnd.setSeed(3816);
	    System.out.println("\nSegunda secuencia");
	    for (int i = 0; i < 5; i++) {
	        System.out.print("\t"+rnd.nextDouble());
	    }
	    System.out.println("");
		
		
	    
		//Capturando una excepcion
		//try {
		//	System.in.read(); //espera la pulsacion de una tecla y luego RETORNO
		//}
		//catch (Exception e) {}
		
			
		//Capturando una excepcion: autocompletada desde: System.in.read();
		try {
			System.in.read(); //espera la pulsacion de una tecla y luego RETORNO
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
