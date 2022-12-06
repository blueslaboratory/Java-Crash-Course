package hogwarts;

public class Bailarin extends Thread{
	
	Integer PosicionBaileActual = 0, posicionAnterior = -1;
	String nombre;
	Integer casaIncompatible;
	String listaParejas[];
	Pareja mipareja;
	
	public Bailarin(String nombre, Integer casaIncompatible, String listaParejas[], Pareja mipareja) {
		this.nombre=nombre;
		this.casaIncompatible=casaIncompatible;		
		this.listaParejas = listaParejas;
		this.mipareja = mipareja;
	}
	
	public void baile() {
		
		// El baile dura 2 minutos, 24 vueltas de 5 segundos
		for (int i=0; i<24; i++) {
			//Buscamos la pareja			
			PosicionBaileActual = this.mipareja.getPareja(posicionAnterior, casaIncompatible);
			posicionAnterior = PosicionBaileActual;
			if (PosicionBaileActual==-1) {
				System.out.println(this.nombre+" descansa esta vez");				
			}else {				
				System.out.println(this.nombre+" bailará con "+listaParejas[PosicionBaileActual]);				
			}
			// este paso de baile dura 5 segundos
			try {
				this.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (PosicionBaileActual!=-1) {	
				this.mipareja.liberarPareja(PosicionBaileActual);
			}
			System.out.println(this.nombre + " cambia de pareja");
		}
	}

	@Override
	public void run() {
		this.baile();
	}
}
