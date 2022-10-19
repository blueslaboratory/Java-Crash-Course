package ejemplos029_ficheros1_generales;

// Este ejercicio es para ejecutarlo dos veces seguidas. La primera fallar�n
// todas menos la �ltima, que crear� el �rbol de directorios. La segunda las
// dos primeras tendr�n �xito y las dos �ltimas fallar�n.
import java.io.File;

/**
 * G:\DOCUMENTS\DA1D1E\Programaci�n\Eclipse-workspace\Ejemplos
 */
public class MkDirExamples {
	public static void main(String[] args) {
		boolean status;

		// mkdir no crea la estructura de directorios si no existe, hay que crearla
		status = new File("primero/segundo/tercero").mkdir();
		impError(status);

		status = new File("primero/segundo/cuarto").mkdir();
		impError(status);

		// mkdir no crea la estructura de directorios si no existe, hay que crearla
		status = new File("primero/segundo/quinto/sexto/septimo").mkdir();
		impError(status);

		// mkdirs crea la estructura de directorios aunque no exista
		status = new File("primero/segundo/quinto/sexto/septimo").mkdirs();
		impError(status);
		
	}

	static void impError(boolean b) {
		System.out.println(b ? "exito" : "fallo");
	}
}