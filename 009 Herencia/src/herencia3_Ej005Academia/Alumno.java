/*
Tenemos que hacer un programa que gestione un centro en el que 
se dispone de 5 asignaturas en las que se podran matricular los 
alumnos del centro. Cada alumno se matriculara de 3 asignaturas.

De dichos alumnos nos interesan las siguientes propiedades:
nombre, DNI, curso, grupo y asignaturas en las que se ha 
matriculado (nombre), asi como la nota que ha obtenido en cada una de ellas.

De cada asignatura queremos conocer el nombre y el precio.

Crearas el siguiente menu:

	1. Introducir Asignaturas
	2. Matricular Alumno
	3. Calificar Alumno
	4. Mostrar Asignaturas
	5. Mostrar Alumnos
	6. Salir
	
	Elija opcion: 

En la opcion 1 el programa pedira las 5 asignaturas junto con sus 
precios de que dispone el centro.

En la opcion 2 el programa pedira los datos de un alumno a 
matricular y los nombres de 3 asignaturas de las 5 disponibles.

En la opcion 3 el programa pedira los datos de un alumno a 
calificar en una determinada asignatura, de la que pedira el nombre 
y le dara una calificacion de 1 a 10 al azar.

En la opcion 4 el programa muestra las asignaturas de las que se puede 
matricular un alumno, asi como sus precios.

En la opcion 5 el programa muestra todos los alumnos junto con las 
asignaturas de las que se ha matriculado, ademas de su nota en cada 
asignatura. (Si todavia no hay nota indicara “no disponible”) y el 
precio total de la matricula.

Muestra al usuario en cada opcion los datos que ya tiene almacenado 
el programa y que le puedan ser de ayuda para realizar la tarea 
pedida y considera los mensajes a mostrar en caso de no poder 
realizar la operacion, indicando al usuario el motivo por pantalla.
*/

package herencia3_Ej005Academia;

import java.util.ArrayList;

public class Alumno {
	private String nombre, DNI, curso, grupo;
	private ArrayList<Ej001Asignatura> matriculas;
	
	//OTROS METODOS
	public void matriculado() {
		int cont = 1;
		for(Ej001Asignatura a : matriculas) {
			System.out.print("Codigo " +cont +": ");
			System.out.println(a);
			cont++;
		}
	}
	public String matriculas() {
		String mat = "";
		for(Ej001Asignatura a : matriculas) {
			mat += "\n\t" +a.toString();
		}
		return mat;
	}
	
	//CONSTRUCTORES
	public Alumno() {
		matriculas = new ArrayList<Ej001Asignatura>();
	}
	public Alumno(String nombre, String DNI, String curso, String grupo, ArrayList<Ej001Asignatura> matriculas) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.curso = curso;
		this.grupo = grupo;
		this.matriculas = matriculas;
	}
	
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public ArrayList<Ej001Asignatura> getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(ArrayList<Ej001Asignatura> matriculas) {
		this.matriculas = matriculas;
	}
		
	
	//TOSTRING
	@Override
	public String toString() {
		return   "\nAlumno: " + nombre 
				+ "\n\tDNI: " + DNI 
				+ "\n\tCurso: " + curso 
				+ "\n\tGrupo: " + grupo 
				+ "\n\tMatriculado en: " + matriculas();
	}
}
