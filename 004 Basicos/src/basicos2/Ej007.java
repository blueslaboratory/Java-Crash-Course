//7. Haz un programa que calcule la suma de los numeros pares comprendidos entre 10 y 50.

package basicos2;

public class Ej007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, suma;
		
		
		suma = 0;
		
		for (i=10; i<=50; i+=2) {
			suma += i;
			System.out.print("+" +suma);
		}
		
		System.out.println("\nSuma = " +suma);
		
		
		suma = 0;
		
		for (i=10; i<=50; i++) {
			if (i%2 == 0) 
				suma += i;
		}
		
		System.out.println("Suma = " +suma);
		
	}

}
