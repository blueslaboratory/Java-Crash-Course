/*
4.- Realiza un programa en Java que, mediante un menú con varias 
opciones haga las siguientes tareas (hazlo con Scanner y con la 
clase JOptionPane):

Opción 1: Pide los datos de un alumno (nombre, apellido, curso, 
nota) y da de alta al alumno en nuestro programa.

Opción 2: Muestra los datos de los alumnos cuya nota media es 
mayor o igual a 5 y el número de ellos que hay que cumplan esa media.

Opción 3: Muestra los datos de los alumnos cuya nota media es 
menor a 5 y el número de ellos que hay que cumplan esa media.

Utiliza funciones (métodos estáticos) para llevar a cabo las 
tareas pedidas.

*/

package clases3;

public class Ej004Alumnos {
	private static int contadorAlumnos = 0;
	private int nAlumno;
	private String nombre, apellido, curso;
	private float nota;
	
	
	//COPIA DEL OBJETO
	public Ej004Alumnos copia() {
		return new Ej004Alumnos(nombre, apellido, curso, nota);
	}
	public Ej004Alumnos copia2() {
		Ej004Alumnos tmp = new Ej004Alumnos(nombre, apellido, curso, nota) ;
		return tmp;
	}
	
	//ALT+SHIFT+S
	//CONSTRUCTORES
	public Ej004Alumnos() {
		nAlumno = contadorAlumnos;
		contadorAlumnos++;
	};
	public Ej004Alumnos(String nombre, String apellido, String curso, float nota) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
		this.nota = nota;
		nAlumno = contadorAlumnos;
		contadorAlumnos++;
	}


	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public void setnAlumno(int nAlumno) {
		this.nAlumno = nAlumno;
	}
	public static void setContadorAlumnos(int contadorAlumnos) {
		Ej004Alumnos.contadorAlumnos = contadorAlumnos;
	}
	
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getCurso() {
		return curso;
	}
	public float getNota() {
		return nota;
	}
	public int getnAlumno() {
		return nAlumno;
	}
	public static int getContadorAlumnos() {
		return contadorAlumnos;
	}
	
	
	//toString
	public String toString() {
		return "\nNumero de alumno: " +nAlumno
			  +"\nNombre: " +nombre
			  +"\nApellido: " +apellido
			  +"\nCurso: " +curso
			  +"\nNota: " +nota;
	}
}
