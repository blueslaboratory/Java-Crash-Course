package examen_aeropuerto;

public class Aeroplano extends Thread{
	
	// Si es 0 es un avion, si es 1 es avioneta
	private int tipoAeroplano = -1;
	boolean miturno = false;
	private String tipoAeroplanoString;
	Aeropuerto miaereopuerto;
	
	
	public Aeroplano(Aeropuerto miaereopuerto) {
		this.tipoAeroplano = (int) (Math.random()*2);	
		this.miaereopuerto = miaereopuerto;
		
		if (this.tipoAeroplano==0) {
			this.tipoAeroplanoString = "AVION";
			this.setPriority(MAX_PRIORITY);
		} else {
			this.tipoAeroplanoString = "AVIONETA";
		}
		
		System.out.println("Llega a pista el/la "+ this.tipoAeroplanoString + " con numero " + this.getName());
	}
	
	
	// Los aviones esperan su turno hasta que lo obtienen, cuando lo obtienen, despegan y acaban
	public void run() {
		
		int tipoaeroplanoultimo = -1;
		
		while(!this.miturno) {
			try {
				this.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// Aqui viene la llamada a conseguir el turno para entrar
			this.miturno = this.miaereopuerto.getPistaLibre();
			
			// Si tengo turno, despego
			if (this.miturno) {
				System.out.println("Aeroplano de tipo: " + this.tipoAeroplanoString 
								 + " con numero " + this.getName() + " entra en la pista de despegue...");
				
				// Tengo que saber que tipo era el ultimo que despego
				tipoaeroplanoultimo = this.miaereopuerto.getultimoAvion();
				
				if (tipoaeroplanoultimo == 0) {
					// Espero 3 segundos y despego
					try {
						this.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Aeroplano de tipo: " + this.tipoAeroplanoString 
							         + " con numero " + this.getName() + " ha despegado.");					
				} else {
					//Espero 2 segundos y despego
					try {
						this.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Aeroplano de tipo: " + this.tipoAeroplanoString 
									 + " con numero " + this.getName() + " ha despegado.");							
				}				
				
				//Asigno cual es el ultimo tipo de avion que ha despegado y libero pista
				this.miaereopuerto.setultimoAvion(this.tipoAeroplano);
			}
		
		}		
	}
}