//5. Hacer un programa que dado un dia D, un mes M y un año A, 
//calcule cual es el dia siguiente. Se debe tener en cuenta que 
//en los años bisiestos Febrero tiene 29 dias y en los no bisiestos 28. 


package basicos1;

import java.util.Scanner;


public class Ej005 {
	
	public static void main(String args[]) {
		
		int d,m,a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el dia: ");
		d = sc.nextInt();
		System.out.print("Dime el mes: ");
		m = sc.nextInt();
		System.out.print("Dime el ano: ");
		a = sc.nextInt();
		
		sc.close();
		
		if (d<1 || d>31 || m<1 || m>12 || a<0)
			System.out.println ("Fecha incorrecta");
		
		else if (m==4 || m==6 || m==9 || m==11){
			if (d>=1 && d<=30) {
				System.out.println ("Fecha correcta");
				if (d<30) {
					d+=1;
					System.out.println ("Dia siguiente: " +d +"/" +m +"/" +a);
				}
				else {
					m+=1;
					d=1;
					System.out.println ("Dia siguiente: " +d +"/" +m +"/" +a);
				}			
			}
				
			else
				System.out.println ("Fecha incorrecta");
			}
		

		else if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
			if (d>=1 && d<=31) {
				System.out.println ("Fecha correcta");
				if (m==12) {
					if (d<31) {
						d+=1;
						System.out.println ("Dia siguiente: " +d +"/" +m +"/" +a);
					}
					else {
						a+=1;
						m=1;
						d=1;
						System.out.println ("Dia siguiente: " +d +"/" +m +"/" +a);
						System.out.println ("Happy new year!");
					}			
				}
				
				else if (d<31) {
					d+=1;
					System.out.println ("Dia siguiente: " +d +"/" +m +"/" +a);
				}
				
				else {
					m+=1;
					d=1;
					System.out.println ("Dia siguiente: " +d +"/" +m +"/" +a);
				}			
			}
			
				
			else
				System.out.println ("Fecha incorrecta");
			}

		else if (m==2 && d<=29){
			if (a%4==0 && a%100!=0	|| a%400==0) {
				System.out.println ("Fecha correcta");
				if (d<29) {
					d+=1;
					System.out.println ("Dia siguiente: " +d +"/" +m +"/" +a);
				}
				else {
					m+=1;
					d=1;
					System.out.println ("Dia siguiente: " +d +"/" +m +"/" +a);
				}		
			}
				
			else if (d<=28) {
				System.out.println ("Fecha correcta");
				if (d<28) {
					d+=1;
					System.out.println ("Dia siguiente: " +d +"/" +m +"/" +a);
				}
				else {
					m+=1;
					d=1;
					System.out.println ("Dia siguiente: " +d +"/" +m +"/" +a);
				}		
			}
				
			else
				System.out.println ("Fecha incorrecta");
			}
		
		
	}

}
