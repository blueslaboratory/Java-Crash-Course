/*
Tenemos que hacer un programa que gestione un centro en el que 
se dispone de 5 asignaturas en las que se podran matricular los 
alumnos del centro. Cada alumno se matriculara de 3 asignaturas.

De dichos alumnos nos interesan las siguientes propiedades:
nombre, DNI, curso, grupo y asignaturas en las que se ha 
matriculado (nombre), asi como la nota que ha obtenido en cada una de ellas.

De cada asignatura queremos conocer el nombre y el precio.

Crearas el siguiente menu:

	1.Introducir Asignaturas
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

public class Ej001Asignatura {
	private String nombre;
	private double precio, nota;
	
	
	
	//CONSTRUCTORES
	public Ej001Asignatura() {
		this.nota = -1;
	};
	public Ej001Asignatura(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.nota = -1;
	}
	public Ej001Asignatura(String nombre, double precio, double nota) {
		this.nombre = nombre;
		this.precio = precio;
		this.nota = nota;
	}
	//COPIA
	public Ej001Asignatura(Ej001Asignatura a) {
		this.nombre = a.nombre;
		this.precio = a.precio;
		this.nota = a.nota;
	}
	
	
	//SETTERS Y GETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
		
	//TOSTRING
	@Override
	public String toString() {
		if(nota != -1)
			return "Asignatura " + nombre  + "\tNota: " + nota  + "\tPrecio: " + precio;
		else
			return "Asignatura " + nombre  + "\tPrecio: " + precio;
	}
}
