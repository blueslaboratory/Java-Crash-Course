/*
1.1.- Escribe el código en Java de una clase para 
representar un empleado de una empresa.
Del empleado vamos a querer tener los datos de su 
nombre, apellido, edad y salario.
Realiza dos métodos constructores, uno con los valores 
de los cuatro atributos y otro sin atributos. 

Crea también los métodos que devuelvan los valores de 
los atributos y otros que permitan modificarlos, así como 
un método que si el empleado tiene más de 40 años se le 
aumente el sueldo una cantidad que se pasa por parámetro. 
A este último método le llamaremos comprobarPlus y 
devuelve true si se aumenta el sueldo y falso si no se aumenta.

Se debe crear también un método toString() para imprimir 
un objeto Empleado.

Utiliza la clase JOptionPane para recibir los valores 
del usuario para ir creando los empleados. Para ello, 
crearás un método denominado leerEmpleado() en la misma 
clase donde tengamos el método main(), este método pide 
los datos de un empleado y devuelve un objeto de la 
clase Empleado.

Crea tres empleados para probar los métodos descritos.
 
 
1.2.- Haz el ejercicio creando un array de empleados, 
donde se puedan acumular hasta 100 empleados (usa menos 
para probar el programa). Crea los empleados guardándolos 
en el array, para posteriormente comprobar si hay que 
aumentar el plus a los empleados. 
Muestra los datos de cada empleado del array.
Muestra la suma del salario de todos los empleados antes y 
después de realizar el aumento que corresponda.

Haz el ejercicio con JOptionPane.


1.3.- Haz el ejercicio ahora con un menú como el siguiente:
Para ir creando los empleados usarás la 1ª opción y un 
atributo estático que va contando los empleados según se 
van creando en el/los constructor/es.

En la 2ª opción mostrarás todos los empleados creados hasta 
el momento en que se selecciona esa opción

En la 3ª opción, se recorre el array y se sube la cantidad 
indicada como plus a los mayores de 40 años. Fíjate en que 
si se elige varias veces esta opción, habrá empleados a los 
que se les aplique la subida más de una vez. Busca una 
solución a este problema.

En la 4ª opción, se muestra la suma de todos los empleados 
creados hasta el momento en que se selecciona la opción.

En esta versión del programa, deberás crear métodos estáticos 
en el fichero fuente del main, que reciban el array de 
empleados y lleven a cabo lo que se pide en cada opción. 
Es decir, en el menú aparecerán solo las llamadas a los métodos.

Si el usuario selecciona alguna opción y no hay empleados, 
el programa deberá notificarlo.

*/

package clases3;

public class Ej001Empleado {

	private String nombre, apellido;
	private int edad, nEmple;
	private float salario;
	private static int contadorEmple=0;
	private boolean aumento = false;
	
	public boolean comprobarPlus(float plus) {
		
		if(edad > 40 && !aumento) {
			salario += plus;
			aumento = true;
		}
				
		return aumento;
	}
	
	
	//ALT + SHIFT + S
	//CONSTRUCTORES
	public Ej001Empleado() {
		nEmple = contadorEmple;
		contadorEmple++;
	}
	public Ej001Empleado(String nombre, String apellido, int edad, float salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		nEmple = contadorEmple;
		contadorEmple++;
	}
	

	//SETTERS
	public void setnEmple(int nEmple) {
		this.nEmple = nEmple;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	//GETTERS
	public int getnEmple() {
		return nEmple;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public float getSalario() {
		return salario;
	}


	
	@Override
	public String toString() {
		return "\nNumero de Empleado: " + (nEmple+1)
			 + "\nNombre: " + nombre 
			 + "\nApellido: " + apellido 
			 + "\nEdad: " + edad 
			 + "\nSalario: " + salario;
	}
	
	

}



