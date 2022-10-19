package ejemplos026_excepciones3;

import java.util.Scanner;
public class NuevasExc4 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		NuevasExc4 nuevas = new NuevasExc4();
		int temperatura, horas;
		
		System.out.print("Introduce la temperatura: ");
		temperatura = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce las horas que has dormido: ");
		horas = Integer.parseInt(sc.nextLine());
		
		sc.close();

		try {
			nuevas.lanza(temperatura, horas);// Puede lanzar una excepcion
		}
		catch (DemasiadoCansado | DemasiadoCalor lim) {
			System.out.println(lim.getMessage());
		}
	}
	
	public void lanza(int temp, int dormir) throws DemasiadoCalor, DemasiadoCansado {
		//el throws lanza varias
		
		if (temp > 40)
			throw (new DemasiadoCalor("Demasiado Calor"));
		// Si se lanza esta, la otra ya no se lanza
		if (dormir < 8) 
			throw (new DemasiadoCansado("Demasiado Cansancio"));
	}
}