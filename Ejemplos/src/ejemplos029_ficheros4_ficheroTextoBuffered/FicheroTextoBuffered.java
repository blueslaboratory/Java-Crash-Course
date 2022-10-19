package ejemplos029_ficheros4_ficheroTextoBuffered;


import java.io.*; //Importamos todas las clases de java.io.

public class FicheroTextoBuffered {
    public static void main(String[] args) {
    	BufferedReader br=null;
    	BufferedWriter bw=null;
    	
        try {       	
        	// Escribir
            bw=new BufferedWriter(new FileWriter("C:\\Users\\W10Alex\\Desktop\\fichero1.txt"));

            //Escribimos en el fichero
            bw.write("Esto es una prueba usando Buffered");
            bw.newLine();
            bw.write("Seguimos usando Buffered");
            //Guardamos los cambios del fichero
            bw.flush();
            //flush: lo que quede por guardar del fichero en el buffer lo guarda en el buffer
            //sin el flush el br no te encontraria nada

        	// Leer
            br=new BufferedReader(new FileReader("C:\\Users\\W10Alex\\Desktop\\fichero1.txt"));
            
            //Leemos el fichero y lo mostramos por pantalla
            String linea=br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=br.readLine();
            }
        } catch(IOException e){
            System.out.println("Error E/S: "+e);
        } finally{
        	try{
        		if (br != null) br.close();
        		if (bw != null) bw.close();
        	}
        	catch(IOException e){
                System.out.println("Error E/S: "+e);
            }
        }
    }
}