/*
5.- Crea una clase en Java llamada Cubo con dos atributos:
int capacidad; // capacidad m�xima en litros
int contenido; // contenido actual en litros

La clase tendr� un constructor que recibe la capacidad 
inicial del cubo. Una vez establecida la capacidad, ya 
no ser� posible modificarla.

Habr� un m�todo llamado llena(), que llenar� el cubo hasta 
su capacidad m�xima y otro vacia() que pone el contenido a 
0 litros.

Haz un m�todo llamado vuelcaEn() que  vuelca el contenido 
de un cubo sobre otro. Antes de echar el agua se comprueba 
cu�nto le cabe al cubo destino (ser� el que se manda por 
par�metro (void vuelcaEn(Cubo destino)).

Se pide tambi�n un m�todo llamado pinta() que pinta un cubo 
en la pantalla. Se muestran los bordes del cubo con el 
car�cter # y el agua que contiene con el car�cter ~.
Cada litro se representa con una l�nea.

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
