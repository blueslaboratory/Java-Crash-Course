//6.- Crea una función en Java que reciba dos cadenas de caracteres 
//y que devuelva la primera cadena, pero transformando en mayúsculas 
//la parte que coincide con la segunda cadena introducida. Por ejemplo, 
//si se introducen las cadenas “Este es mi amigo Juan” y “amigo”, 
//devolverá “Este es mi AMIGO Juan”.


package ejercicios;

import java.util.Scanner;

public class Ej006ReemplazarMayus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1, replace;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera cadena: ");
		cad1 = sc.nextLine();
		
		System.out.println("Introduce la cadena a reemplazar: ");
		replace = sc.nextLine();
		
		
		System.out.println(aMayus(cad1, replace));
		
		sc.close();
	}

	public static String aMayus(String cad1, String replace) {
		return cad1.replaceAll(replace, replace.toUpperCase());
	}
}

