package ejemplos037_multihilos1;



//Clase Contador2
class Contador2 {

	private int c = 0;
	
	// CONSTRUCTOR
	Contador2(int c) {
		this.c = c;
	}

	// GETTERS Y SETTERS: ALT+SHIFT+S
	public int getValor() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	// OTROS METODOS
	public void incrementa() {
		c = c + 1;
	}
	public void decrementa() {
		c = c - 1;
	}
}



//Clase HiloA2: incrementa
class HiloA2 extends Thread {
	private Contador2 contador;

	public HiloA2(String name, Contador2 c) {
		setName(name);
		contador = c;
	}

	public void run() {
		// synchronized: palabra reservada para que en el metodo 
		// solo entre 1 hilo cada vez
		
		synchronized (contador) {
			for (int j = 0; j < 300; j++) {
				contador.incrementa();
				/*try {
					sleep(100);
				} catch (InterruptedException e) {		}
				*/
			}
			System.out.println(getName() + " contador vale " + contador.getValor());
		}

	}
}



//Clase HiloB2: decrementa
class HiloB2 extends Thread {
	private Contador2 contador;

	public HiloB2(String name, Contador2 c) {
		setName(name);
		contador = c;
	}

	public void run() {
		// synchronized: palabra reservada para que en el metodo 
		// solo entre 1 hilo cada vez
		
		synchronized (contador) {
			for (int j = 0; j < 300; j++) {
				contador.decrementa();
				/*try {
					sleep(100);
				} catch (InterruptedException e) {		}
				*/
			}
			System.out.println(getName() + " contador vale " + contador.getValor());
		}
	}
}



public class Compartir2 {
	public static void main(String[] args) {
		Contador2 cont = new Contador2(100);
		
		HiloA2 a = new HiloA2("HiloA", cont);
		HiloB2 b = new HiloB2("HiloB", cont);
		
		a.start();
		b.start();
		
	}
}