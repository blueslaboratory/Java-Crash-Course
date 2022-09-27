package excepciones_Ej002BancoSol;

import java.util.*;

//import banco.Cuenta;

public class porCuenta implements Comparator<Cuenta> {

	public int compare(Cuenta c1, Cuenta c2) {
		return c1.devnCC() - c2.devnCC();
	}

}