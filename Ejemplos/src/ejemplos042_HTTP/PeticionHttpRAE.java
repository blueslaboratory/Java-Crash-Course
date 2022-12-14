package ejemplos042_HTTP;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class PeticionHttpRAE {


	public static void main(String[] args) {

		String url = "https://www.rae.es/drae2001/";
		Scanner sc = new Scanner(System.in);

		System.out.println("Que palabra quieres buscar?");

		// entrada de una cadena
		String recurso = sc.nextLine();

		PeticionHttpRAE miPeticion = new PeticionHttpRAE();

		String direccion = url + recurso;

		StringBuilder resultado;
		try {
			resultado = miPeticion.getContenido(direccion);
			String ruta = "/media/alejandro/MSI DATA/DOCUMENTS/DA2D1E-2/Programacion/Eclipse-workspace/txts/" + recurso + ".html";
			miPeticion.escribirFichero(ruta, resultado.toString());

			System.out.println("descarga finalizada");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public StringBuilder getContenido(String direccion) throws IOException {
		StringBuilder respuesta = new StringBuilder();

		URL url = new URL(direccion);

		HttpURLConnection conexion;
		conexion = (HttpURLConnection) url.openConnection();
		conexion.setRequestMethod("GET");
		conexion.setRequestProperty("Content-Type", "Text/plain");
		conexion.setRequestProperty("charset", "utf-8");
		conexion.setRequestProperty("User-Agent", "Chrome");

		int estado = conexion.getResponseCode();
		Reader streamReader;
		
		if (estado == HttpURLConnection.HTTP_OK) {
			streamReader = new InputStreamReader(conexion.getInputStream());
			int caracter;
			while ((caracter = streamReader.read()) != -1) {
				respuesta.append((char) caracter);
			}
		} else {
			System.out.println("Error Http " + estado);
		}
		conexion.disconnect();

		return respuesta;
	}

	public static void escribirFichero(String path, String contenido) {
		Path mipath = Paths.get(path);
		byte[] miBytes = contenido.getBytes();
		
		try {
			Files.write(mipath, miBytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}
