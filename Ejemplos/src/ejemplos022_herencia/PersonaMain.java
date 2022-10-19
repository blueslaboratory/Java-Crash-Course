package ejemplos022_herencia;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Alumno a1 = new Alumno();
		//Aunque no es la mejor forma, por ver como usa herencia
		a1.leer(sc);
		System.out.println(a1);
		sc.close();
	}
}
