package ejercicios;

import java.util.Scanner;

	public class Ej016_2 {
		public static void main(String[] args) {
			
			int tiempo;
			float coste = 0;
			char es_domingo, turno;
			Scanner sc;
	
			sc = new Scanner(System.in);
	
			System.out.print("Tiempo de la llamada: ");
			tiempo = Integer.parseInt(sc.nextLine());
			
			if (tiempo<=5)
				coste = tiempo*100;
			else if (tiempo<=8)  // mas de 5 minutos, pero menos de 9
				coste = (tiempo-5)*80+500;
			else if (tiempo<=10)
				coste = (tiempo-8)*70+240+500;
			else
				coste = (tiempo-10)*50+140+240+500;
			
			System.out.print("Es Domingo (S/N): ");
			es_domingo = (sc.nextLine()).charAt(0); // Tambien podemos comprobar si es solo un caracter
			// Aqui, para practicar, vamos a leer mientras el usuario no haya introducido S o N
	
			if (Character.toUpperCase(es_domingo)=='N') {
				System.out.println("Turno: Manana o Tarde (M/T): ");
				turno = (sc.nextLine()).charAt(0); // Comprobar que se ha introducido M o T
				if (Character.toUpperCase(turno)=='M') 
					coste = coste+coste*0.15F;
				else // if (Character.toUpperCase(turno)=='T') 
					coste = coste+coste*0.10F;
			} 
			
			else // if (Character.toUpperCase(es_domingo)=='S')
				coste = coste+coste*0.03F;
				
			System.out.println("El coste de la llamada: " + coste/100 + " euros.");
			
			sc.close();
	}
	
}