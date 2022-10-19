//6.- Crea una función en Java que reciba dos cadenas de caracteres 
//y que devuelva la primera cadena, pero transformando en mayúsculas 
//la parte que coincide con la segunda cadena introducida. Por ejemplo, 
//si se introducen las cadenas “Este es mi amigo Juan” y “amigo”, 
//devolverá “Este es mi AMIGO Juan”.



//SOLUCION CHUNGA (TONY)

package ejercicios;

import java.util.Scanner;

public class Ej006ReemplazarMayus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena, subCadena, remplazaCadena;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe una cadena");
		//este es mi mi amigo mi Juan mi
		cadena = teclado.nextLine();
		remplazaCadena = cadena;
		System.out.println("Escribe una cadena para ver si esta dentro");
		subCadena = teclado.nextLine();
		
		for(int cont=buscaCadena(cadena,subCadena); cont>=1; cont--) {
			remplazaCadena=buscaCadenaReemplaza(remplazaCadena,subCadena);
		}
		System.out.println(remplazaCadena);
		teclado.close();
	}	


	public static String buscaCadenaReemplaza(String cadena, String subCadena) {
		int tamanoSub = subCadena.length();
		int tamanoCad = cadena.length();
		int posiInicial = cadena.indexOf(subCadena);
		int posiFinal = posiInicial + tamanoSub;
		 
		String cadenaResultante = cadena.substring(0,posiInicial);
	 	cadenaResultante = cadenaResultante.concat(subCadena.toUpperCase());
	 	cadenaResultante = cadenaResultante.concat(cadena.substring(posiFinal, tamanoCad));
		
		
//	String cadenaResultante = cadena.replaceAll(subCadena, subCadena.toUpperCase());
		return cadenaResultante;
		}
	

	public static int buscaCadena(String cadena, String subCadena) {
		int cont = 0;
     	int posicion = cadena.indexOf(subCadena);
     	int posicionFinal= cadena.lastIndexOf(subCadena);
     	
     	System.out.println(posicion + " y " + posicionFinal);
     
     	
	  	for (int pos=0; 
	  		 pos <= posicionFinal; 
	  		 pos = cadena.indexOf(subCadena, pos)+subCadena.length()) {
	  	     //pos++) {
	  		
	  		//pos = cadena.indexOf(subCadena,pos);
	  		System.out.println("Contador: " +cont);
	  		System.out.println("Posicion: " +pos);
	  		cont++;
	  	} 
	    		  
	  	return cont;
	}
}

