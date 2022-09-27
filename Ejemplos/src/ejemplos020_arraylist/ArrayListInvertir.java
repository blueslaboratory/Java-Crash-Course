package ejemplos020_arraylist;

import java.util.*;

public class ArrayListInvertir {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("Ana");
		nombres.add("Luisa");
		nombres.add("Felipe");
		nombres.add("Pablo");
		
		System.out.println("\nInvertir1: ");
		System.out.println(nombres);
		nombres = invertir1(nombres);
		System.out.println(nombres);
		
		System.out.println("\nInvertir2: ");
		System.out.println(nombres);
		invertir2(nombres);
		System.out.println(nombres);
		
		System.out.println("\nInvertir3: ");
		System.out.println(nombres);
		invertir3(nombres);
		System.out.println(nombres);
		
		System.out.println("\nInvertir4: ");
		System.out.println(nombres);
		invertir4(nombres);
		System.out.println(nombres);
	}

	public static ArrayList<String> invertir1(ArrayList<String> nombres) {
		ArrayList<String> resultado = new ArrayList<String>();
		
		for (int i=nombres.size()-1; i>=0; i--)
			resultado.add(nombres.get(i));
		
		return resultado;
	}
	
	public static void invertir2(ArrayList<String> nombres) {
		for(int i=nombres.size()-1; i>=0; i--) {
			nombres.add(nombres.get(i));
			nombres.remove(i);
		}
	}
	
	public static void invertir3(ArrayList<String> nombres) {
		int j, tam = nombres.size();
		String aux = "";
		
		j = tam-1;
		for(int i=0; i<tam/2; i++) {
			aux = nombres.get(i);
			nombres.set(i, nombres.get(j));
			nombres.set(j--, aux);
		}
	}
	
	public static void invertir4(ArrayList<String> nombres) {
		Collections.reverse(nombres);
	}
}
