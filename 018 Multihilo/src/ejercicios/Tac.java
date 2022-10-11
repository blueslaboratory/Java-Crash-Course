package ejercicios;

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
			// dn java no hay multiherencia
			Thread.sleep(tiempoTac * 1000);
		}catch (InterruptedException e) {
			e.printStackTrace () ;
		}														
	}
	
	@Override
	public void run() {
		this.tac();
	}

	public static void main(String[] args) {
		Tac t = new Tac("", 1);
		
		t.start(); // llama al run
	}
}