package ejemplos041_URL;

import java.net.*;
import java.io.*;

public class Ejemplo1URLConnection {
	
	public static void main(String[] args) {
		
		URL url = null;
		URLConnection urlConnection = null;
		
		try {
			
			url = new URL("https://www.iesclaradelrey.es");
			urlConnection = url.openConnection();

			BufferedReader in;
			InputStream inputStream = urlConnection.getInputStream();
			in = new BufferedReader(new InputStreamReader(inputStream));
			String inputLine;
			
			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);

			in.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}