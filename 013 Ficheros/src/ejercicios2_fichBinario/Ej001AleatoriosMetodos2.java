package ejercicios2_fichBinario;
import java.io.*;
import javax.swing.JOptionPane;
 
public class Ej001AleatoriosMetodos2 {
 
    public static void main(String[] args) {
 
    	// G:\DOCUMENTS\DA1D1E\Programación\Eclipse-workspace\013 Ficheros
    	// ruta no es ruta, es nombre
        String ruta=JOptionPane.showInputDialog("Escribe la ruta relativa del fichero");
        String numeros=JOptionPane.showInputDialog("Escribe el numero de numeros aleatorios");
        int numNumerosAleatorios=Integer.parseInt(numeros);
                
        
        //Abrimos el fichero desde el final
        try(DataOutputStream dos=new DataOutputStream (new FileOutputStream (ruta, true));
        	DataInputStream dis=new DataInputStream(new FileInputStream (ruta))){
 
            escribeFichero(dos, numNumerosAleatorios);
                     
            leeFichero(dis);
       
            System.out.println("Anadido al fichero " + dos.size()/(Integer.SIZE/Byte.SIZE) + " enteros");// lo nuevo, en el stream
            System.out.println("Tamano del fichero en enteros: " + (new File(ruta)).length()/(Integer.SIZE/Byte.SIZE));
            System.out.println("Tamano del fichero en bytes: " + (new File(ruta)).length());

            //System.out.println("Integer.SIZE " + Integer.SIZE);
        }catch(EOFException e){
        	// Con available no tiene que llegar aqui
            System.out.println("Fin del fichero");

        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void escribeFichero (DataOutputStream dos, int numNumerosAleatorios) throws IOException{
            //Escribimos los numeros
 
            for (int i=0;i<numNumerosAleatorios;i++){
                int numero=generaNumerosAleatorios();
                dos.writeInt(numero);
            }
 
            //Volcamos los cambios en disco
            dos.flush();
            System.out.println("Escrito fichero");
    }
 
    public static void leeFichero (DataInputStream dis) throws IOException{
            //Leemos los numeros hasta el final del fichero
            while(dis.available()>0){
                System.out.println(dis.readInt());
            }
    }
 
    public static int generaNumerosAleatorios(){
        int numero=(int)Math.floor(Math.random()*101); //N-M+1 +N
        
        return numero;
    }
 
}