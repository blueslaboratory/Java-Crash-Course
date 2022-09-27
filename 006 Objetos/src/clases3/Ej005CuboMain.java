/*
5.- Crea una clase en Java llamada Cubo con dos atributos:
int capacidad; // capacidad máxima en litros
int contenido; // contenido actual en litros

La clase tendrá un constructor que recibe la capacidad 
inicial del cubo. Una vez establecida la capacidad, ya 
no será posible modificarla.

Habrá un método llamado llena(), que llenará el cubo hasta 
su capacidad máxima y otro vacia() que pone el contenido a 
0 litros.

Haz un método llamado vuelcaEn() que  vuelca el contenido 
de un cubo sobre otro. Antes de echar el agua se comprueba 
cuánto le cabe al cubo destino (será el que se manda por 
parámetro (void vuelcaEn(Cubo destino)).

Se pide también un método llamado pinta() que pinta un cubo 
en la pantalla. Se muestran los bordes del cubo con el 
carácter # y el agua que contiene con el carácter ~.
Cada litro se representa con una línea.

Para probar el ejercicio, ve haciendo las sentencias 
correspondientes a las siguientes salidas:

Cubo peque:

#	#
#	#
#####


Cubo grande:

#	#
#	#
#	#
#	#
#	#
#	#
#####

Cubo peque lleno :

#~~~#
#~~~#
#####

Vuelco el peque en el grande: 

#	#
#	#
#	#
#	#
#~~~#
#~~~#
#####

*/

package clases3;

public class Ej005CuboMain {
	
	public static void main(String[] args) {
		Ej005Cubo cubo1 = new Ej005Cubo(60,30); //contenido, capacidad
		Ej005Cubo cubo2 = new Ej005Cubo(25,40);
		Ej005Cubo cubo3 = new Ej005Cubo(7,10);
		Ej005Cubo cubo4 = new Ej005Cubo(6,14);
		
		
		cubo1.pinta();
		cubo2.pinta();
		cubo3.pinta();
		cubo4.pinta();
		
		cubo1.vuelcaEn(cubo2);
		cubo2.pinta();
		cubo1.pinta();
		
		cubo4.vuelcaEn(cubo1);
		cubo1.pinta();
		cubo4.pinta();
		
		cubo3.pinta();
		
		cubo3.llena();
		cubo3.pinta();
		
		cubo3.vacia();
		cubo3.pinta();
		
		cubo3.setCapacidad(15);
		cubo3.pinta();
	}
}
