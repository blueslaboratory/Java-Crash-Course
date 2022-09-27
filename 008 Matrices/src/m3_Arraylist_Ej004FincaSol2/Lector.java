package m3_Arraylist_Ej004FincaSol2;
import java.util.Scanner;

public class Lector {
	// Rellenar Casa
	
	public static Casa rellenarCasa (Scanner sc) {
		System.out.println ("> DATOS DE LA CASA:");
		System.out.print("Metros cuadrados: ");
		int m2 = sc.nextInt();
		System.out.print("Numero de plantas: ");
		int nPlantas = sc.nextInt();
		System.out.print("Numero de habitaciones: ");
		int nHab = sc.nextInt();
		return new Casa(m2,nPlantas,nHab);	
	}
	
	// Rellenar Parcela
	
	public static Parcela rellenarParcela (Scanner sc) {
		System.out.println ("> DATOS DE LA PARCELA:");
		System.out.print("Metros cuadrados: ");
		int m2 = sc.nextInt();
		
		System.out.print("Tipo de explotacion:\n1. Agrícola \n2. Ganadera \n3. Ambas:\n ");
		int expl = sc.nextInt();
		while (expl < 1 || expl > 3){
			System.out.print("Tipo de explotacion:\n1. Agrícola \n2. Ganadera \n3. Ambas:\n ");
			expl = sc.nextInt();
		}
		
		return new Parcela(m2,expl);	
	}
	
	// Rellenar Finca
	
	public static Finca rellenarFinca (Scanner sc) {
		Casa miCasa;
		Parcela miParcela;
		System.out.println ("> DATOS DE LA FINCA:");
		System.out.print("Nombre: ");
		sc.nextLine();
		String nomb = sc.nextLine();
		miCasa = rellenarCasa(sc);
		miParcela = rellenarParcela(sc);
		
		return new Finca(nomb, miCasa, miParcela);	
	}
}
