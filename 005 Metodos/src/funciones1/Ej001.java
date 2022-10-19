//1.- Crea una subrutina en java a la que se le pase un n�mero N 
//que se le pedir� al usuario y muestre por pantalla la frase 
//�M�dulo ejecut�ndose� N veces.

//Intentos fallidos: 0


package funciones1;

import java.util.Scanner;


public class Ej001 {
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime N: ");
		n = Integer.parseInt(sc.nextLine());
		//n = sc.nextInt();
		ejecucion(n);
		
		sc.close();
	}
	
	public static void ejecucion(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println(i +". Modulo ejecutandose");
		}
	}
	
}


