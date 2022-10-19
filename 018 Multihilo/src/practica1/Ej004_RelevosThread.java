/*
Utilizando la clase anterior, o una copia ya que posiblemente necesites hacerle alguna
modificación, haz un proyecto y anade otra clase con la que los equipos de España y
EEUU van a hacer una carrera de relevos:
*/

package practica1;

public class Ej004_RelevosThread extends Thread{

	private String nombre;
	private String pais;
	private int vCorrer;
	//private int tiempoTotal = 0;

	public Ej004_RelevosThread(String pais, String nombre, int vCorrer) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.vCorrer = vCorrer;
	} 
	
	public int getvCorrer() {
		return vCorrer;
	}

	public int cienMetros() {
		// tMarathon(horas)
		int tCienMetros = 10*this.vCorrer;
		
		try {
			System.out.println(this.pais +": " +this.nombre +" comienza su relevo a " +(float)tCienMetros/1000 +"m/s");
			Thread.sleep(tCienMetros);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(this.pais +": " +this.nombre +" ha acabado su relevo - ha tardado " +(float)tCienMetros/1000+" segundos");
		
		return tCienMetros;												
	}
	
	
	@Override
	public void run() {
		this.cienMetros(); 
	}


}