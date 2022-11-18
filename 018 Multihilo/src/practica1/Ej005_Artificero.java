/*
Haz una clase java en la que tengamos 2 metodos:
- Uno simplemente arranca una cuenta atras desde el 9 a 0. 
  Cuando llega a 0, la bomba explota.
- Otro es un artificiero que intenta desactivar la bomba. 
  Tarda en desactivarla un numero aleatorio entre 9500 y 10500 ms.

- El metodo indicara cuando empieza y cuando acaba su tiempo.
- En este metodo controlaremos la excepcion de que se interrumpa el hilo
  (InterruptedException) e indicaremos que el artificiero ha muerto.

Estos metodos se arrancaran uno u otro en funcion de un parametro.
Arranca 2 hilos, uno con el artificiero y otro con el contador.
Controla el final del hilo de la bomba para que cuando acabe, 
interrumpa el hilo del artificiero produciendo una salida como esta
*/


package practica1;

public class Ej005_Artificero extends Thread{

	private int tDesactivar;
	
	public Ej005_Artificero() {
		super();
		this.tDesactivar = (int) Math.floor(Math.random()*(10500-9500+1)+9500);
	}
	
	public void desactivar() {
		
		System.out.println("Comienza la desactivacion");
		
		try {
			Thread.sleep(tDesactivar);
			System.out.println("Bomba status: desactivada en " +tDesactivar +"ms");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			return;
		}
	}

		@Override
	public void run() {
		this.desactivar();
		
	}

	// sobraria pero nos lo quedamos para ver
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej005_Artificero a = new Ej005_Artificero();
		
		a.start();
		
	}

}