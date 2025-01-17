package ejemplos026_excepciones3;

import java.util.Scanner;
public class NuevasExc3 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		NuevasExc3 nuevas = new NuevasExc3();
		int temperatura, horas;
		
		System.out.print("Introduce la temperatura: ");
		temperatura = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce las horas que has dormido: ");
		horas =  Integer.parseInt(sc.nextLine());
		
		sc.close();

		try {
			nuevas.lanza(temperatura, horas);// Puede lanzar una excepcion
		} 
//		// Si captura esta la 1era ya no captura mas
//		catch (Limites lim) {
//			System.out.println(lim.getMessage());
//		}

		// Tambien se podria poner:
		catch (DemasiadoCansado | DemasiadoCalor lim) { // | tuberia
			System.out.println(lim.getMessage());
		} catch (Limites lim) {
			System.out.println(lim.getMessage());
		}
		
	}
	
	// En este caso ya creamos constructores con parametro
	public void lanza(int temp, int dormir) throws Limites {
		
		if (temp > 40)
			throw (new DemasiadoCalor("Demasiado Calor"));
		// Si se lanza esta, la otra ya no se lanza
		if (dormir < 8)
			throw (new DemasiadoCansado("Demasiado Cansancio"));
	}
}