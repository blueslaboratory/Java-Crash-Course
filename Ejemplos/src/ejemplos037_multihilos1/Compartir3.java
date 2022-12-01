package ejemplos037_multihilos1;


//Clase Contador3
class Contador3 {
	
	private int c = 0;
	
	// CONSTRUCTOR
	Contador3(int c) {
		this.c = c;
	}

	// GETTERS Y SETTERS: ALT+SHIFT+S
	// synchronized: palabra reservada para que en el metodo 
	// solo entre 1 hilo cada vez
	public synchronized int getValor() {
		return c;
	}
	
	// OTROS METODOS
	public synchronized void incrementa() {
		c = c + 1;
	}
	public synchronized void decrementa() {
		c = c - 1;
	}

}



//Clase HiloA3: incrementa
class HiloA3 extends Thread {
	private Contador3 contador;
	
	public HiloA3(String name, Contador3 c) {
		setName(name);
		contador = c;
	}
	
	public void run() {
		for (int j = 0; j < 300; j++) {
			contador.incrementa();
			/*
			 * try { sleep(100); } catch (InterruptedException e) { }
			 */
		}
		System.out.println(getName() + " contador vale " + contador.getValor());
	}
}



//Clase HiloB3: decrementa
class HiloB3 extends Thread {
	
	private Contador3 contador;
	
	public HiloB3(String name, Contador3 c) {
		setName(name);
		contador = c;
	}
	
	public void run() {
		for (int j = 0; j < 300; j++) {
			contador.decrementa();
			/*
			 * try { sleep(100); } catch (InterruptedException e) {}
			 */
		}
		System.out.println(getName() + " contador vale " + contador.getValor());
	}
}



public class Compartir3 {
	public static void main(String[] args) {
		Contador3 cont = new Contador3(100);
		
		HiloA3 a = new HiloA3("HiloA", cont);
		HiloB3 b = new HiloB3("HiloB", cont);
		
		a.start();
		b.start();       
	}
}
