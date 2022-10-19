//2.- Realiza un programa que lea un número entero y creando una función 
//llamada esCapicua devuelva si es capicúa o no lo es (true y false respectivamente). 
//Para ello, conviértelo en una cadena de caracteres y utiliza métodos de 
//cadenas/caracteres.

//3.- Crea una función en Java que reciba una cadena de caracteres y devuelva 
//esta cadena invertida.

//4.- Crea una función en Java que reciba una palabra y la devuelva invertida 
//con efecto espejo, esto es, se concatena a la palabra original su inversa, 
//compartiendo la última letra, que hará de espejo, por lo que la palabra 
//obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir 
//“teclado” devolverá “tecladodalcet”  y al introducir “goma” devolverá “gomamog”.



package ejercicios;

import java.util.Scanner;


public class Ej002CapiVolteaEspejo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Caracteres a voltear: ");
		System.out.println(voltea(leer(sc)));
		System.out.println("Caracteres capicua: ");
		System.out.println(esCapicua(leer(sc)));
		System.out.println("Caracteres ejecto espejo: ");
		System.out.println(espejo(leer(sc)));
	}
	
	//CTRL + Space + "method" = create method
	//Al no poner public se asume que es eso por defecto
	//Como es una biblioteca mejor un estatico
	
	public static String leer(Scanner teclado) {
		return teclado.nextLine();
	}
	
	public static long toLong(String nS) {
		return Long.parseLong(nS);
	}
	
	
	//3
	public static String voltea(String nS) {
		String volteado = "";
		
		for(int l=nS.length(); l>0; l--) {
			volteado += nS.substring(l-1, l);
		}
		return volteado;
	}
	
	
	//2
	public static boolean esCapicua(String nS) {
		boolean capicua = false;
		
		if(nS.equals(voltea(nS)))
			capicua = true;
		
		return capicua;
	}
	
	//4
	public static String espejo(String nS) {
		String espejo = nS;
		return espejo.concat(voltea(nS));
	}


}