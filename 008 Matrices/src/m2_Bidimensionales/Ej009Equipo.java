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

public class Ej009Equipo {
	
	static int contEquipo = 0;
	private int nEquipo = 0;
	private final int JUGADORES = 3;
	//10 miembros cada equipo
	private String[][] miembrosEquipo = new String[JUGADORES][2];
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej009Equipo() {
		nEquipo = contEquipo;
		contEquipo++;
	}
	public Ej009Equipo(String[][] miembrosEquipo) {
		this.miembrosEquipo = miembrosEquipo;
		nEquipo = contEquipo;
		contEquipo++;
	}
	
	
	//GETTERS
	public String[][] getMiembrosEquipo() {
		return miembrosEquipo;
	}
	
	
	//SETTERS
	public void setMiembrosEquipo(String[][] miembrosEquipo) {
		this.miembrosEquipo = miembrosEquipo;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "\nNumero de equipo: " +(nEquipo+1)
			  +"\nNumero de jugadores: " +JUGADORES 
//			  +"\nMiembros Equipo: " +Arrays.toString(miembrosEquipo);
//			  +"\nMiembros Equipo: " +(miembrosEquipo.toString()).toString()
			  +"\nMiembros del equipo: \n"
			  +Arrays.deepToString(miembrosEquipo).replace("], ", "]\n");
	}
}
