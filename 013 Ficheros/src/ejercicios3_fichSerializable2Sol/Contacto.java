package ejercicios3_fichSerializable2Sol;

import java.io.Serializable;

public class Contacto implements Serializable, Comparable <Contacto> {

	//https://stackoverflow.com/questions/285793/what-is-a-serialversionuid-and-why-should-i-use-it
	private static final long serialVersionUID = 1L;
	private String nombre, apellido, email, numero;
	//Asegurarnos que tiene un @ y un punto despues de la arroba
	
	public Contacto (){}
	public Contacto(String nombre, String apellido, String numero, String email) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.numero=numero;
		this.email=email;
	}
	public Contacto(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	@Override
	public String toString() {
		String datos= "Nombre: "+this.nombre+", apellido: "+this.apellido+", Nº telefono: "+this.numero+", e-mail: "+email;
		return datos;
	}
	
	@Override
	public int compareTo(Contacto c) {
		String nombreApellThis = this.apellido + this.nombre;
		String nombreApell = c.getApellido() + c.getNombre();
		
		// Ordena alfabeticamente por nombre y apellido
		return nombreApellThis.toLowerCase().compareTo(nombreApell.toLowerCase());
	}
	
	// Lo podemos hacer mas sofisticado, orden alfabetico por apellido y si el apellido es igual,
	// se compara el nombre, pero en realidad es lo que hace asi.
}


