//5. Haz un programa que pida un número por teclado y 
//después diga si el número introducido es capicúa o no.
//Con arrays.

package m1_unidimensionales2;

import java.util.Scanner;

public class Ej005Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, num2, size;
		boolean flag = true;
		
		System.out.print("Dime el numero: ");
		num = Math.abs(Integer.parseInt(sc.nextLine()));
		
		num2 = num;
		size = 0;
		
		while(num2>0) {
			size++;
			num2 = num2/10;
		}
		
		int [] a = new int[size];
		
		num2 = num;
		for(int i=0; i<a.length; i++) {
			a[i] = num2%10;
			num2 = num2/10;
		}
		
		for(int i=0; i<(a.length/2) && flag; i++) {
			if(a[i] != a[a.length-1-i])
				flag = false; 
		}
		
		System.out.println("El numero " +num +": " +(flag ? "Es capicua" : "No es capicua"));
	}

}
