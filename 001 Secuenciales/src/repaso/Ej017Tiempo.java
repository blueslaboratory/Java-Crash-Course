//Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. El tiempo 
//de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo que determine 
//la hora de llegada a la ciudad B.


package repaso;

import java.util.Scanner;

public class Ej017Tiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dd, hh, mm, ss, tt, ts;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime la hora a la que has salido (0-24): ");
		hh = sc.nextInt();
		System.out.print("Dime los minutos a los que has salido (0-60): ");
		mm = sc.nextInt();
		System.out.print("Dime los segundos a los que has salido (0-60): ");
		ss = sc.nextInt();
		
		tt = hh*3600 +mm*60 +ss;
		
		
		System.out.print("Dime el tiempo (s) desde A a B: ");
		ts = sc.nextInt();
		
		tt = tt + ts;
		
		hh = tt/3600;
		//Al hacer la division el cociente esta en horas y el resto en segundos.
		mm = ((tt%3600)/60);
		//Al hacer la division el resto esta en segundos, por eso lo tienes que dividir entre 60.
		ss = (tt%3600)%60;
		//Al hacer la division el resto esta en segundos (>60), tienes que ver cuantos segundos del
		//resto son minutos, por eso haces el resto entre 60, que esta en seg otra vez.
		//Otra formula mas rapida seria: ss = tt%60;
		
		
		System.out.println("Has llegado a la ciudad B a las " +hh +" horas, " +mm +" minutos y " +ss +" segundos");
		
		//INCLUYENDO DIAS
		
		dd = (tt/(3600*24));
		hh = ((tt%(3600*24))/3600);
		mm = (((tt%(3600*24))%3600)/60);
		ss = tt%60;
		
		System.out.println("Has llegado a la ciudad B a los " +dd +" dias, " +hh +" horas, " +mm +" minutos y " +ss +" segundos");
		
		sc.close();
	}

}
