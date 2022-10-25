package ejemplos037_multihilos2;

public class Hilo extends Thread {

    
    // constructor por defecto
    public Hilo() {
        //hereda la prioridad del hilo padre
    }

    
    //constructor personalizado
    public Hilo(int prioridad) {
        //establece la prioridad indicada
        this.setPriority(prioridad);
    }

    
    // ejecuta una tarea pesada
    @Override
    public void run() {

        //cadena
        String strCadena = "";

        //agrega 20000 caracteres a una cadena vacia
        for (int i = 0; i < 20000; ++i) {
            //imprime el valor en la Salida
            strCadena += "A";
            this.yield();
            
			// La tarea consiste en cada hilo en realidad
			// solo tiene que anadir 20.000 veces una
			// letra a una variable. Pero despuss de
			// anadir cada letra, “devuelve el control” al
			// planificador para que determine que hilo
			// debe entrar al proceso.
            
            //yield() sugiere al planficador Java que puede seleccionar otro hilo,
           
        }

        System.out.println("Hilo de prioridad " + this.getPriority()
                + " termina ahora");
    }
}