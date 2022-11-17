package tictac;

public class Tac extends Thread{

	private String info;
	private int tiempoTac;

	public Tac(String info, int tiempoTac) {
	
		super ();
		this.info = info;
		this.tiempoTac = tiempoTac;
	} 
		
	public void tac() {
		try {
			System.out.println("tac" +this.info);
			// esto al parar los hilos daria un problema: una excepcion
			// es mejor hacer un extends, 
			// en java no hay multiherencia
			Thread.sleep(tiempoTac * 1000);
		}catch (InterruptedException e) {
			e.printStackTrace () ;
		}														
	}
	
	@Override
	public void run() {
		this.tac();
	}

	
	// Probando la clase
	public static void main(String[] args) {
		
		Tac t = new Tac("", 1);
		
		// System.out.println(args);
		t.start(); // llama al run
	}
}