package ejemplos026_excepciones4;
/*
import excepcion.*;
ExcepcionIntervalo estaba en otro paquete, pero yo las he metido juntas
habria que importarlo como si fuese en un .jar por ejemplo
es importante acordarse de esto
*/

public class ExcepcionApp3 {
    public static void main(String[] args) {
        String str1="101";
	    String str2="0";
        String respuesta;
	    int cociente;
	    
        try{
            cociente=calcular(str1, str2);
            respuesta=String.valueOf(cociente);
        }catch(NumberFormatException ex){
            respuesta="Se han introducido caracteres no numericos";
        }catch(ArithmeticException ex){
            respuesta="Division entre cero";
        }catch(ExcepcionIntervalo ex){
            respuesta=ex.getMessage();
        }catch(Exception ex){
        	respuesta=ex.getMessage();	
        }
        
        System.out.println(respuesta);

        try  {
			//espera la pulsacion de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
    
    // NumberFormatException, ArithmeticException no son obligatorias
    // Capturandolas por separado:
/*    
   	static int calcular(String str1, String str2) throws ExcepcionIntervalo, NumberFormatException, ArithmeticException{
        int num=Integer.parseInt(str1);
        int den=Integer.parseInt(str2);
        if((num>100)||(den<-5)){
            throw new ExcepcionIntervalo("Numeros fuera del intervalo");
        }
        return (num/den);
    }
*/    
    // Se puede hacer como arriba o asi:
    static int calcular(String str1, String str2) throws Exception {
    	//pone que se lanza una excepcion generica pero se distinguen los 
    	//distintos tipos de casos
        int num=Integer.parseInt(str1);
        int den=Integer.parseInt(str2);
        if((num>100)||(den<-5)){
            throw new ExcepcionIntervalo("Numeros fuera del intervalo");
        }
        return (num/den);
    }
}