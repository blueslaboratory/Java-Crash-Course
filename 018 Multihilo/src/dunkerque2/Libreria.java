package dunkerque2;

public class Libreria extends Thread{

	
	// OTROS METODOS
	// RANDOM
	public static int random(int min, int max) {

		// En general, para conseguir un numero entero entre [N, M]
		// con N < M y ambos incluidos, debemos usar esta formula:
		// int valorEntero = Math.floor(Math.random()*(M-N+1)+N);
		// Valor entre M y N, ambos incluidos.

		int nRandom = (int) (Math.random() * (max - min + 1) + min);
		return nRandom;
	}

	
	// CUENTA ATRÁS
	public static boolean COUNTER = true;
	public static void cuentaAtras() throws InterruptedException {
		int c = 0;
		
		while(COUNTER) {
			
			for(c=0; c<6; c++) {
				Thread.sleep(24*1000);
				System.out.println();
				System.out.println("********************************");
				System.out.println("5 - HAN PASADO " +(c+1) +" DIAS DE COMBATE");
				System.out.println("********************************");
				
				if(COUNTER == false)
					c=6;
			}
			
			COUNTER = false;
			
		}
	}
	
	
	// RUN
	public void run() {
		try {
			cuentaAtras();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
