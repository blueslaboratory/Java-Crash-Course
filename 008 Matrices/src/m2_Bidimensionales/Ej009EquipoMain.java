/*
9. En un campeonato de baloncesto intervienen 20 equipos 
de 10 miembros cada uno. Se quiere hacer un  programa 
que lleve a cabo las siguientes operaciones:

a. Leer y almacenar la altura de cada jugador en la 
estructura de datos que consideres mas adecuada.
b. Determinar que equipo tiene mayor altura media.
c. Formar una seleccion de 20 miembros integrada 
por el jugador mas alto de cada equipo, guardandola 
en la estructura de datos que consideres mas adecuada.
*/

package m2_Bidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej009EquipoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NEQUIPOS = 2;
		
		String[][] seleccion = new String[NEQUIPOS][2];
		Ej009Equipo[] equipo = new Ej009Equipo[NEQUIPOS];
		Ej009Equipo equipoMayorAltura = new Ej009Equipo();
		Ej009Equipo.contEquipo = -1;
		
//		System.out.println(equipo[0]);
//		System.out.println(equipo[0].getMiembrosEquipo());
//		No puedes pasar a rellenaJugadores(equipo) e intentar rellenar el objeto
		
		for (int i=0; i<equipo.length; i++) {
			System.out.println("Equipo " +i);
			equipo[i] = rellenaJugadores();
			System.out.println(equipo[i]);
		}
		
		equipoMayorAltura = equipoMayorAltura(equipo);
		
		seleccion = seleccion(equipo);
		System.out.println("\nLa seleccion es: ");
		System.out.println(Arrays.deepToString(seleccion));
	}
	
	
	public static Ej009Equipo rellenaJugadores(){		
		Scanner sc = new Scanner(System.in);
		
		final int JUGADORES = 3;
		//10 miembros cada equipo
		String[][] miembrosEquipo = new String[JUGADORES][2];
		
		for(int i=0; i<miembrosEquipo.length; i++) {
			for(int j=0; j<miembrosEquipo[0].length; j++) {
				if(j==0) {
					System.out.print("Nombre del jugador " +i +": ");
					miembrosEquipo[i][j] = sc.nextLine();
				}
				if(j==1) {
					//System.out.print("Altura del jugador: " +i +": ");
					//miembrosEquipo[i][j] = sc.nextLine();
					miembrosEquipo[i][j] = String.valueOf(String.format("%.3f",(Math.random()*(2.3-1.6)+1.6)).replace(",", ".")); //(Math.random()*(M-N)+N)
				}
			}
		}
		
		return new Ej009Equipo(miembrosEquipo);
	}
	
	
	public static Ej009Equipo equipoMayorAltura(Ej009Equipo[] equipo) {
		Ej009Equipo equipoMayorAltura = new Ej009Equipo();
		double alturaMedia, mayorAlturaMedia;
		double acum = 0;
		int cont = 0;
		
		alturaMedia = mayorAlturaMedia = 0;
		
		for(int x=0; x<equipo.length; x++) {
			for(int i=0; i<equipo[x].getMiembrosEquipo().length; i++) {
				acum += Double.parseDouble((equipo[x].getMiembrosEquipo()[i][1]));
				cont++;
			}
			alturaMedia = acum/cont;
			
			if (alturaMedia>mayorAlturaMedia) {
				mayorAlturaMedia = alturaMedia;
				equipoMayorAltura = equipo[x];
			}
			
			acum = 0;
			cont = 0;		
		}
		
		
		System.out.println("\nEl equipo con mayor altura media es: ");
		System.out.print(equipoMayorAltura);
		System.out.println("\nAltura media: " +String.valueOf(String.format("%.3f", mayorAlturaMedia)).replace(",", "."));
		
		return equipoMayorAltura;
	}
	
	
	public static String[][] seleccion(Ej009Equipo[] equipo){
		String[][] seleccion = new String[equipo.length][2];
		double mayorAltura, alturaJugador;
		mayorAltura = alturaJugador = 0;
		
		
		for(int x=0; x<equipo.length; x++) {
			for(int i=0; i<equipo[x].getMiembrosEquipo().length; i++) {
				alturaJugador = Double.parseDouble((equipo[x].getMiembrosEquipo()[i][1]));
				
				if(alturaJugador>mayorAltura) {
					seleccion[x] = equipo[x].getMiembrosEquipo()[i];
					mayorAltura = alturaJugador;
				}	
			}
			
			mayorAltura = 0;
		}
		
		return seleccion;
	}
	
	
}