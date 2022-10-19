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
