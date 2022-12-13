/*

Un Documento Nacional de Identidad (DNI) esta compuesto por un numero y una letra, por
ejemplo 56999545W.

Para verificar el DNI de espanoles residentes mayores de edad, el algoritmo de calculo del
digito de control es el siguiente:
Se divide el numero entre 23 y el resto (debe estar por tanto entre 0 y 22) se sustituye por
una letra que se determina por inspeccion mediante la siguiente tabla:
Posicion 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
Letra T R W A G M Y F P D X B N J Z S Q V H L C K E

Crea un proyecto que reciba 2 datos, el numero del DNI y su letra y que valide si el DNI
introducido es valido.

Nota de ayuda: no es la unica manera de hacerlo, pero quizas la mas rapida es que segun
el resultado de la division busque en un array de caracteres la posicion que corresponda a
la letra.

El programa/proyecto puede recibir sus datos bien por parametros o bien por stream de
datos de entrada, a tu eleccion.

Dentro del proyecto se haran las siguientes validaciones
- Si alguno de los argumentos vienen vacios, el programa retornara un -1 (sin escribir
ninguna salida)
- Si el dato que se espera que sea numerico no lo es, el programa saldra con un -2
(sin escribir ninguna salida)

En cualquier otro caso el programa validara si la letra corresponde al numero y dejara en la
salida (System.out) el mensaje : “El DNI introducido es correcto” o ““El DNI introducido NO
es correcto”.

El programa saldra con 0 si se ha podido validar el DNI, tanto si la validacion ha dado
correcta como si no.

Crea un segundo programa que pida por pantalla el numero del DNI y la letra.
Una vez recogidos estos 2 datos debe llamar al programa de validacion.

Si se ha producido un error en el programa de validacion, el programa que le llama dejara
en la salida por consola una descripcion del error producido.
Si todo ha ido bien, recuperara del programa de validacion si el DNI es correcto o no lo es y
lo pintara en la salida de la consola (System.out).

*/

package examen_llamada_dni;


import java.io.File;
import java.io.OutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;

public class Llamada {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// creamos objeto File al directorio donde esta Ejemplo2
		// File directorio = new
		// File directorioWindows = new File("E:\\DOCUMENTS\\DA2D1E-2\\Programacion\\Eclipse-workspace\\016 Multiproceso\\bin");
		
		File directorioLinux = new File("/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/016 Multiproceso/bin");
		
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce los numeros del DNI: ");
			String numero = sc.nextLine();
			
			System.out.println("Introduce la letra del DNI: ");
			String letra = sc.nextLine();

			// El proceso a ejecutar es ejercicio1_lectura.Lectura 
			ProcessBuilder pb = new ProcessBuilder("java", "examen_lectura_dni.Lectura", numero, letra);

			// se establece el directorio donde se encuentra el ejecutable
			pb.directory(directorioLinux);

			// System.out.printf("Directorio de trabajo: %s%n", pb.directory());

			// se ejecuta el proceso
			Process p = pb.start();

			// nombre = nombre +"/n";
			OutputStream os = p.getOutputStream(); // get el output de Lectura.java
			os.write(numero.getBytes()); // escribir en el OutputStream de Lectura.java el string numero
			os.flush();
			os.close();

			// COMPROBACION DE ERROR
			// System.exit -> exitVal
			int exitVal = -1;
			try {
				exitVal = p.waitFor(); // le pide el valor del otro proceso cuando sale
				System.out.println("Valor de Salida: " + exitVal);
				
				switch (exitVal) {
				case 0:
					System.out.println("***DNI validado (correcta o incorrectamente)***");
					break;
				case -1:
					System.out.println("Algun parametro esta vacio");
					// argumentos vacios
					break;
				case -2:
					System.out.println("Formato no valido, introduzca un numero");
					// dato que se espera numerico no lo es
					break;
				}
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			
			// obtener la salida devuelta por el proceso si exitVal==0
			if (exitVal == 0) {
				try {
					InputStream is = p.getInputStream();
					int c;

					while ((c = is.read()) != -1)
						System.out.print((char) c);

					is.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} while (sc.nextLine() != null);

	}

}
