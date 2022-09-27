package ejemplos006_repetitivas;

import java.util.Scanner;


public class Flagpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont, num, n;
		boolean flag;
		Scanner sc = new Scanner(System.in);
		
		cont = 1;
		flag = false;
		//indicador = bandera = flag
		
		System.out.print("Numero de numeros que quieres introducir: ");
		n = sc.nextInt();
		//n = Integer.parseInt(sc.nextLine());
		
		while (cont <= n && !flag){
			System.out.print("Dime un numero: ");
			num = sc.nextInt();
			
			if (num%2 == 0) 
				flag = true;
			
			cont = cont+1;	
		}
		
		if (flag)
			System.out.println("Ha introducido algun par");
		else
			System.out.println("No ha introducido ningun par");
		
		
		
		sc.close();
	}

}
