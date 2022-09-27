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

public class Ej001CentroEducativo {
	protected String nombre, direccion;

	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej001CentroEducativo() {};
	public Ej001CentroEducativo(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}	
	
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}

	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	//toString
	@Override
	public String toString() {
		return "\nCentro Educativo " +getClass().toString().substring(getClass().toString().indexOf("Ej001")+5, 
																	  getClass().toString().length())
			 + "\nNombre: " + nombre 
			 + "\nDireccion: " + direccion;
	}	
}
