package ejemplos026_excepciones2;
//Este java tiene varias clases, pero solo 1 puede ser publica (la que tenga el main)

class Limites extends Exception {}
class DemasiadoCalor extends Limites {}
class DemasiadoCansado extends Limites {}
//Solo tenemos constructores por defecto

public class NuevasExc2 {

	public static void main(String args[]) {
		
		NuevasExc2 nuevas = new NuevasExc2();

		try {
			nuevas.lanza();// Puede lanzar una excepcion
		} catch (Limites lim) {
			if (lim instanceof DemasiadoCalor)
				System.out.println("Capturada excesivo calor!");
			if (lim instanceof DemasiadoCansado)
				System.out.println("Capturada excesivo cansancio!");
		}
	}

	public void lanza() throws Limites {
		int temp = 41, dormir = 7;

		if (temp > 40)
			throw (new DemasiadoCalor());
		// Si se lanza Calor, la otra ya no se lanza
		if (dormir < 8)
			throw (new DemasiadoCansado());
	}
}