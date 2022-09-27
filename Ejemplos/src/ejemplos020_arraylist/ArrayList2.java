package ejemplos020_arraylist;

import java.util.*;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros = introduce(numeros);
		
		System.out.println("Ha introducido: " + numeros.size() + " numeros:");
		System.out.println(numeros); // Muestra el arrayList completo
		
		double suma;
		suma = suma(numeros);
		
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + suma/numeros.size());
	}
	
	public static ArrayList<Integer> introduce(ArrayList<Integer> numeros){
		Scanner teclado = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Introduce numeros enteros. 0 para acabar: ");
			System.out.print("Numero: ");
			n = teclado.nextInt();
			
			if (n != 0)
				numeros.add(n);
			
		} while (n != 0);
		return numeros;
	}
	
	public static double suma(ArrayList<Integer> numeros) {
		Iterator<Integer> it = numeros.iterator();
		double suma = 0;
		
		while (it.hasNext()) 
			suma = suma + it.next();

		return suma;
	}
}
