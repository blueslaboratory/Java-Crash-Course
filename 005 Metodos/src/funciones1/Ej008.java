//8.- Crea una aplicaci�n que nos cuente el n�mero de cifras de un 
//n�mero entero positivo (hay que controlarlo) pedido por teclado. 
//Crea un m�todo que realice esta acci�n, pasando el n�mero por 
//par�metro, devolver� el n�mero de cifras.


package funciones1;

import java.util.Scanner;
//Te autocompleta el import al crear el objeto Scanner

public class Ej008 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		//LONGITUD INTEGER
		int num1;

		do {
			System.out.print("Dime un int > 0: ");
			num1 = (int)Float.parseFloat(sc.nextLine());
		} while (num1 <= 0);

		System.out.println("Longitud " +num1 +": " +longitudInt(num1));
		System.out.println("cuentaCifras " +num1 +": " +cuentaCifras(num1));
		
		
		
		// LONGITUD FLOAT - NO FUNCIONA (EL EJERCICIO DICE ENTEROS +)
		float num;

		do {
			System.out.print("Dime un float > 0: ");
			num = Float.parseFloat(sc.nextLine());
		} while (num <= 0);

		System.out.println("Longitud " +num +": " +longitudFloat(num));
				
		
		sc.close();
		
		
		
	}
	
	//CUENTACIFRAS
	public static int cuentaCifras (int x) {
		if (x<0) 
			x=-x;
		
		if (x==0) 
			return 1;
		
		else {
			int n=0;
			while(x>0) {
				x=x/10; // se le quita un digito a x
				n++;
			}
			return n;
		}	
	}
	
	// LONGITUD INTEGER
	public static int longitudInt(int n) {
		String l = "" + n;
		System.out.println("l: " + l);
		int longitud = l.length();
		return longitud;
	}
	
	
	//LONGITUD FLOAT
	public static float longitudFloat(float n) {
		String l = "" +n;
		System.out.println("l: " +l);
		float longitud = l.length()-2;
		return longitud;
	}
	
}
