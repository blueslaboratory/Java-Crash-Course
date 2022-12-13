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

package examen_lectura_dni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lectura {

	public final static char[] LETRAS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F',
								  		 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
								  		 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// String numeroCompleto = br.readLine();

		System.out.println("Numero: " + args[0]);
		System.out.println("Letra: " + args[1]);

		
		// algun parametro esta vacio
		if (args[0].length() == 0 || args[1].length() == 0) {
			System.out.println("Algun parametro esta vacio");
			System.exit(-1);
		}

		
		// Formato no numerico
		try {
			int DNInum = Integer.parseInt(args[0]);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Formato no valido, introduzca un numero");
			System.exit(-2);
		}
		
		
		// Validando el DNI
		boolean validado = validar(Integer.parseInt(args[0]), args[1]);
		System.out.println("DNI validado correctamente: " +validado);
		System.exit(0);
		

	}
	
	public static boolean validar(int num, String letra) {
		
		// falso hasta que se demuestre lo contrario
		boolean flag = false;
		int resto = num%23;
		
		// numero entre [0,22], la letra coincide con la pos del array
		if(resto>=0 && resto<=22 && letra.charAt(0)==LETRAS[resto]) {		
			flag = true;
		}
		
		return flag;
		
	}
}