// Documentacion: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/module-summary.html

// ECLIPSE DARK MODE:
// Window -> Preferences -> General -> Appearance -> Theme and select "Dark" 

// Atajos
// CTRL + MAYUS + 7 : Comenta todo lo que tengas seleccionado
// CTRL + SHIFT + F : Da formato al codigo
// ALT + UP/DOWN: MUEVE LINEAS
// ALT + SHIFT + S: CONSTRUCTORS, GETTERS, SETTERS, toString 
// F11: RUN

// Escribir main, pulsar CTRL + ESPACIO y seleccionar main method implementa: 
// public static void main (String[] args){ }
// Escribir sout o syso y pulsar CTRL + ESPACIO 	Implementa: 
// System.out.println();


// import java.lang.*;
// (se importa por defecto)


// Intentos hasta resolver el ejercicio = 1
// De ahora en adelante I=1
// I=(1) (fallidos)

// Ver mas proyectos de otro Workspace:
// File -> Switch Workspace

// En el package explorer hay 2 flechitas en la esquina superior derecha
// si lo seleccionas te autocambia entre las pestanas abiertas


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Hello {

	public static void main(String[] args) {

		// SI TODOS LOS PROYECTOS DAN ERROR
		// AL CAMBIAR DE SO A WINDOWS PUEDE SER NECESARIO REIMPORTAR EL JDK11
		
		// ERROR: java.lang.ClassNotFoundException
		// se soluciona importando de nuevo los conectores
		// E:\DOCUMENTS\DA2D1E-2\Programacion\T10 Acceso a BBDD\Drivers
		// E:\DOCUMENTS\DA2D1E-2\Programacion\Eclipse-workspace\!Drivers
		
		
		System.out.print("Hello, hello. ");
		System.out.println("Hello World!");
		// Los parentesis son para llamar a una funcion
		
		System.out.println("La palabra \"hola\" es un saludo");
		
//		conjunto de caracteres especiales que se pueden 
//		utilizar en los valores literales char y String: 
//		\b (retroceso), \t (tabulador), \n (nueva linea), 
//		\f (salto de pagina), \r (retorno de carro), 
//		\" (comilla doble), \' (comilla simple), \\ (barra invertida). 
		
		
//		Integer n; 
//		int i;
//		Integer n es una variable que apunta a una clase
//		int i es una declaracion de tipo simple
//		y cuando pones n. te salen todos los metodos asociados
//		a la clase
		
		LocalDate date = null;
		System.out.println(date.of(1999, 9, 9));
		System.out.println(LocalDate.now()); //solo fecha
		System.out.println(LocalTime.now()); //solo hora
		System.out.println(LocalDateTime.now()); //fecha y hora
	}

}
