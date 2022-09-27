/*
4. Se pide hacer una aplicacion en java que represente una finca mediante una clase.
De la finca se quiere guardar su nombre y el numero de metros cuadrados que posee. 

Ademas, se quiere guardar informacion sobre la casa y la parcela que la componen.

De la casa se quiere saber los metros cuadrados, el numero de plantas y el numero 
de habitaciones que posee.

De la parcela se quiere saber tambien el numero de metros cuadrados que tiene y si 
se dedica a explotacion agricola y/o ganadera.

Una vez que se haya modelizado todo mediante clases, se anadira un menu que permita:
•	Crear una nueva finca y guardarla.
•	Mostrar los datos de una finca dado el nombre de la misma, que se pedira al usuario.
•	Mostrar todas las fincas con todos sus datos.

El ejercicio lo haras usando un arrayList para almacenar cada una de las fincas.
*/


package m3_Arraylist_Ej004Finca;

public class Ej004FincaCasa {
	
	private int nPlanta, nHabitacion;
	private double metrosCasa;
	
	private static int contCasa = 0;
	private int nCasa;
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej004FincaCasa() {
		nCasa = contCasa;
		contCasa++;
	}
	public Ej004FincaCasa(int nPlanta, int nHabitacion, double metrosCasa) {
		nCasa = contCasa;
		contCasa++;
		this.nPlanta = nPlanta;
		this.nHabitacion = nHabitacion;
		this.metrosCasa = metrosCasa;
	}

	
	//GETTERS
	public static int getContCasa() {
		return contCasa;
	}
	public int getnCasa() {
		return nCasa;
	}
	public int getnPlanta() {
		return nPlanta;
	}
	public int getnHabitacion() {
		return nHabitacion;
	}
	public double getMetrosCasa() {
		return metrosCasa;
	}
	
	
	//SETTERS
	public static void setContCasa(int contCasa) {
		Ej004FincaCasa.contCasa = contCasa;
	}
	public void setnCasa(int nCasa) {
		this.nCasa = nCasa;
	}
	public void setnPlanta(int nPlanta) {
		this.nPlanta = nPlanta;
	}
	public void setnHabitacion(int nHabitacion) {
		this.nHabitacion = nHabitacion;
	}
	public void setMetrosCasa(double metrosCasa) {
		this.metrosCasa = metrosCasa;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "\n\tFincaCasa " + nCasa 
			 + "\n\tPlanta: " + nPlanta 
			 + "\n\tnHabitacion: " + nHabitacion 
			 + "\n\tmetrosCasa: " + metrosCasa;
	}
}
