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

import java.util.ArrayList;
public class Ej004Fincas {
	private ArrayList<Ej004Finca> fincas;
	
	//OTROS METODOS
	public void add(Ej004Finca f) {
		fincas.add(f);
	}
	public void print() {
		System.out.println(fincas);
	}
	
	
	//CONSTRUCTOR
	public Ej004Fincas() {
		fincas = new ArrayList<Ej004Finca>();
	}
	
	//GETTERS
	public ArrayList<Ej004Finca> getFincas() {
		return fincas;
	}
}
