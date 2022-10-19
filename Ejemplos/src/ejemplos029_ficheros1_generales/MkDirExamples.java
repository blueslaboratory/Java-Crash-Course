package ejemplos029_ficheros1_generales;

// Este ejercicio es para ejecutarlo dos veces seguidas. La primera fallarï¿½n
// todas menos la ï¿½ltima, que crearï¿½ el ï¿½rbol de directorios. La segunda las
// dos primeras tendrï¿½n ï¿½xito y las dos ï¿½ltimas fallarï¿½n.
import java.io.File;

/**
 * G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\Ejemplos
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