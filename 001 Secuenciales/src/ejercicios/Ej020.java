//Disenar un algoritmo que nos diga el dinero que tenemos (en euros y centimos) 
//despues de pedirnos cuantas monedas tenemos de 2e, 1e, 50 centimos, 20 centimos 
//y 10 centimos).


package ejercicios;

import java.util.Scanner;


public class Ej020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int euro2, euro1, cent50, cent20, cent10;
		float total_euros, total_centimos, total;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Monedas de 2 euros: ");
		euro2 = sc.nextInt();
		
		System.out.print("Monedas de 1 euros: ");
		euro1 = sc.nextInt();
		
		System.out.print("Monedas de 50 cent : ");
		cent50 = sc.nextInt();
		
		System.out.print("Monedas de 20 cent : ");
		cent20 = sc.nextInt();

		System.out.print("Monedas de 10 cent : ");
		cent10 = sc.nextInt();
		
		
		//2. Calular Euros (sumar monedas de 2 euros * 2 + monedas de 1 euro
		total_euros = euro2 * 2 + euro1;
		//3. Calcular centimos (monedas de 50c * 50 + monedas de 30c * 30 + moneda de 20c * 20 moneda de 10c * 10
		total_centimos = (cent50 * 50 + cent20 * 20 + cent10 * 10);
		//4. Total
		total = total_euros*100 + total_centimos;
		
		
		System.out.println("Tienes " +(total*0.01) +" euros ");
		System.out.println( +(int)total/100 +" euros y " + total%100 +" centimos.");
		
		sc.close();
	}

}