/*
1.- Realiza un programa que sirva para representar centros 
educativos de diferentes tipos. Los tipos que se puede tener 
son: publicos, concertados y privados. Para todos ellos se 
quiere tener su nombre y direccion. Para los publicos se 
tendra la asignacion anual publica recibida. Para los concertados 
la asignacion mensual publica recibida, asi como la cuota 
mensual que pagan los alumnos. Para los privados se tendra la 
cuota mensual que pagan los alumnos. Se pide crear tres centros, 
uno de cada tipo y guardarlos en un arrayList en el programa 
principal. Imprimir a continuacion los datos de cada centro 
educativo usando el arrayList donde estan guardados.

*/

package herencia1_Ej001_J;

public class Ej001Concertado extends Ej001CentroEducativo{
	protected long cuota, presuAnual;
	
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej001Concertado() {};
	public Ej001Concertado(String nombre, String direccion, long cuota, long presuAnual) {
		super(nombre, direccion);
		this.cuota = cuota;
		this.presuAnual = presuAnual;
	}


	//GETTERS
	public long getCuota() {
		return cuota;
	}
	public long getPresuAnual() {
		return presuAnual;
	}
	
	
	//SETTERS
	public void setCuota(long cuota) {
		this.cuota = cuota;
	}
	public void setPresuAnual(long presuAnual) {
		this.presuAnual = presuAnual;
	}


	@Override
	public String toString() {
		String s = super.toString();
		s = s + "\nCuota: " +cuota
			   +"\nPresupuesto anual: " +presuAnual;
		return s;
	}
	
}
