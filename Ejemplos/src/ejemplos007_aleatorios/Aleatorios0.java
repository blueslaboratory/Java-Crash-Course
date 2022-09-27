package ejemplos007_aleatorios;

import java.util.Random;

public class Aleatorios0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random();
		
		//En general, para conseguir un numero entero entre [N, M] 
		//con N < M y ambos incluidos, debemos usar esta formula: 
		//int valorEntero = Math.floor(Math.random()*(M-N+1)+N);  
		//Valor entre M y N, ambos incluidos.
		
		
		for (int i = 0; i < 10; i++) {
	        System.out.println("Numero " +i +": " +rnd.nextDouble());;
	    }
		
		
		int x;
		for (int i = 0; i < 10; i++) {
	        	x = (int)(rnd.nextDouble() * 10.0);
	        	//[0,9]
	        	System.out.println("Numero " +i +": " +x);
	    	}
	}

}
