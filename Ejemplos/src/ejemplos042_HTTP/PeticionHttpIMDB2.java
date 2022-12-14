package ejemplos042_HTTP;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.util.Scanner;


public class PeticionHttpIMDB2 {

	public static void main(String[] args) throws Exception {

		String url = "https://www.imdb.com/find?q=";
		Scanner sc = new Scanner(System.in);

		// si pones una pelicula con varias palabras hay que anadir un +
		// ejemplo: the+shawshank+redemption
		System.out.println("Que pelicula quieres buscar?");

		// entrada de una cadena
		String recurso = sc.nextLine();

		PeticionHttpIMDB2 miPeticion = new PeticionHttpIMDB2();
		String ruta = "/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/txts/" + recurso + ".html";
		try {
			Integer resultado = miPeticion.almacenarPagina(url, recurso, ruta);

			System.out.println("descarga finalizada");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int almacenarPagina(String url, String recurso, String path) throws Exception {

		String direccion = url + recurso;

		HttpClient myHttp = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1)
							.followRedirects(HttpClient.Redirect.NORMAL).build();

		HttpRequest myRequest = HttpRequest.newBuilder().GET().uri(URI.create(direccion))
								.headers("Content-Type", "Text/plain").setHeader("User-Agent", "Chrome").build();

		HttpResponse<Path> myResponse = myHttp.send(myRequest, HttpResponse.BodyHandlers.ofFile(Path.of(path)));

		return myResponse.statusCode();
	}
}
