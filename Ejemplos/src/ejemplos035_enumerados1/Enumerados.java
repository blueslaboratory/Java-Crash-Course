package ejemplos035_enumerados1;

public class Enumerados {
	public static void main(String[] args) {
		Transporte tp;

		tp = Transporte.AVION;

		System.out.println("Valor de tp: " + tp);
		System.out.println();

		tp = Transporte.TREN;

		// Comparacion de 2 valores enum
		if (tp == Transporte.TREN)
			System.out.println("tp tiene el valor de TREN\n");
		
		if (tp.equals(Transporte.TREN))
			System.out.println("tp tiene el valor de TREN\n");

		if (tp.compareTo(Transporte.TREN) == 0)
			System.out.println("tp tiene el valor de TREN\n");

		
		// enum para controlar sentencia switch
		switch (tp) {
		case COCHE:
			System.out.println("Un auto lleva personas.");
			break;
		case CAMION:
			System.out.println("Un camion lleva carga.");
			break;
		case AVION:
			System.out.println("Un avion vuela.");
			break;
		case TREN:
			System.out.println("Un tren corre sobre rieles.");
			break;
		case BARCO:
			System.out.println("Un barco navega en el agua.");
			break;
		}
	}
}
