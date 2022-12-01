/*
Ejercicio 1 - PAR / IMPAR
Escribe una clase con un metodo que en funcion de un dato saque por consola los impares
entre 1 y 10 o los pares entre 1 y 10.
Genera 2 hilos de la clase, uno para que genere los pares y otro para generar los impares.
Prueba y documenta varias respuestas
*/

package practica1;

// Con extends Thread
public class Ej001_Pares extends Thread{

	private String pares;
	private int tiempo;

	public Ej001_Pares(String pares, int tiempo) {
		super ();
		this.pares = pares;
		this.tiempo = tiempo;
	} 
		
	public void pares() {
		try {
			
			for(int i=0; i<=10; i++) {
				if(i%2==0) {
					System.out.println(i);
					Thread.sleep(tiempo * 1000);
				}		
			}
			// en java no hay multiherencia
			
		}catch (InterruptedException e) {
			e.printStackTrace () ;
		}														
	}
	
	@Override
	public void run() {
		// meto lo que quiero que se ejecute cuando hago el start()
		this.pares();
	}

	// main opcional, para que funcione suelto
	public static void main(String[] args) {
		
		Ej001_Pares p = new Ej001_Pares("", 1);
		
		p.start(); // llama al run
	}
}