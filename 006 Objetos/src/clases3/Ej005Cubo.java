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

public class Ej005Cubo {
	
	private int contenido; //contenido actual en litros
	private int capacidad; //capacidad maxima en litros
	private int nCubo;
	private static int contCubo = 0;
	
	//PINTA
	public void pinta() {
		int base = 5;
		int lineas = Math.round((float)capacidad/(float)base);
		int capLineas = lineas*base;
		int contPintar = contenido;
		int aire = capLineas - contenido;
		
		System.out.println("Pinta cubo " +nCubo);
		
		
		for(int j=0; j<lineas; j++) {
			System.out.print("#");
			for(int i=0; i<base; i++) {

				//agua
				if(contPintar>0 && aire<=0) {
					System.out.print("~");
					contPintar--;
				}
				
				//aire
				else {
					System.out.print(" ");
					aire--;
				}
			}
			
			System.out.println("#\t" +capLineas +"L");
			capLineas -= base;
		}
		System.out.println("#######");//BASE DE 5 LITROS
		System.out.println("Contenido: "+contenido);
		System.out.println("Capacidad: "+capacidad);
		
		System.out.println();
		System.out.println();
	}
	
	//VUELCA CUBO
	public int vuelcaEn(Ej005Cubo cuboDestino) {
		
		System.out.println("Vuelca cubo " +nCubo +" en cubo " +cuboDestino.nCubo);
		
		if(cuboDestino.contenido+contenido > cuboDestino.capacidad) {
			contenido = Math.abs(cuboDestino.contenido+contenido - cuboDestino.capacidad);
			cuboDestino.contenido = cuboDestino.capacidad;
			//cuboDestino.llena();
		}
		
		else {
			cuboDestino.contenido += contenido;
			contenido = 0;
			//contenido = vacia();
		}
		
		return cuboDestino.contenido;
	}
	
	//LLENA
	public int llena() {
		System.out.println("Llena cubo " +nCubo);
		contenido = capacidad;
		return contenido;
	}
	
	//VACIA
	public int vacia() {
		System.out.println("Vacia cubo " +nCubo);
		contenido = 0;
		return contenido;
	}
	
	
	//ALT + SHIFT + S
	//CONSTRUCTORES
	public Ej005Cubo() {
		nCubo = contCubo+1;
		contCubo++;
	}
	public Ej005Cubo(int contenido, final int capacidad) {
		if(contenido>capacidad) 
			this.contenido = capacidad;
		
		else
			this.contenido = contenido;
		
		//Para que capacidad sea final de una vez y para siempre
		//esto no esta funcionando, con el set se puede cambiar la cap
		this.capacidad = capacidad;
		setCapacidad(capacidad);
		
		nCubo = contCubo+1;
		contCubo++;
	}

	
	//SETTERS
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	public void setCapacidad(final int capacidad) {
		this.capacidad = capacidad;
	}
}
