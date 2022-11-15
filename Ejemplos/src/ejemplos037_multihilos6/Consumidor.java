package ejemplos037_multihilos6;

public class Consumidor extends Thread {
    
	private Cola cola;
    private int n;

    
    // CONSTRUCTOR
    public Consumidor(Cola c, int n) {
        this.cola = c;
        this.n = n;
    }

    
    public void run() {
        
    	int valor = 0;
        
        for (int i = 0; i < 5; i++) {
        	
        	//recoge el numero:
            valor = cola.get(); 
            
            System.out.println("Iteracion:" +i + " => Consumidor\t nº" + n + ", consume: " + valor);
            
            // El consumidor va mas rapido que el productor  
            try {
            	sleep(300);
            } catch (InterruptedException e) { }
            
        }
    }
}