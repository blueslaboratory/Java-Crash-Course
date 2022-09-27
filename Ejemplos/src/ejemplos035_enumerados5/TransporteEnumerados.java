package ejemplos035_enumerados5;

//Demostracion de ordinal() y compareTo()
enum Transporte {
	COCHE, CAMION, AVION, TREN, BARCO;
}

class TransporteEnumerados {
	public static void main(String[] args) {
		Transporte tp1, tp2, tp3;

		// Obtiene todos los valores ordinales usando ordinal().

		System.out.println("Aqui estan todas las constantes de Transporte y sus valores ordinales: ");

		//Acuérdate de que Transporte.values() devuelve un array con las
		// constantes de la enumeración

		for (Transporte t : Transporte.values())
			System.out.println(t + " " + t.ordinal());

		tp1 = Transporte.AVION;
		tp2 = Transporte.TREN;
		tp3 = Transporte.AVION;

		System.out.println();

		// Uso de CompareTo()
		if (tp1.compareTo(tp2) < 0)
			System.out.println(tp1 + " esta antes que " + tp2);
		else if (tp1.compareTo(tp2) > 0)
			System.out.println(tp1 + " esta despues que " + tp2);
		else
			System.out.println(tp1 + " es igual que " + tp3);

		tp1 = Transporte.CAMION;
		tp2 = Transporte.COCHE;
		tp3 = Transporte.CAMION;

		// Uso de CompareTo()
		if (tp1.compareTo(tp2) < 0)
			System.out.println(tp1 + " esta antes que " + tp2);
		if (tp1.compareTo(tp2) > 0)
			System.out.println(tp1 + " esta despues que " + tp2);
		if (tp1.compareTo(tp3) == 0)
			System.out.println(tp1 + " es igual que " + tp3);
	}
}
