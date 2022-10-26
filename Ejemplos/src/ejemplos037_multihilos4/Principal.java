package ejemplos037_multihilos4;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Paso 1 - Eejcutamos el proyecto que genera el fichero de transferencias
		// creamos objeto File al directorio donde esta Ejemplos
		// String ruta_directorio = "C:\\Users\\jhorn\\eclipse-workspace\\UT3\\UT3_5_1_EscribeFichero\\bin";
		String ruta_directorio = "/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/Ejemplos/bin";
		File directorio = new File(ruta_directorio);

		// El proceso a ejecutar es Ejemplo2
		ProcessBuilder pb = new ProcessBuilder("java", "ejemplos037_multihilos3.EscribeFichero");

		// se establece el directorio donde se encuentra el ejecutable
		pb.directory(directorio);

		// se ejecuta el proceso
		Process p = pb.start();
		
		// COMPROBACION DE ERROR - 
		//	 0 bien 
		//	 1 mal
		
		int exitVal = -1;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (exitVal == 0) {
			int j = 3; // numero de hilos

			// String ruta_mifichero = "C:\\julio\\transferencias.txt";
			String ruta_mifichero ="/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/txts/transferencias.txt";
			
			File mifichero = new File(ruta_mifichero);
			Saldo misaldo = new Saldo(mifichero);
			Transferencia hilo[] = new Transferencia[j];
			Contador contador = new Contador();

			// Creamos objetos en cada posicion
			for (int i = 0; i < j; i++) {
				hilo[i] = new Transferencia(misaldo);
				hilo[i].start();
			}
			contador.start();

			while (!misaldo.FicAcabado) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException exc) {
					System.out.println("Hilo principal interrumpido.");
				}
			}

			contador.interrupt();

			System.out.println("Fin del proceso.");
		}
	}
}
