package examen_atasco;

import java.util.concurrent.Semaphore;

public class PuntoAtasco {
	
	private Integer NumCochesAtascados = 0;
	private Semaphore s;
	
	// CONSTRUCTORES ALT + SHIFT + S
	public PuntoAtasco() {}
	public PuntoAtasco(Semaphore s) {
		this.s = s;
	}
	
	
	// OTROS METODOS
	public Integer getCochesAtascados() {
		return NumCochesAtascados;
	}

	public void AnadeCocheAtasco() {
		this.NumCochesAtascados=this.NumCochesAtascados+1;
	}
	
	public void SaleCocheAtasco() {
		if(this.NumCochesAtascados>0) {
			this.NumCochesAtascados=this.NumCochesAtascados-1;	
		}
	}
	
	
	public void pasarAtasco() {
		
		try {
			
			s.acquire();
		
				// Pasar el atasco cuesta 500 milisegundos
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Y restamos uno del atasco
				this.SaleCocheAtasco();
			
			s.release();
		
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
