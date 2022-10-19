package ejercicios2_fichBinario;
import javax.swing.JOptionPane;

import java.io.*;
 
public class Ej002VehiculosMetodos2 {
 
    public static void main(String[] args) {
 
        final String RUTA="vehiculos.dat";
        
        String matricula=JOptionPane.showInputDialog("Introduce la matricula");
        String marca=JOptionPane.showInputDialog("Introduce la marca");
        String texto=JOptionPane.showInputDialog("Introduce el tamano del deposito");
        double deposito=Double.parseDouble(texto);
        String modelo=JOptionPane.showInputDialog("Introduce el modelo");
        
        try (DataOutputStream dos=new DataOutputStream(new FileOutputStream(RUTA,true));
        	 DataInputStream dis=new DataInputStream(new FileInputStream(RUTA))){
        	//try con recursos, no hace falta cerrarlo en el finally, cierre automatico
        	
            introduceDatos(dos, matricula, marca, deposito, modelo);
            muestraDatos(dis);
            
//      } catch(EOFException e) {
//       	//ya no salta
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
 
    }
 
    public static void introduceDatos(DataOutputStream dos,
                                      String matricula,
                                      String marca,
                                      double deposito,
                                      String modelo) throws IOException{
 
        dos.writeUTF(matricula);
        dos.writeUTF(marca);
        dos.writeDouble(deposito);
        dos.writeUTF(modelo); 
    }
 
    public static void muestraDatos(DataInputStream dis) throws IOException {
 
        //Cuando se acabe el fichero saltara la excepcion
        while(dis.available()>0){
        	JOptionPane.showMessageDialog(null, ""
            		+ "El vehiculo tiene una matricula: "+dis.readUTF()
            		+ "\nSu marca es: "+dis.readUTF()
            		+ "\nEl tamano del deposito es de: "+dis.readDouble() +" litros"
   					+ "\nSu modelo es: " +dis.readUTF());
        }
    }
 
}