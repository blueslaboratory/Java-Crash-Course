package ejemplos022_herencia;

import java.util.Scanner;

//Clase Persona. Clase Base

public class Persona {
	private String nif;
	private String nombre;

	
	//OTROSMETODOS
	public void leer(Scanner sc) {
		System.out.println("Nif: ");
		nif = sc.nextLine();
		System.out.println("Nombre: ");
		nombre = sc.nextLine();
	}
	

	//CONSTRUCTORES
	public Persona() {
		System.out.println("Constructor por defecto persona");
	};
	public Persona(String nif, String nombre) {
		this.nif = nif;
		this.nombre = nombre;
	}

	
	//GETTERS
	public String getNif() {
		return nif;
	}
	public String getNombre() {
		return nombre;
	}
	
	
	//SETTERS
	public void setNif(String nif) {
		this.nif = nif;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Nif: " +nif +"Nombre: " +nombre;
	}	
}
