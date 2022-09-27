//################################################################################
//Mostrar en pantalla los N primero números primos. Se pide por teclado la cantidad 
//de números primos que queremos mostrar.
//################################################################################
//Análisis
//Tengo que leer la cantidad de números primos que voy a mostrar. La cantidad debe 
//ser positivo. El primer número primo es el 2 (lo muestro) a partir de este son 
//todos impares. Voy probando desde el 3 todos los impares hasta que muestre la 
//cantidad que hemos indicados (necesito un contador).
//Para comprobar si son primos, los voy dividiendo desde 3 hasta la raíz cuadrada
//del número, si es divisible por algún número no es primo (necesito un indicador).
// Datos de entrada: Cantidad de números a mostrar.
// Información de salida: Los números primos indicados.
// Variables: cant_a_mostrar, cant_mostradis, divisor (entero), es_primo(lógico)
//################################################################################
//Diseño
//1.- Leer cantidad de número primos a mostrar, debe ser positivo
//2.- Muestro el primer número primo, el 2.
//3.- Inicializo el contador de número mostrados a 1.
//4.- Inicializo la variable donde guardo el número a probar -> num=3
//4.- Mientras no haya mostrado la cantidad de número indicados
//		5.- Considero que es primo. Inicializo el indicador -> es_primo=Verdadero
//		6.- desde el 3 hasta la raíz cuadrada del número
//			7.- Si es divisible -> Ya no es primo -> es_primo=Falso
//		8.- Si es primo
//			9.- Incremento el contador de números mostrados
//			10.- Escribo el número primo
//		11.- Como son impares, incremento en 2 el número a probar
//################################################################################

//YO CREO QUE LA SOLUCION ESTA MAL; O AL MENOS NO LA ENTIENDO
//ME PARECE DEMASIADO COMPLICADO PARA QUE LO PREGUNTE

//HACERLO CON EL DEBUG
//PASO A PASO MOSTRANDO: num, divisor, num-1, es_primo
//Lo he puesto en modo facil




package funciones1;

import java.util.Scanner;


public class Ej020PrimosMetodos {
	//Puede ser un ejercicio de nivel examen de la primera evaluacion perfectamente

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int cant_a_mostrar, num, cant_mostrados, divisor;
	    boolean es_primo;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.print("Ingrese la cantidad de numeros primos a mostrar: ");
			cant_a_mostrar = sc.nextInt();
		} while (cant_a_mostrar<=0);
		
	    
		System.out.println("1:\t 2"); // el primer primo es 2, los otros son todos impares...
	    cant_mostrados = 1;
	    num = 3;            // ...a partir de 3
	    
	    while (cant_mostrados<cant_a_mostrar) {
	    	es_primo = true; // pienso que es primo hasta que encuentre con que dividirlo
	    	divisor = 2;
	    	
	    	es_primo = comprobarPrimos(num, divisor, es_primo);
	  			
  	        if (es_primo) {
  	        	cant_mostrados += 1;
  	        	System.out.println(cant_mostrados +":\t " +num);
  	        }
  	           
  			num += 1;
  			//num = num + 2 ;  			
	    }
	    
	    sc.close();
	}
	
	public static Boolean comprobarPrimos(int num, int divisor, boolean es_primo) {
		
		for (divisor=2; divisor<(num-1) && es_primo; divisor++) {
	    	// for (divisor=3; divisor<Math.sqrt(num); divisor +=2) 
	    	// ya sabemos que es impar
			
			if (num % divisor == 0) {
	    		// si la division da exacta...
	    		es_primo = false;  // ...ya no es primo		
	    		}		
	    	}
		
		return es_primo;
	}
	

}

