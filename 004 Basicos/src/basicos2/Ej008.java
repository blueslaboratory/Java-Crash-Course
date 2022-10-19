//8. Haz un programa para imprimir una tabla de tres columnas y 
//N filas con los cuadrados y los cubos de los N primeros numeros. 
//Pide N al usuario.
//N=5
//1 1 1
//2 4 8
//3 9 27
//4 16 64
//5 25 125


package basicos2;

import java.util.Scanner;


public class Ej008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, cuadrado, cubo;
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime N: ");
		n = Integer.parseInt(sc.nextLine());
		
		for(i=1; i<=n; i++) {
			
			cuadrado = (int)Math.pow(i, 2);
			cubo = (int)Math.pow(i, 3);
					
			System.out.print(i +" " +cuadrado +" " +cubo +"\n");
			//System.out.print(i +" " +(int)Math.pow(i, 2) +" " +(int)Math.pow(i, 3) +"\n");
		}
		
		sc.close();
	}

}
