package ejemplos027_matches;

public class Matches3 {

    public static void main(String args[]) {
        String[] cadenas = {"", "12345", "A12345", "12345B",
                                  "12345a" , "abcd" , "aa343"};
     
        for(String cadena : cadenas) {
           System.out.println("La cadena " + cadena +
             " contiene letras del alfabeto: " + cadena.matches(".*[A-Za-z].*"));
           /*
           delante o detras puede contener cualquier cosa pero tendra al menos 
           1 letra mayuscula o minuscula
           */
        }
     
       
        String[] numeros = {"1234" , "+1234", "234a", "ad"};
        for(String numero : numeros) {
           System.out.println("El numero " + numero + " contiene digitos del 1 al 9: "
               + numero.matches(".*[1-9].*"));
           /*
           delante o detras puede contener cualquier cosa pero tendra al menos 
           1 numero del 1 al 9
           */
        } 
        
        String prueba = "a";
        System.out.println(prueba.matches("[A-Z1-9]"));
        prueba = "A";
        System.out.println(prueba.matches("[A-Z1-9]"));
        //solo 1 caracter (mayus o 1-9)
        prueba = "A2";
        System.out.println(prueba.matches("[A-Z][1-9]"));
        //solo 2 caracteres (mayus o 1-9)
    }
}