package ejemplos005_condicionales;

import java.util.Scanner;


public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		//Seleccion multiple: mes
		
		int mes, dias;
		
		System.out.print("Introduce un mes: ");
		mes = sc.nextInt();
		
		if (mes == 12 || mes == 1 || mes == 2) 
			System.out.println ( "Invierno"); 
		else if (mes == 3 || mes == 4 || mes == 5) 
			System.out.println( "Primavera"); 
		else if (mes == 6 || mes == 7 || mes == 8) 
			System.out.println ("Verano"); 
		else 
			System.out.println ("Otono");

		
		
		
		//SWITCH
		
		switch (mes) { 
			case 4: 	
			case 6: 	
			case 9: 	
			case 11: 	dias = 30; 
						break; 
			case 2: 	dias = 28; 
						break; 
			default: 	dias = 31; 
						break; 
			}
		
		//Si no pones el break; te ejecuta todos los casos siguientes hasta
		//que encuentre un break;
		
		System.out.println ("Dias: " +dias);
		
		sc.close();
		
	}

}
