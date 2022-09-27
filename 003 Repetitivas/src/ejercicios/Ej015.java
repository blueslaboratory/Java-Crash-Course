//################################################################################
//Una persona adquirio un producto para pagar en 20 meses. El primer mes pago 10 
//euros, el segundo 20 euros, el tercero 40 euros y asi sucesivamente. 
//Realizar un algoritmo para determinar cuanto debe pagar mensualmente y el total 
//de lo que pago despues de los 20 meses.


package ejercicios;

import java.util.Scanner;


public class Ej015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int paga_mes, mes, total;
		int acum;
		Scanner sc = new Scanner(System.in);
		
		acum = 0;
		paga_mes = 10;
		
		for (mes=1; mes<=20; mes++) {
			System.out.println("El mes " +mes +" tienes que pagar: " +paga_mes +" euros");
			
			acum = acum + paga_mes;
			paga_mes = paga_mes*2;
			
			//System.out.println("El mes " +mes +" llevas pagados: " +acum +" euros");
		}
			
		System.out.println("A los 20 meses llevas pagados: " +acum +" euros");
		
		sc.close();
	}

}

