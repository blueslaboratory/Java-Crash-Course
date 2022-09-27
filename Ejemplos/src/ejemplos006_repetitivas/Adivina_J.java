package ejemplos006_repetitivas;

import java.util.Scanner;


public class Adivina_J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sol, i, num;
		Scanner sc = new Scanner(System.in);
		
		sol = 77;
		i = 5;
		num = 0;
		
		while (i>0 && num!=sol) {
			System.out.print("Tienes " +i +" intentos para averiguar un numero del [1-100]: ");
			num = sc.nextInt();
			
			i = i-1;
			
			if (num == sol)
				System.out.println("Numero correcto!");
		}
		
		sc.close();
	}

}
