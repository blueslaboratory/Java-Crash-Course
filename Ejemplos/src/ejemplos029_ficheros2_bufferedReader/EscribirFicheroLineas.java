package ejemplos029_ficheros2_bufferedReader;

import java.io.*;
import java.time.LocalDate;
public class EscribirFicheroLineas {
     
    public static void main(String[] args) {
    	final String NOMFICH="test.txt";
        try {
	        //FileWriter connection = new FileWriter(NOMFICH); // crea uno nuevo
	        FileWriter connection = new FileWriter(NOMFICH, true); // continua
	        PrintWriter file = new PrintWriter(connection);
	        
	        file.println(LocalDate.now());
	        file.println("Hola"); 
	        file.println("Hola");
	        file.close();
	        
	        writeAgain(NOMFICH);
        }
         
        catch (IOException e) {
            System.out.println("IOException");
        }
                
    }
          
    public static void writeAgain(String nomfich) throws IOException {
        FileWriter connection = new FileWriter(nomfich, true);
        BufferedWriter file = new BufferedWriter(connection);
        file.write("Adios");
        file.newLine();
        file.write("Adios");
        file.newLine();
        file.close();
    }
     
}