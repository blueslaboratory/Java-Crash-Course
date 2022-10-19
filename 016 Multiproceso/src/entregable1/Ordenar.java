/*

Escribe un programa Java que genera 10 numeros aleatorios impares y los escribe en la
salida estandar.

Escribe otro programa Java que recibe por la entrada estandar 10 numeros, los ordena de
menor a mayor y escribe en la salida estandar los 10 numeros ya ordenados.

Escribe un tercer programa Java que llama al primer programa, conecta la salida del primer
programa con el del segundo programa y escribe en la salida los 10 numeros generados por
el primer programa ordenados por el segundo programa.
Prueba y documenta.

*/

package entregable1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		ArrayList<Integer> desordenados = new ArrayList<Integer>();
		Integer numero, counter=10;
		
		do {
			try {
				numero = Integer.parseInt(br.readLine());
				desordenados.add(numero);
				counter--;
				
			} catch (Exception e) {
				System.out.println("Valor no numerico introducido");
				// e.printStackTrace();
				
				// seteando exitVal
				// System.exit(-1);
			}
		} while(counter>0);
		
		Collections.sort(desordenados);
		
		for(Integer i : desordenados)
	     	System.out.println(i);
		
		System.exit(69);	
	}
	
}