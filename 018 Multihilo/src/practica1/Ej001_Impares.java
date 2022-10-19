/*
Ejercicio 1 - PAR / IMPAR
Escribe una clase con un metodo que en funcion de un dato saque por consola los impares
entre 1 y 10 o los pares entre 1 y 10.
Genera 2 hilos de la clase, uno para que genere los pares y otro para generar los impares.
Prueba y documenta varias respuestas
*/

package practica1;

// Con implements Runnable
public class Ej001_Impares implements Runnable{

	private String impares;
	private int tiempo;

	public Ej001_Impares(String impares, int tiempo) {
		super ();
		this.impares = impares;
		this.tiempo = tiempo;
	} 
		
	public void impares() {
		try {
			for(int i=0; i<=10; i++) {
				if(i%2!=0) {
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
		this.impares();
	}

	// main opcional, para que funcione suelto
	public static void main(String[] args) {
		
		Ej001_Impares i = new Ej001_Impares("", 1);
		
		new Thread(i).start();
	}
}
