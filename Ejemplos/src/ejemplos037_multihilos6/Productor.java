package ejemplos037_multihilos6;

public class Productor extends Thread {
    
	private Cola cola;
    private int n;

    
    // CONSTRUCTOR
    public Productor(Cola c, int n) {
        this.cola = c;
        this.n = n;
    }
    
    
    public void run() {
    	
        for (int i = 0; i < 5; i++) {
        	
        	//pone el numero:
            cola.put(i);
            
            System.out.println("Iteracion:" +i + " => Productor\t nº" + n + ", produce: " + i);
            
            // El productor va mas despacio que el consumidor
            try {
                sleep(1000);
            } catch (InterruptedException e) { }			
			
        }
        
    }
}