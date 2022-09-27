//5. Haz un programa que pida un número, entre 0 y 10, 
//y escriba un triangulo invertido con dichos numeros. 
//Ej: Si n=10, quedaría 
//0,1,2,3,4,5,6,7,8,9 
//1,2,3,4,5,6,7,8,9 
//2,3,4,5,6,7,8,9 
//3,4,5,6,7,8,9 
//4,5,6,7,8,9 
//5,6,7,8,9 
//6,7,8,9 
//7,8,9 
//8,9 
//9


package basicos4;

import java.util.Scanner;

public class Ej005ArbolInv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numUsu, i;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Dime un numero entre 0 y 10: ");
			numUsu = Integer.parseInt(sc.nextLine());
		} while (numUsu>10 || numUsu<0);
		
		for(i=-1; i<=numUsu; i++) {
			System.out.println();
			
			for(int j=i+1; j<=numUsu; j++)
				if (j<numUsu)
					System.out.print(j +",");
				else //j=numUsu
					System.out.print(j);
		}
		
		sc.close();
	}

}
