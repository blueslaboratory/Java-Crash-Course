//3. Haz un programa que muestre un contador con 3 dígitos. 
//Mostrará los números del 0-0-0 al 9-9-9, con la particularidad 
//que cada vez que aparezca un 3 lo sustituya por una E.

//Intentos fallidos: I
//Intentos: Con lo que hemos visto hasta ahora no me sale

package basicos3repaso;

import java.util.Scanner;

public class Ej003SustituirConE {
	
	public static void main(String[] args) {
		
		int cont1, cont2, cont3;
		String num;
		Scanner sc = new Scanner(System.in);
		
		
		for (cont1=0; cont1<10; cont1++) {
			for (cont2=0; cont2<10; cont2++) {
				for (cont3=0; cont3<10; cont3++) {
					
					if (cont1==3)
						System.out.print("E" +"-");	
					else
						System.out.print(+cont1 +"-");
					
					if (cont2==3)
						System.out.print("E" +"-");
					else
						System.out.print(+cont2 +"-");
					
					if (cont3==3)
						System.out.print("E");
					else
						System.out.print(cont3);
					
					System.out.println();
				}
			}
		}
		
		sc.close();
	}
}
