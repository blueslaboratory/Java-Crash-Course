//Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantos 
//dias, horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40 minutos.


package repaso;

import java.util.Scanner;


public class Ej007Minutos {

	public static void main(String[] args) {
		
		int min, a, d, h, dres, mres, hres;
		
		Scanner sc = new Scanner(System.in); //crear un objeto Scanner
		
		
		System.out.print("Dime los minutos: ");
		min = sc.nextInt();
		
		h = min/60;
		d = h/24;
		a = d/365;
		//auto trunca al definirlo como int
		
		dres = d%365;
		hres = h%24;
		mres = min%60;
		//num%num1: devuelve el resto de la division
		
		
		System.out.println(min +" minutos, son " +a +" years " +dres +" dias " 
						 +hres +" horas y " +mres +" minutos.");
		
		
		//Afinamos el mensaje
		String cadHoras = (hres != 1) ? " horas y " : " hora y ";
		String cadMinutos = (mres != 1) ? " minutos." : " minuto.";
		
		System.out.println(hres +cadHoras +mres +cadMinutos);
		
		
		
		
		
		sc.close();
		
		
	}

}