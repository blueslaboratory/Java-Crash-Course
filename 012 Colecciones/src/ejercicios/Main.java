package ejercicios;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrayString = { "uno", "dos", "tres", "cuatro", "cinco" };
		Utilidades.alReves(arrayString);
		Utilidades.muestraArray(arrayString);		
		// sustituyeArray reemplaza los elementos por el que se manda
		Utilidades.sustituyeArray(arrayString, "hola");
		Utilidades.muestraArray(arrayString);

		Integer[] arrayInteger = { 1, 2, 3, 4, 5 };
		Utilidades.alReves(arrayInteger);
		Utilidades.muestraArray(arrayInteger);
		Utilidades.sustituyeArray(arrayInteger, 4);
		Utilidades.muestraArray(arrayInteger);

		Alumno[] alumnos = new Alumno[3];
		try {
			alumnos[0] = new Alumno("uno", 20);
			alumnos[1] = new Alumno("dos", 16);
			alumnos[2] = new Alumno("tres", 21);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Utilidades.muestraArray(alumnos);
		Utilidades.alReves(alumnos);
		Utilidades.sustituyeArray(alumnos, alumnos[1]);
		
		try {
			alumnos[0].setNota(9);
			//cambia todas las notas xq todos apuntan al mismo objeto 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		Utilidades.muestraArray(alumnos);
		
		
		sc.close();
	}

}
