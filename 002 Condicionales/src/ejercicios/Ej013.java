//Escribe un programa que pida una fecha (dia, mes y año) y diga si es correcta.

package ejercicios;

import java.util.Scanner;


public class Ej013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d,m,a;
		int dias_del_mes;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el dia: ");
		d = sc.nextInt();
		System.out.print("Dime el mes: ");
		m = sc.nextInt();
		System.out.print("Dime el ano: ");
		a = sc.nextInt();
		
		
		//CON UN SWITCH (ELEGANTE)
		
		switch (m) { 
			case 1: 		
			case 3: 		
			case 5: 		 
			case 7:	 	 
			case 8:	 	 
			case 10: 	
			case 12: 	
				dias_del_mes = 31;
				break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				dias_del_mes = 30; 
				break;
				
			case 2: 
				if (a%4==0 && a%100!=0	|| a%400==0)
					dias_del_mes = 29;
				else
					dias_del_mes = 28; 
				break;
			
			default: 			
				dias_del_mes = 0; 
				break; 
		}
		
		
		if (d<1 || d>dias_del_mes || a<0)
			System.out.println ("Fecha incorrecta");
		else
			System.out.println ("Fecha correcta");
		
		
		
		
		//CON SI (ES MAS LARGO)
		
		if (d<1 || d>31 || m<1 || m>12 || a<0)
			System.out.println ("Fecha incorrecta");
		
		else if (m==4 || m==6 || m==9 || m==11){
			if (d>=1 && d<=30)
				System.out.println ("Fecha correcta");
			else
				System.out.println ("Fecha incorrecta");
			}
		

		else if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
			if (d>=1 && d<=31)
				System.out.println ("Fecha correcta");
			else
				System.out.println ("Fecha incorrecta");
			}

		else if (m==2 && d<=29){
			if (a%4==0 && a%100!=0	|| a%400==0)
				System.out.println ("Fecha correcta");
			else if (d<=28)
				System.out.println ("Fecha correcta");
			else
				System.out.println ("Fecha incorrecta");
			}
		
		
		
		sc.close();
	}

}
