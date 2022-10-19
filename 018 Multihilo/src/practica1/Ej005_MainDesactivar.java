/*
Haz una clase java en la que tengamos 2 metodos:
- Uno simplemente arranca una cuenta atras desde el 9 a 0. Cuando llega a 0, la
bomba explota.
- Otro es un artificiero que intenta desactivar la bomba. Tarda en desactivarla un
numero aleatorio entre 9500 y 10500 milisegundos.

- El metodo indicara cuando empieza y cuando acaba su tiempo.
- En este metodo controlaremos la excepcion de que se interrumpa el hilo
(InterruptedException) e indicaremos que el artificiero ha muerto.

Estos metodos se arrancaran uno u otro en funcion de un parametro.
Arranca 2 hilos, uno con el artificiero y otro con el contador.
Controla el final del hilo de la bomba para que cuando acabe, 
interrumpa el hilo del artificiero produciendo una salida como esta
*/

package practica1;

public class Ej005_MainDesactivar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ej005_Bomba bomba = new Ej005_Bomba(10);
		Ej005_Artificero artificero = new Ej005_Artificero();
		
		
		bomba.start();
		artificero.start();
		
		do {
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} while(bomba.isAlive() && artificero.isAlive());
		
		// si termina el artificero antes sale del bucle y el hilo de bomba esta vivo
		if(bomba.isAlive()) {
			bomba.interrupt();
		}
		// termina bomba antes y el artificero muere
		else {
			artificero.interrupt();
		}
			
	}

}
