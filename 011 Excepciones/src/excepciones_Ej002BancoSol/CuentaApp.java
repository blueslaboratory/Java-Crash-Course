package excepciones_Ej002BancoSol;

//Anadir mostrar datos de todas las cuentas
import java.util.*;

//import lector.Lector;

public class CuentaApp {

	public static final int MAX_OPC = 9;

	public static void main(String args[]) {

		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		Banco b = new Banco();

		while (opcion != MAX_OPC) {
			opcion = menu(MAX_OPC, sc);
			switch (opcion) {
			case 1:
				b.guardarCuenta(b.crearCuenta(sc));
				break;
			case 2:
				b.ingresarEnCuenta(sc);
				break;
			case 3:
				b.sacarDeCuenta(sc);
				break;
			case 4:
				b.listarCuentasSaldo();
				break;
			case 5:
				b.listarCuentas();
				break;
			case 6:
				b.muestraCuenta(sc);
				break;
			case 7:
				b.borraCuenta(sc);
				break;
			case 8:
				b.borraTodasCuentas();
				break;
			}
		}
		sc.close();
	}
	
	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println();
		System.out.println("\t1. Abrir cuenta");
		System.out.println("\t2. Ingresar dinero en cuenta");
		System.out.println("\t3. Sacar dinero de cuenta");
		System.out.println("\t4. Mostrar todas las cuentas(desc por saldo)");
		System.out.println("\t5. Mostrar todas las cuentas(asc por num. cuenta)");
		System.out.println("\t6. Mostrar una cuenta");
		System.out.println("\t7. Borrar una cuenta");
		System.out.println("\t8. Borrar todas las cuentas");
		System.out.println("\t9. Salir");
		do
			opcion_menu = Lector.leeInt(sc, "\n\n\tElija opcion:");
		while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}
}
