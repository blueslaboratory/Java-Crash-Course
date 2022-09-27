package ejemplos005_condicionales;

import java.util.Scanner;


public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mes;
		int dias;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introducir el mes de manera escrita: ");
		mes = sc.nextLine();
		
		switch (mes.toLowerCase()) { 
			case "enero": 		
			case "marzo": 		
			case "mayo": 		 
			case "julio":	 	 
			case "agosto":	 	 
			case "octubre": 	
			case "diciembre": 	
				dias = 31;
				break;
			
			case "febrero": 	
				dias = 28; 
				break;
			
			case "abril":
			case "junio":
			case "septiembre":
			case "noviembre":
				dias = 30; 
				break;
			
			default: 			
				System.out.println ("Mes incorrecto");
				dias = 0;
				break; 
		}
		
		//Si no pones el break; te ejecuta todos los casos siguientes hasta
		//que encuentre un break;
		
		System.out.println ("Dias de tu mes: " +dias);
		
		sc.close();
		
	}

}
