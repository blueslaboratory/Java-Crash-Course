/*

A raiz de una gran tormenta se han quedado atascados en un pequeño aeropuerto 20
aeroplanos entre aviones y avionetas (no se sabe cuantos son aviones y cuantos son
avionetas).
Una vez pasada la tormenta todos tienen mucha prisa por despegar, pero solo hay una
pista. Asi que el despegue se hara siguiendo las siguientes condiciones:
Los aeroplanos llegaran a la zona de espera previa a la pista de despegue cada 2 minutos
(2.000 milisegundos en la simulacion). Ningun tipo de aeroplano tiene prioridad sobre el otro
para situarse en la zona de espera (Pista: generacion de los hilos, tipo aleatorio).
En caso de que haya aviones y avionetas esperando en la zona de espera, se le dara
prioridad a los aviones para entrar en la pista de despegue.
Los aeroplanos al despegar generan turbulencias, por lo que entre dos despegues
consecutivos tiene que transcurrir un intervalo de tiempo minimo:
● 3 minutos (3.000 milisegundos) despues del despegue de un avion.
● 2 minutos (2.000 milisegundos) despues del despegue de una avioneta.
Debes documentar en la entrega el despegue de los 20 aeroplanos (TODOS)

*/

package examen_aeropuerto;

public class Main {

	public static void main(String[] args)	{
		
		int j = 20; // numero de hilos
		Aeropuerto miaereopuerto = new Aeropuerto();
		Contador contador = new Contador();
		Aeroplano aeroplano[] = new Aeroplano[j];

		contador.start();
		// Creamos objetos en cada posicion
		
		for (int i=0; i<j; i++) {
			
			aeroplano[i] = new Aeroplano(miaereopuerto);
			aeroplano[i].start();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
