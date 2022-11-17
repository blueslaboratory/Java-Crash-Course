package tictac;

public class TicTacMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// hay que hacerlo asi
		Tac tac = new Tac("", 1);
		Tic tic = new Tic("", 1);
		
		
		// Esto crearia hilos de forma secuencial
		
		do {
			tac.tac();
			tic.tic();
		} while(true);		
		
		/*
		do {
			tac.run();
			tic.run();
		} while(true);
		*/

		
		
		// Esto crearia hilos de forma simultanea
		// inicializar los hilos siempre con start()
		/*
		do {
			tac.start();
			tic.start();
		} while(true);
		*/
		
		
		
		// esto crearia hilos infinitos:
		/*
		do {
			Tic.main(args);
			Tac.main(args);
		} while (true);
		*/
	}

}
