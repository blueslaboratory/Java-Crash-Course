//6.- Crea una funci�n en Java que reciba dos cadenas de caracteres 
//y que devuelva la primera cadena, pero transformando en may�sculas 
//la parte que coincide con la segunda cadena introducida. Por ejemplo, 
//si se introducen las cadenas �Este es mi amigo Juan� y �amigo�, 
//devolver� �Este es mi AMIGO Juan�.



//SOLUCION CHUNGA (ESTHER)

package ejercicios;

import java.util.Scanner;

public class Ej006ReemplazarMayus3{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String cadena, subcadena;
		
//		System.out.println("Introduzca la cadena en la que buscar");
//		cadena = scan.nextLine();
//		System.out.println("Introduzca la subcadena a buscar");
//		subcadena = scan.nextLine();

		cadena = "hola como estamos y tu como estas. Pues como tu, mas o menos bien";
		subcadena = "como";
		
		System.out.println(ponerMayuscula2(cadena, subcadena));
		scan.close();
	}

	public static String ponerMayuscula(String cad, String subCad) {
	String subcadenaUpper;

		subcadenaUpper = subCad.toUpperCase();
		return cad.replace(subCad, subcadenaUpper);
	}
	
	public static String ponerMayuscula2(String cad, String subCad) {
		int posicion=0;
		String subcadenaUpper, nuevaCadena = "", cadenaOr= cad;

		subcadenaUpper = subCad.toUpperCase();
		
			while (posicion>=0) {				
				posicion = cadenaOr.indexOf(subCad, posicion);			
				if (posicion >= 0) {
					// posicion++;					
					nuevaCadena += cadenaOr.substring(0, posicion) + subcadenaUpper + 
							cadenaOr.substring(posicion+subcadenaUpper.length(), cadenaOr.length());
					posicion += subCad.length();
					cadenaOr = nuevaCadena;
					nuevaCadena = "";
				}
			}	
			
			return cadenaOr;
		}
}

