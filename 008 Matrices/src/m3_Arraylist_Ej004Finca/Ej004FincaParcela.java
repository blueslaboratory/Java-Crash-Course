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

public class Ej004FincaParcela {
	
	private double metrosParcela;
	private boolean agricola, ganadera;
	
	private static int contParcela = 0;
	private int nParcela;
	
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej004FincaParcela() {
		nParcela = contParcela;
		contParcela++;
	}
	public Ej004FincaParcela(double metrosParcela, boolean agricola, boolean ganadera) {
		nParcela = contParcela;
		contParcela++;
		this.metrosParcela = metrosParcela;
		this.agricola = agricola;
		this.ganadera = ganadera;
	}


	//GETTERS
	public double getMetrosParcela() {
		return metrosParcela;
	}
	public boolean isAgricola() {
		return agricola;
	}
	public boolean isGanadera() {
		return ganadera;
	}
	
	
	//SETTERS
	public void setMetrosParcela(double metrosParcela) {
		this.metrosParcela = metrosParcela;
	}
	public void setAgricola(boolean agricola) {
		this.agricola = agricola;
	}
	public void setGanadera(boolean ganadera) {
		this.ganadera = ganadera;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "\n\tFincaParcela " + nParcela
			 + "\n\tmetrosParcela: " + metrosParcela 
			 + "\n\tAgricola: " + agricola 
			 + "\n\tGanadera: " + ganadera;
	}
}
