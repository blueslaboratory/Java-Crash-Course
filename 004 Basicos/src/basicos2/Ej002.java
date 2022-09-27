//2. Leer un capital C y averiguar e imprimir en cuantos meses se duplica, 
//si lo colocamos a un interes compuesto del 5% mensual.
//La formula a aplicar es:
// Cf = Ci*(1 + i)^n
// Cf = capital final
// Ci = capital inicial
// i  = tasa de interes
// n  = periodo de ahorro


package basicos2;

import java.util.Scanner;


public class Ej002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cf, ci, i, n;
		Scanner sc = new Scanner(System.in);
		
		i = 0.05;
		n = 1;
		
		System.out.print("Capital inicial (euros): ");
		ci = Double.parseDouble(sc.nextLine());
		
		do {	
			cf = ci*Math.pow((1+i), n);
			if (cf >= 2*ci) {
				System.out.println("Capital inicial: " +ci);
				System.out.println("Capital final: " +cf);
				System.out.println("Meses: " +n);
			}
			
			n++;
			
		} while(cf < 2*ci);
		
		
		sc.close();
	}
}
