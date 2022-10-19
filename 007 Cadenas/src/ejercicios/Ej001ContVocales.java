//1.- Realiza un programa que lea 11 cadenas de caracteres, 
//para mostrar al final la que contenga el mayor número de 
//vocales, ya sean mayúsculas o minúsculas. Se consideran 
//además de las 5 vocales, todas las vocales acentuadas y la ü.

//INTENTOS:I
//SOLUCION


package ejercicios;
import java.util.Scanner;

public class Ej001ContVocales {
	public static void main(String[] args) {
		final int NUM = 3; //11
		int contVocales; //Contador de vocales de cada cadena
		int maxContVocales = 0;
		String mayorNumeroVocales = "";
		String cadenaOriginal;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<NUM; i++) {
			System.out.println("Introduce cadena " +(i+1) + ":");
			cadenaOriginal = sc.nextLine();
			
			contVocales = numVocales1(cadenaOriginal);
			
			if(contVocales > maxContVocales) { 
				maxContVocales = contVocales;
				mayorNumeroVocales = cadenaOriginal;
			}
		}
		
		if(maxContVocales!=0) {
			System.out.println("La cadena con mas vocales introducida es:\n" +mayorNumeroVocales);
			System.out.println("Tiene: " +maxContVocales +" vocales");
		}
		else
			System.out.println("Ninguna cadena tenia vocales");
		
		sc.close();
	}
		
			 
	
	public static int numVocales1(String mensaje) {
		String cadenaMinus;
		
		cadenaMinus = mensaje.toLowerCase();
		int nVoc = 0;
		
		for(int j=0; j<cadenaMinus.length(); j++) {
			//si es <= te salta una excepcion, se pasa de la length
			switch(cadenaMinus.charAt(j)) {
				case 'a':
				case 'á':
				case 'e':
				case 'é':
				case 'i':
				case 'í':
				case 'o':
				case 'ó':
				case 'u':
				case 'ú':
				case 'ü':
					System.out.println(+nVoc +":" +cadenaMinus.charAt(j));
					nVoc++;
					break;
			}
			
		}
		return nVoc;
	}
}


//RONNY
//
//	public static void main(String[] args) {
//		Scanner sc  = new Scanner(System.in);
//		int ncadenas=1, npeticion=1;
//		String cadenamayor="", cadenanueva;
//		
//		System.out.println("Introduce la 1ª cadena");
//		cadenanueva=sc.nextLine();
//		ncadenas++;
//		do {
//			if (contarVocales(cadenanueva)>contarVocales(cadenamayor)) {
//				cadenamayor=cadenanueva;
//			}
//			npeticion++;
//			System.out.println("Introduce la "+npeticion+"ª cadena);
//			cadenanueva=sc.nextLine();
//			ncadenas++;
//		} while(ncadenas<=11);
//		
//		System.out.println("La cadena mayor es: '"+cadenamayor+"' con "+contarVocales(cadenamayor)+" vocales.");
//		
//		sc.close();
//		
//	}
//	
//	
//	public static int contarVocales(String cadena) {
//		cadena=cadena.toLowerCase();
//		int cont = 0;
//	for(int x=0;x<cadena.length();x++) {
//		 if ((cadena.charAt(x)=='a') || 
//			 (cadena.charAt(x)=='e') || 
//			 (cadena.charAt(x)=='i') || 
//			 (cadena.charAt(x)=='o') || 
//			 (cadena.charAt(x)=='u') || 
//			 (cadena.charAt(x)=='á') || 
//			 (cadena.charAt(x)=='é') || 
//			 (cadena.charAt(x)=='í') || 
//			 (cadena.charAt(x)=='ó') ||
//			 (cadena.charAt(x)=='ü') || 
//			 (cadena.charAt(x)=='ú') ){ 
//		    cont++;
//		  }
//		}
//	return cont;
//	}
