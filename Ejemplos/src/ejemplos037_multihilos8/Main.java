// Esto ya no entra en el primer examen

package ejemplos037_multihilos8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    /**************************************************************************
     * ejecuta 30 veces la tarea NumerosAleatorios que imprime diez numeros
     * aleatorios menores que cincuenta, mediante un pool de tan sólo dos hilos
     * 
     */
    public static void main(String[] args) {
        
        //define un pool fijo de dos hilos
        ExecutorService executor = Executors.newFixedThreadPool(2);

        //pasa 30 tareas NumerosAleatorios al pool de 2 hilos
        for (int i = 1; i <= 30; i++) {
            executor.submit(new NumerosAleatorios());
        }

        //ordena la destruccion de los dos hilos del pool cuando hayan
        //completado todas las tareas
        executor.shutdown();
    }
    
}