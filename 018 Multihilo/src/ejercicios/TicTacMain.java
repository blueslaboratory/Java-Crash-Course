package ejercicios;

public class TicTacMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// esto crearia hilos infinitos:
		/*
		do {
			Tic.main(args);
			Tac.main(args);
		} while (true);
		*/
		
		// hay que hacerlo asi
		Tac tac = new Tac("", 1);
		Tic tic = new Tic("", 1);
		
		do {
			tac.tac();
			tic.tic();
		} while(true);
	}

}
