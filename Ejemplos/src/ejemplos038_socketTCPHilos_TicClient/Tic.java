package ejemplos038_socketTCPHilos_TicClient;


import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Tic {
	
	public static void main(String[] args) throws IOException {
	
		String Host = "localhost";
		int Puerto = 6000;// puerto remoto
		Socket Cliente = new Socket(Host, Puerto);
		OutputStream flujoSalida;				
		
		// CREO FLUJO DE SALIDA AL SERVIDOR	
		flujoSalida = Cliente.getOutputStream();
							
		for(int i=0; i<100; i++) {
			
			flujoSalida.write("TIC\n".getBytes());
			flujoSalida.flush();
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		flujoSalida.write("*".getBytes());		
		flujoSalida.close();		//

		System.out.println("Fin del envio... ");
		Cliente.close();
		}
}
