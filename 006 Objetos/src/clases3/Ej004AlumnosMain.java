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

import java.util.Scanner;
import javax.swing.*;

public class Ej004AlumnosMain {

	static int nAlumno = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int SIZE = 3;
		Ej004Alumnos [] alumno = new Ej004Alumnos[SIZE];
		Ej004Alumnos [] aMayorIgual5;
		Ej004Alumnos [] aMenor5;
		
		int cont;
		int opcion;
		
		do {
			opcion = menu(sc);
			
			switch (opcion) {
				case 1:
					if(nAlumno<SIZE) {
						//No se le puede pasar el Scanner aqui a introducirAlumno y no se por que
						alumno[nAlumno] = introducirAlumno();
						nAlumno++;
					}
					else
						System.out.println("Se ha alcanzado el limite de alumnos");
					
					break;
					
				case 2:
					cont = 0;
					
					if(cuentaNotaSup5(alumno)>0) {
						//Ej004Alumnos.setContadorAlumnos(0);
						aMayorIgual5 = new Ej004Alumnos[cuentaNotaSup5(alumno)];
						
						aMayorIgual5 = notaSup5(alumno, cuentaNotaSup5(alumno));
						//al rellenar el array es donde aumenta el contador estatico
						
						for(Ej004Alumnos a : aMayorIgual5) {
							System.out.println(a);
							cont++;
						}
					}
					
					System.out.println("Hay " +cont +" alumnos con nota >5");
					break;
					
				case 3:
					cont = 0;
					
					if(cuentaNotaInf5(alumno)>0) {
						//Ej004Alumnos.setContadorAlumnos(0);
						aMenor5 = new Ej004Alumnos[cuentaNotaInf5(alumno)];
						
						aMenor5 = notaInf5(alumno, cuentaNotaInf5(alumno));
						//al rellenar el array es donde aumenta el contador estatico
						
						for(Ej004Alumnos a : aMenor5) {
							System.out.println(a);
							cont++;
						}
					}
					
					System.out.println("Hay " +cont +" alumnos con nota <5");
					break;
					
				case 4:
					System.out.println("Hasta pronto");
					break;
					
				default:
					System.out.println("Introduzca una opcion valida.");
					break;
			}
			
		} while(opcion!=4);
		
	}
	
	//MENU
	public static int menu(Scanner teclado) {
		int opcion;
	
		System.out.print("\nMenu"
				+ "\n1. Introducir un alumno"
				+ "\n2. Alumnos con nota > 5"
				+ "\n3. Alumnos con nota < 5"
				+ "\n4. Salir"
				+ "\nOpcion (1-4): ");
		
		//se puede agregar mostrar todos los alumnos y la media si te aburres
		opcion = Integer.parseInt(teclado.nextLine());
				
		return opcion;
	}
	
	//OPCION 1
	public static Ej004Alumnos introducirAlumno() {
		Scanner sc = new Scanner(System.in);
		String nombre, apellido, curso;
		float nota;
		
		System.out.println("Rellene los siguientes campos para el alumno " +(nAlumno+1));
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Apellido: ");
		apellido = sc.nextLine();
		System.out.print("Curso: ");
		curso = sc.nextLine();
		do {
			System.out.print("Nota: ");
			nota = sc.nextFloat();	
		} while(nota<0 || nota>10);
		
		return new Ej004Alumnos(nombre, apellido, curso, nota);
	}
	
	
	//OPCION 2
	public static int cuentaNotaSup5(Ej004Alumnos [] alumno) {
		int cont = 0;
		
		for(Ej004Alumnos a : alumno) {
			if(a !=null)
				if(a.getNota()>=5)
					cont++;
		}
		
		return cont;
	}
	
	public static Ej004Alumnos[] notaSup5(Ej004Alumnos [] alumno, int cont) {
	
		Ej004Alumnos[] aMayorIgual5 = new Ej004Alumnos[cont];
		int j = 0;
		
		for(int i=0; i<alumno.length && alumno[i]!=null; i++) {
			if(alumno[i].getNota()>=5) {
				int nAl = alumno[i].getnAlumno();
				int contEstatico = Ej004Alumnos.getContadorAlumnos();
				
				//COPIA DEL OBJETO
				//Aqui aumenta el contador estatico en 2: new + copia
				//es con el new, cuando se crea el objeto
				aMayorIgual5[j] = new Ej004Alumnos(alumno[i].getNombre(), 
											 	   alumno[i].getApellido(), 
											 	   alumno[i].getCurso(), 
											 	   alumno[i].getNota());
				aMayorIgual5[j] = alumno[i].copia();
				
				aMayorIgual5[j].setnAlumno(nAl+1);
				Ej004Alumnos.setContadorAlumnos(contEstatico);
				j++;
			}
		}
		
		return aMayorIgual5;
	}
	
	
	//OPCION 3
	public static int cuentaNotaInf5(Ej004Alumnos [] alumno) {
		int cont = 0;
		
		for(Ej004Alumnos a : alumno) {
			if(a !=null)
				if(a.getNota()<5) 
					cont++;
		}
		
		return cont;
	}
	
	public static Ej004Alumnos[] notaInf5(Ej004Alumnos [] alumno, int cont) {
	
		Ej004Alumnos[] aMenor5 = new Ej004Alumnos[cont];
		int j = 0;
		
		for(int i=0; i<alumno.length && alumno[i]!=null; i++) {
			if(alumno[i].getNota()<5) {
				int nAl = alumno[i].getnAlumno();
				int contEstatico = Ej004Alumnos.getContadorAlumnos();
				
				//COPIA DEL OBJETO
				//Aqui aumenta el contador estatico en 2: new + copia
				//es con el new, cuando se crea el objeto
				aMenor5[j] = new Ej004Alumnos(alumno[i].getNombre(), 
											  alumno[i].getApellido(), 
											  alumno[i].getCurso(), 
											  alumno[i].getNota());
				aMenor5[j] = alumno[i].copia();
				
				aMenor5[j].setnAlumno(nAl+1);
				Ej004Alumnos.setContadorAlumnos(contEstatico);
				j++;
			}
		}
		
		return aMenor5;
	}
}
