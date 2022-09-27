package excepciones_Ej002BancoSol;

import java.util.*;

//import lector.Lector;
//import ordenacion.porCuenta;
//import ordenacion.porSaldo;

public class Banco {
	private ArrayList<Cuenta> listaC;

	public Banco() {
		listaC = new ArrayList<Cuenta>();
	}

	public Cuenta crearCuenta(Scanner sc) {
		// Verificar si ya existe esa cuenta
		int nC = Lector.leeInt(sc, "Introduzca el numero de cuenta");
		int pos = busquedaSecuencial(listaC, nC);
		if (pos == -1) { // Si no existe ya, la puedo crear
			return (new Cuenta(Lector.leeDouble(sc, "Introduzca la cantidad para abrir cuenta"), nC));
		} else
			return null;
	}

	//Metodos
	public void guardarCuenta(Cuenta c) {
		if (c != null) {
			if (listaC.add(c))
				System.out.println("La cuenta ha sido guardada.");
			else
				System.out.println("La cuenta no ha podido guardarse.");
		} else
			System.out.println("Ese numero cuenta ya existe.");
	}

	public void ingresarEnCuenta(Scanner sc) {
		int numCuenta, pos;
		double cantidad;
		numCuenta = Lector.leeInt(sc, "Introduzca el numero de cuenta");
		pos = busquedaSecuencial(listaC, numCuenta);

		if (pos != -1) {
			cantidad = Lector.leeDouble(sc, "Introduzca la cantidad a ingresar");
			listaC.get(pos).ingresar(cantidad);
			System.out.println(listaC.get(pos));
		} else
			System.out.println("La cuenta no existe");
	}

	public void sacarDeCuenta(Scanner sc) {
		int numCuenta, pos;
		double cantidad;
		numCuenta = Lector.leeInt(sc, "Introduzca el numero de cuenta");
		pos = busquedaSecuencial(listaC, numCuenta);

		if (pos != -1) {
			cantidad = Lector.leeDouble(sc, "Introduzca la cantidad a sacar");
			listaC.get(pos).sacar(cantidad);
			System.out.println(listaC.get(pos));
		} else
			System.out.println("La cuenta no existe");
	}

	public void muestraCuenta(Scanner sc) {
		int numCuenta = Lector.leeInt(sc, "Introduzca el numero de cuenta");
		int pos = busquedaSecuencial(listaC, numCuenta);
		if (pos != -1) {
			System.out.println(listaC.get(pos));
		} else
			System.out.println("La cuenta no existe");
	}

	public void listarCuentas() {
		Cuenta cuenta;

		Collections.sort(listaC, new porCuenta());

		if (listaC.size() > 0) {
			Iterator<Cuenta> it = listaC.iterator();
			while (it.hasNext()) {
				cuenta = it.next();
				System.out.println("Cuenta: " + cuenta);
			}
		} else
			System.out.println("No hay cuentas");
	}

	public void listarCuentasSaldo() {
		Cuenta cuenta;

		Collections.sort(listaC, new porSaldo());

		if (listaC.size() > 0) {
			Iterator<Cuenta> it = listaC.iterator();
			while (it.hasNext()) {
				cuenta = it.next();
				System.out.println("Cuenta: " + cuenta);
			}
		} else
			System.out.println("No hay cuentas");
	}

	public void borraCuenta(Scanner sc) {
		Cuenta c;

		int numCuenta = Lector.leeInt(sc, "Introduzca el numero de cuenta");
		int pos = busquedaSecuencial(listaC, numCuenta);
		if (pos != -1) {
			Iterator<Cuenta> it = listaC.iterator();
			while (it.hasNext()) {
				c = it.next();
				if (c.devnCC() == numCuenta) {
					System.out.println("Cuenta borrada: " + c);
					it.remove();
				}
			}
		} else
			System.out.println("La cuenta no existe");
	}

	public void borraTodasCuentas() {
		listaC.clear();
		System.out.println("Se han borrado todas las cuentas. ");
	}

	public static int busquedaSecuencial(ArrayList<Cuenta> lista, int dato) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).devnCC() == dato)
				return i;
		}

		return -1;
	}

}