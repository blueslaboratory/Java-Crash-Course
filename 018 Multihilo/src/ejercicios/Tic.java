package ejercicios;

public class Tic extends Thread{

	private String info;
	private int tiempoTic;

	public Tic(String info, int tiempoTac) {
		super ();
		this.info = info;
		this.tiempoTic = tiempoTac;
	}
		
	public void tic() {
		try {
			System.out.println("tic " +this.info);
			// esto al parar los hilos daria un problema: una excepcion
			// es mejor hacer un extends, 
			// en java no hay multiherencia
			Thread.sleep(tiempoTic * 1000);
		}catch (InterruptedException e) {
			e.printStackTrace () ;
		}														
	}
	
	
	@Override
	public void run() {
		this.tic();
	}

	
	// Probando la clase
	public static void main(String[] args) {
		Tic t = new Tic("", 1);
		
		t.start(); //llama al run
	}
}