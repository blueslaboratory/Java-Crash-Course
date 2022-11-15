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
            
			// La tarea consiste en que en cada hilo en realidad
			// solo tiene que anadir 20.000 veces una
			// letra a una variable. Pero despues de
			// anadir cada letra, “devuelve el control” al
			// planificador para que determine que hilo
			// debe entrar al proceso.
            
            // yield() sugiere al planficador Java que puede seleccionar otro hilo,

            // yield() hace que un hilo que esta "ejecutandose" pase a "preparado" 
            // para permitir que otros hilos de la misma prioridad puedan ejecutarse.
            
            // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Thread.html#yield()
            // A hint to the scheduler that the current thread is willing to yield 
            // its current use of a processor. The scheduler is free to ignore this 
            // hint. 
           
        }

        System.out.println("Hilo de prioridad " +this.getPriority() +" termina ahora");
    }
}