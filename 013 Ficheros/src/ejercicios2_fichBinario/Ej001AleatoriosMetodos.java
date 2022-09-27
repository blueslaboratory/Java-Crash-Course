package ejercicios2_fichBinario;
import java.io.*;
import javax.swing.JOptionPane;
 
public class Ej001AleatoriosMetodos {
 
    public static void main(String[] args) {
    	
    	// G:\DOCUMENTS\DA1D1E\Programaci�n\Eclipse-workspace\013 Ficheros
    	// ruta no es ruta, es nombre
        String ruta=JOptionPane.showInputDialog("Escribe la ruta relativa del fichero");
        String numeros=JOptionPane.showInputDialog("Escribe el numero de numeros aleatorios");
        int numNumerosAleatorios=Integer.parseInt(numeros);
        DataOutputStream dos=null;
        DataInputStream dis=null;
        
        //Abrimos el fichero desde el final
        try{
			dos=new DataOutputStream (new FileOutputStream (ruta, true));
            dis=new DataInputStream(new FileInputStream (ruta));
 
            escribeFichero(dos, numNumerosAleatorios);
            leeFichero(dis);
 
        }catch(EOFException e){
            System.out.println("Fin del fichero");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
        finally{
        	try{
        		dos.close();
                dis.close();
        	}
        	catch(IOException e){       	
        		System.out.println("No se han cerrado los ficheros");
        	}
        }   
    }
    
	public static void escribeFichero(DataOutputStream dos, int numNumerosAleatorios) throws IOException {

		// Escribimos los numeros

		for (int i = 0; i < numNumerosAleatorios; i++) {
			int numero = generaNumerosAleatorios();
			dos.writeInt(numero);
		}

		// Volcamos los cambios en disco, no cerramos el fichero
		dos.flush();
		System.out.println("Escrito fichero");

	}

	public static void leeFichero(DataInputStream dis) throws IOException {
		// Leemos los numeros hasta el final del fichero
		while (true) {
			System.out.println(dis.readInt());
		}
	}

	public static int generaNumerosAleatorios() {
		int numero = (int) Math.floor(Math.random() * 101);

		return numero;
	}
 
}