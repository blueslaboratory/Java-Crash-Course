package ejemplos026_excepciones4;

/*
import excepcion.*;

ExcepcionIntervalo estaba en otro paquete, pero yo las he metido juntas
habria que importarlo como si fuese en un .jar por ejemplo
es importante acordarse de esto
En ExcepcionIntervalo.java
File -> Exportar -> Java (Jar File) -> Marcamos el archivo -> Lo guardamos
En el proyecto proyecto en el que lo voy a utilizar:
Project -> Properties -> Java Build Path -> Edit
*/

public class ExcepcionApp2 {
	public static void main(String[] args) {
        String str1="101";// Si pongo "1a2" no saltaria nuestra excepcion, sino NumberFormatException
	    String str2="0";
        String respuesta;
	    int numerador, denominador, cociente;
        
        try{
            numerador=Integer.parseInt(str1);
            denominador=Integer.parseInt(str2);
            // Introducimos una funcion nueva respecto al anterior
            rango(numerador, denominador);
            cociente=numerador/denominador;
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
        
        // Hemos puesto una excepcion mas (ExcepcionIntervalo) que el caso anterior
        System.out.println(respuesta);
    }
    
	//o bien la tratamos o la lanzamos
    static void rango(int num, int den) throws ExcepcionIntervalo{
        if((den<-5)||(num>100)){
            throw new ExcepcionIntervalo("Numeros fuera del intervalo");
        }
    }
}
