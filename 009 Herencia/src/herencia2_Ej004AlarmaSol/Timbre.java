package herencia2_Ej004AlarmaSol;
public class Timbre {
	boolean activado = false;
	
	public void activar(){
		activado = true;

		System.out.println("TIMBRE ACTIVADO");	
	}
	
	public void desActivar(){
		activado = false;
		System.out.println("TIMBRE DESACTIVADO");		
	}
	
	boolean devEstado(){
		return activado;
	}
}