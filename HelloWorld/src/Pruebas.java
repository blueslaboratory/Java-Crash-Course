public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(operacion("1+2+3+4"));
		System.out.println(1+2+3+4);
	}

	
	
	// validar 1 numero con solo 1 .
    // validar 2 numero con solo 1 .
    // proceder a la operacion
    public static String operacion(String mytvOperation){
        char simbolo=' ';
        String cadOperacion;
        String solucion="";

        String n1=null;
        String n2=null;
        Double resultado=0.0;
        int posicion=0;

        // coger el string de la cadena operacion
        cadOperacion = mytvOperation.toString();

        // coger el numero1 y el simbolo
        for(int i=posicion; i<cadOperacion.length(); i++) {
            char c = cadOperacion.charAt(i);
            if(checkNumber(c)) {
                // Si es un numero, lo agregas a una variable temporal
                if(n1 == null) {
                    n1 = Character.toString(c);
                } else {
                    n1 += c;
                }
            } 
            else if(checkSymbol(c)) {
                // Si es un simbolo, lo guardas en la variable simbolo
                simbolo = c;
                posicion = i+1;
                
                // saliendo del bucle
                i = cadOperacion.length();
            }
        }


        // coger el numero2 y el simbolo
        for(int i=posicion; i<cadOperacion.length(); i++) {
            char c = cadOperacion.charAt(i);
            if(checkNumber(c)) {
                // Si es un numero, lo agregas a una variable temporal
                if(n2 == null) {
                    n2 = Character.toString(c);
                } else {
                    n2 += c;
                }
            } else if(checkSymbol(c)) {
                // Si es un simbolo, lo guardas en la variable simbolo
                simbolo = c;
            }
        }


        // realizar la operacion
        switch(simbolo) {
            case '+':
                resultado = Double.parseDouble(n1) + Double.parseDouble(n2);
                break;
            case '-':
                resultado = Double.parseDouble(n1) - Double.parseDouble(n2);
                break;
            case '*':
                resultado = Double.parseDouble(n1) * Double.parseDouble(n2);
                break;
            case '/':
                resultado = Double.parseDouble(n1) / Double.parseDouble(n2);
                break;
        }


        solucion = resultado.toString();

        return solucion;
    }
    
    
    public static boolean checkNumber(char c){
        boolean flag = false;
        
        if(c=='1' || c=='2' || c=='3' ||
           c=='4' || c=='5' || c=='6' ||
           c=='7' || c=='8' || c=='9' ||
           c=='0'){
            flag = true;
        }

        return flag;
    }


    public static boolean checkSymbol(char c){
        boolean flag = false;

        if(c=='+'|| c=='-' || c=='*' || c=='/' || c=='='){
            flag = true;
        }

        return flag;
    }


    public static boolean checkPoint(String number){
        boolean flag=false;

        for(int i=0; i<number.length(); i++) {
            if(number.charAt(i)=='.'){
                flag = true;
            }
        }

        return flag;
    }

}
