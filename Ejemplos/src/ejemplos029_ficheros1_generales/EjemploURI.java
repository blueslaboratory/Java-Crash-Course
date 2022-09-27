package ejemplos029_ficheros1_generales;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class EjemploURI {

	public static void main(String[] args) {
		File aFile;
		try {
			aFile = new File(new URI("file:///c://a.bat"));
			//aFile = new File("https:////elpais.com");
			System.out.println(aFile.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
