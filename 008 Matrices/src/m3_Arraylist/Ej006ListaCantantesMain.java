/*
6.- Ejercicio para guardar informacion sobre cantantes famosos. Crearemos 
una clase denominada ListaCantantes que disponga de un atributo de tipo 
ArrayList para guardar cantantes. La clase debe tener un metodo que permita 
anadir objetos de tipo CantanteFamoso  en la lista, otro metodo para eliminar 
un cantante y dos metodos para mostrar el disco mas vendido de cada cantante 
y todos los discos de cada cantante (todo son opciones del menu que se 
muestra mas abajo).

Cada objeto de tipo CantanteFamoso tendra como atributos:

•	nombre (String)
•	discos (lista con los discos)
•	y los metodos para obtener y establecer los atributos.

En el atributo discos, se guardara un listado de todos los discos editados 
por el cantante. Para cada uno de los discos se dispondra de su titulo y el 
numero de ejemplares vendidos.

Crea una clase principal que muestre un menu, con las siguientes opciones:
1. Introducir nuevo Cantante.
2. Borrar cantante.
3. Mostrar disco mas vendido de cada cantante.
4. Mostrar los cantantes y sus discos.
5. Salir.

Elija opcion:
*/


package m3_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Ej006ListaCantantesMain {
	public static void main(String[] args) {
		
		Ej006ListaCantantes lista = new Ej006ListaCantantes();
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		
		do{
			opcion = menu(sc);
			
			switch (opcion) {
				case 0:
					break;
				case 1:
					lista.add(crearCantante(sc));
					break;
				case 2:
					borrarCantante(sc, lista);
					break;
				case 3:
					for(int i=0; i<lista.getListaCantantes().size(); i++) {
						lista.discoFamoso(i);
					}
					break;
				case 4:
					//System.out.println(lista); //te da la dir de memoria
					System.out.println(lista.getListaCantantes());
					break;
				default:
					System.out.println("Introduce una opcion valida (0-4)");
					break;
			}
		
		}while(opcion!=0);
		
	}
	
	public static int menu(Scanner sc) {
		int opcion;
		
		System.out.println("\n1. Introducir nuevo Cantante.");
		System.out.println("2. Borrar cantante.");
		System.out.println("3. Mostrar disco mas vendido de cada cantante.");
		System.out.println("4. Mostrar los cantantes y sus discos.");
		System.out.println("0. Salir");
		System.out.print("Opcion: ");
		opcion = Integer.parseInt(sc.nextLine());
		
		return opcion;
	}
	
	//1
	public static Ej006CantanteFamoso crearCantante(Scanner sc) {
		String artista, nomDisco, nVendidos;
		String[] datosDisco;
		Ej006Discos discosObj = new Ej006Discos();
		Ej006CantanteFamoso cFam;
		int nDiscos;
		
		System.out.print("Nombre del artista: ");
		artista = sc.nextLine();
		
		System.out.print("Cuantos discos quieres introducir: ");
		nDiscos = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<nDiscos; i++) {
			datosDisco = new String[2]; //Esther: aqui lo tienes que crear cada vez
			System.out.print("Nombre del disco " +(i+1) +": ");
			nomDisco = datosDisco[0] = sc.nextLine();
			System.out.print("Numero de discos vendidos: ");
			nVendidos = datosDisco[1] = sc.nextLine();
			discosObj.add(datosDisco);
			System.out.println(Arrays.toString(datosDisco));
		}
		
		return new Ej006CantanteFamoso(artista, discosObj);
	}
	
	//2
	public static void borrarCantante(Scanner sc, Ej006ListaCantantes lista) {
		if(Ej006CantanteFamoso.getContArtista()>0) {
			int borrarPos;
			System.out.println("Hay " +Ej006CantanteFamoso.getContArtista() +" artistas");
			do {
				System.out.print("Borrar el artista en la posicion: ");
				borrarPos = Integer.parseInt(sc.nextLine());
			} while(borrarPos<1 || borrarPos>Ej006CantanteFamoso.getContArtista());
			lista.getListaCantantes().remove(borrarPos-1);
			Ej006CantanteFamoso.setContArtista(Ej006CantanteFamoso.getContArtista()-1);
			System.out.println("Borrado");
			
		}
		else
			System.out.println("Aun no hay cantantes");
		
	}
}

