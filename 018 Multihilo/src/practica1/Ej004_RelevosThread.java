/*
Utilizando la clase anterior, o una copia ya que posiblemente necesites hacerle alguna
modificaci�n, haz un proyecto y anade otra clase con la que los equipos de Espa�a y
EEUU van a hacer una carrera de relevos:
*/

package practica1;

public class Ej004_RelevosThread extends Thread{

	private String nombre;
	private String pais;
	private int vCorrer;
	//private int tiempoTotal = 0;

	// CONSTRUCTOR
	public Ej004_RelevosThread(String pais, String nombre, int vCorrer) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.vCorrer = vCorrer;
	} 
	
	// GETTERS Y SETTERS: ALT+SHIFT+S
	public int getvCorrer() {
		return vCorrer;
	}

	// OTROS METODOS
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

	// probandolo (opcional)
	public static void main(String args[]) {
		Ej004_RelevosThread r1 = new Ej004_RelevosThread("Jamaica", "Usain Bolt", 958);
		
		r1.start();
	}

}