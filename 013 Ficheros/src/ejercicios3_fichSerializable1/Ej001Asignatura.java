/*
1.- Realiza un programa en JAVA en el que se le pida al usuario 
notas de asignaturas y se guarden en un fichero cuando ya se 
hayan introducido todas las notas.
Posteriormente se leera el fichero y se calculara la nota media del curso.
Cada una de las asignaturas sera un objeto que se encuentra en una lista, 
y cuyos atributos seran el nombre y la nota.
El usuario establecera el nombre de la asignatura mediante un metodo que 
pedira el nombre de la asignatura. El atributo nota, tambien sera el usuario 
quien lo introduzca mediante un metodo que controle que la nota tenga 
un valor entre 0 y 10.

Ejemplo de ejecucion:

Por favor, introduzca el nombre de la asignatura: Programacion.
Introduzca la nota de Programacion: 8,5
¿Desea introducir otra asignatura? SI
Por favor, introduzca el nombre de la asignatura: Lenguajes de Marcas.
Introduzca la nota de Lenguajes de Marcas: 9
¿Desea introducir otra asignatura? SI
Por favor, introduzca el nombre de la asignatura: Bases de Datos
Introduzca la nota de Bases de Datos: 8
¿Desea introducir otra asignatura? NO
***** Notas almacenadas en la lista *****
……………… Volcando la lista al fichero…………….
***** Volcado finalizado con exito *****
………Leyendo el fichero (mostramos los datos) y calculando media…………….
Su nota media del curso es de: 8,5

*/

package ejercicios3_fichSerializable1;

public class Ej001Asignatura implements java.io.Serializable {
	// ojo que tiene que tener el implements java.io.Serializable
	// si no salta una excepcion: java.io.NotSerializableException
	
	//https://stackoverflow.com/questions/285793/what-is-a-serialversionuid-and-why-should-i-use-it
	private static final long serialVersionUID = 1L;
	String nombre;
	float nota;
	
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej001Asignatura() {}
	public Ej001Asignatura(String nombre, float nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
		
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public float getNota() {
		return nota;
	}
	
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Asignatura "
				+ "\n\tNombre: " + nombre 
				+ "\n\tNota: " + nota;
	}
}
