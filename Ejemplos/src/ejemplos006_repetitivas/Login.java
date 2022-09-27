package ejemplos006_repetitivas;

import java.util.Scanner;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont;
		String secreto, clave;
		Scanner sc = new Scanner(System.in);
		
		secreto = "asdasd";
		clave = "a";
		
		// hay 2 formas de comparar strings en java, compareTo y equals
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#compareTo(java.lang.String)

		// NOOO! if (clave == "a" && secreto == "asdasd") 

		// EQUALS
		// if (clave.equals("a") && secreto.equals("asdasd"))
		// COMPARETO
		// if (clave.compareTo("a")==0 && (secreto.compareTo("asdasd")==0))
		
		
		//CON WHILE 	Y 	 .compareTo
		cont = 1;
		while (clave.compareTo(secreto)!=0 && cont<=5) {
			System.out.print("Intento " +cont +". Dime la clave: ");
			clave = sc.nextLine();
			
			if (clave.compareTo(secreto)==0)
				System.out.println("Bienvenido!");
			else
				System.out.println("Clave incorrecta");
			
			cont = cont+1;
		}
		
		if (clave.compareTo(secreto)!=0)
			System.out.println("No puedes pasar");
		
		
		
		//CON DO-WHILE 		Y 		equals
		cont = 5;
		
		do {
			System.out.println("Intentos restantes: " +cont);
			System.out.print("Dime la clave otra vez: ");
			clave = sc.nextLine();
			
			if (clave.equals(secreto))
				System.out.println("Bienvenido!");
			else
				System.out.println("Clave incorrecta");
			
			cont = cont-1;
			
		} while(!clave.equals(secreto) && cont!=0);
		
		if (!clave.equals(secreto))
			System.out.println("No puedes pasar");
		
		sc.close();
	}

}
