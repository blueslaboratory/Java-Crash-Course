//Algoritmo que pida dos numeros nota y edad y un caracter sexo y muestre el mensaje 
//ACEPTADA si la nota es mayor o igual a cinco, la edad es mayor o igual a dieciocho y 
//el sexo es F. En caso de que se cumpla lo mismo, pero el sexo sea M, debe imprimir 
//POSIBLE. Si no se cumplen dichas condiciones se debe mostrar NO ACEPTADA.


package repaso;

import java.util.Scanner;


public class Ej008NotaEdadSexo {
	
	public static void main(String[] args){
		
		float nota, edad;
		String sexo;
		Scanner sc = new Scanner(System.in);
		
//		Integer n;
//		
//		Character letra = 'h';
//		
//		if (Character.isDigit(letra)) //'4'
//			System.out.println("Es un digito");
//		else
//			System.out.println("No es un digito");
//		
//		Integer n es una variable que apunta a una clase
//		(int i seria una declaracion de tipo simple)
//		Cuando pones n. te salen todos los metodos asociados 
//		a la clase.
//		La clase de un char es Character.
//		https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Character.html#isDigit(char)
//		he metido el n para destacar el ejercicio con un warning
		
		
		
		do {
			System.out.print("Escribe tu nota (0-10): ");
			nota = Float.parseFloat(sc.nextLine());
			//nota = sc.nextFloat();
		//} while (nota<0 || nota>10);
		} while (!(nota>=0 && nota <=10)); //HASTA QUE
		
		do {
			System.out.print("Escribe tu edad (years): ");
			edad = Float.parseFloat(sc.nextLine());
			//edad = sc.nextFloat();
		//} while (edad<0);
		} while (!(edad>0));
		
		do {
			//sc.nextLine(); // Limpiando el buffer
			System.out.print("Escribe tu sexo (M/F): ");
			sexo = sc.nextLine();
			sexo = sexo.toUpperCase();
		//} while (sexo.compareTo("F") != 0 && (sexo.compareTo("M") != 0));
		} while ((!sexo.equals("F") && !sexo.equals("M")));
		//sexo distinto de F y distinto de M: True*True
		
		
		
		// FORMA FACIL
		if (sexo.equals("F") && nota >= 5 && edad >= 18)
			System.out.println("ACEPTADA");
		else if (sexo.equals("M") && nota >= 5 && edad >= 18)
			System.out.println("POSIBLE");
		else
			System.out.println("NO ACEPTADA");
		
		
		
		// SEXO CON UN CHARACTER
		Character s;
		s = 'X';
		do {
			System.out.print("Escribe tu sexo (M/F): ");
			sexo = sc.nextLine();
			if (sexo.length() != 1)
				System.out.println("Debe ser una letra");
			else {
				s = sexo.charAt(0);
				//convertimos un String a char
				//la 1era posicion es 0
				//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#charAt(int)
				s = Character.toUpperCase(s);
				if (s == 'F' || s == 'M') 
					System.out.println("Es correcto");	
				else
					System.out.println("No es correcto");
			}
		//} while ((s != 'F' && s != 'M'));
		} while (!(s == 'F' || s == 'M'));
		
		

		sc.close();	
	}
}
