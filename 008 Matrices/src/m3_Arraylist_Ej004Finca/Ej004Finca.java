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

public class Ej004Finca {
	
	private String nombre;
	private double metrosFinca;
	private int casas;
	
	private ArrayList<Ej004FincaCasa> casasArr;
	private ArrayList<Ej004FincaParcela> parcelasArr;

	private static int contFinca = 0;
	private int nFinca;
	
	
	//OTROS METODOS
	//ADD
	public void addCasa(Ej004FincaCasa c) {
		casasArr.add(c);
	}
	public void addParcela(Ej004FincaParcela p) {
		parcelasArr.add(p);
	}
	//REMOVE
	public void removeCasa(int index) {
		casasArr.remove(index);
	}
	public void removeParcela(int index) {
		parcelasArr.remove(index);
	}
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej004Finca() {
		nFinca = contFinca;
		contFinca++;
		
		casasArr = new ArrayList<Ej004FincaCasa>();
		parcelasArr = new ArrayList<Ej004FincaParcela>();
	}
	public Ej004Finca(String nombre, double metrosFinca, int casas) {
		nFinca = contFinca;
		contFinca++;
		
		this.nombre = nombre;
		this.metrosFinca = metrosFinca;
		this.casas = casas;
		
		casasArr = new ArrayList<Ej004FincaCasa>();
		parcelasArr = new ArrayList<Ej004FincaParcela>();
	}
	
	
	//GETTERS
	public static int getContFinca() {
		return contFinca;
	}
	public int getnFinca() {
		return nFinca;
	}
	public String getNombre() {
		return nombre;
	}
	public double getMetrosFinca() {
		return metrosFinca;
	}
	public int getCasas() {
		return casas;
	}

	
	//SETTERS
	public static void setContFinca(int contFinca) {
		Ej004Finca.contFinca = contFinca;
	}
	public void setnFinca(int nFinca) {
		this.nFinca = nFinca;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setMetrosFinca(double metrosFinca) {
		this.metrosFinca = metrosFinca;
	}
	public void setCasas(int casas) {
		this.casas = casas;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "\nFinca: " + nFinca
			  +"\nNombre: " + nombre  
			  +"\nMetros Finca: " + metrosFinca 
			  +"\nnCasas: " + casas
			  +"\nCasas:" + casasArr 
			  +"\nParcelas:" +parcelasArr;
	}
}
