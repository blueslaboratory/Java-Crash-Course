package ejemplos026_excepciones1;
//Este java tiene varias clases, pero solo 1 puede ser publica (la que tenga el main)

class Limites extends Exception {} // excepcion padre 
class DemasiadoCalor extends Limites {} // excepcion hija
class DemasiadoCansado extends Limites {} // excepcion hija

// Solo tenemos constructores por defecto
public class NuevasExc1 {
	
	public static void main(String args[]){	
		NuevasExc1 nuevas = new NuevasExc1();
		nuevas.lanza();	
	}
	
	public void lanza() /*throws Limites*/ {
		int temp=41, dormir=4;
		
		try {
			// Si se captura esta, se va al bloque catch y la otra no se captura
			if (temp > 40) {
				System.out.println("Se lanza demasiado calor");
				throw (new DemasiadoCalor());
			}

			if (dormir < 8) {
				System.out.println("Se lanza demasiado Cansado");
				throw (new DemasiadoCansado());
			}

			// return;

		} catch (Limites lim) {
			if (lim instanceof DemasiadoCalor)
				System.out.println("Capturada excesivo calor!");
			if (lim instanceof DemasiadoCansado)
				System.out.println("Capturada excesivo cansancio!");
		} finally {
			System.out.println("En la clausula finally");
	    	//cuando trabajamos con ficheros-bbdd, el finally sirve para cerrarlos
	    }        	
	}
	
}