// 3. Haz un programa que pida un numero n, y diga cuantos 
// y cuales son los numeros primos que hay entre 1 y n. 


package basicos4;

import java.util.Scanner;

public class Ej003PrimosLim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limS;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Dime el limite superior (>2): ");
			limS = Integer.parseInt(sc.nextLine());
		} while(limS<3);
		
		
		primo(limS);
		
		sc.close();
		
	}
	
	public static void primo(int limS) {
		boolean flag;
		int cont = 2;
		String primos = "";
		
		for (int i=3; i<=(limS); i++) {
			flag = true;
			for (int div=2; div<i && flag; div++) {
				if (i%div == 0) {
					flag = false;	//primo hasta que se demuestre lo contrario
				}
			}
			
			if (flag == true) {
				primos += +i +" ";  
				//System.out.print(i + " ");
				cont++;
			}
		}
		
		primos = "1 2 " + primos;
		System.out.println("\nPrimos entre 1 y " +limS +": " +cont);
		System.out.println(primos);
	}
}
