package ejemplos032_ficherosNIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeerFicheroTexto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "yes.txt";
		String s = null;
		
		try {
			s = Files.readString(Paths.get(fileName), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s);
	}

}
