package ejemplos022_herencia;

import java.util.Scanner;

//Clase Alumno. Clase derivada de Persona

public class Alumno extends Persona {
//extends llama al constructor de persona con el nif y nombre a null
	private String curso;

	
	//OTROS METODOS
	@Override //indica que se modifica un metodo heredado
	public void leer(Scanner sc) {
		super.leer(sc); //se llama al metodo leer de Persona para leer nif y nombre
		System.out.println("Curso: ");
		curso = sc.nextLine(); //se lee el curso
	}
	
	
	//CONSTRUCTORES
	public Alumno() {
		System.out.println("Constructor por defecto alumno");
	};
	public Alumno(String curso) {
		this.curso = curso;
	}


	//GETTERS
	public String getCurso() {
		return curso;
	}

	
	//SETTERS
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	//TOSTRING
	public String toString() {
		return super.toString() +" Curso: " +curso;
	}
}