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

public class Ej005_Bomba extends Thread{

	private int contador;
	
	public Ej005_Bomba(int contador) {
		super();
		this.contador = contador;
	}
	
	public void countdown() {
		
		for(int i=contador; i>0; i--) {
			
			try {
				Thread.sleep(1000);
				System.out.println("Countdown: " +i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				return;
			}
			
		}
		
		System.out.println("BOOM");
	}

	
	@Override
	public void run() {
		countdown();
	}

	
	// sobraria pero nos lo quedamos para ver
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej005_Bomba b = new Ej005_Bomba(9);
		
		b.start();
		
	}

}