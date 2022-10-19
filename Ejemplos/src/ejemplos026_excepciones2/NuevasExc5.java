package ejemplos026_excepciones2;

// En la clase NuevasExc2.java se definen las excepciones propias
// como estan en el mismo paquete puede acceder a ellas
public class NuevasExc5 {

	public static void main(String args[]) {

		NuevasExc5 nuevas = new NuevasExc5();

		try {
			nuevas.lanza();// Puede lanzar una excepcion
		} catch (DemasiadoCansado d) {
			System.out.println("Capturada excesivo cansancio!");
		} catch (DemasiadoCalor d) {
			System.out.println("Capturada excesivo calor!");
		} catch (Limites l) { // Aunque de momento, no hay otra... esta es la generica
			System.out.println("Otra!");
		}
	}

	public void lanza() throws Limites {
		int temp = 41, dormir = 7;

		if (temp > 40)
			throw (new DemasiadoCalor());
			// Si se lanza esta, la otra ya no se lanza
		if (dormir < 8)
			throw (new DemasiadoCansado());
	}

}