package excepciones_Ej002BancoSol;
import java.util.*;
public class Lector{
	public static int leeInt(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return Integer.parseInt(sc.nextLine());
	}
		
	public static String leeCadena(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.nextLine();
	}
	
	public static String leeLinea(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return sc.nextLine();
	}
	
	public static Float leeFloat(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return Float.parseFloat(sc.nextLine());
	}
	
	public static Double leeDouble(Scanner sc, String mensaje){
		System.out.println(mensaje);
		return Double.parseDouble(sc.nextLine());
	}
}