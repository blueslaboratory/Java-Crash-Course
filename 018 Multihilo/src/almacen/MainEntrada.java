/*
En unos grandes almacenes hay 300 clientes agolpados en la puerta para
intentar conseguir un producto del cual solo hay 100 unidades.

Por la puerta solo cabe una persona, pero la paciencia de los clientes es
limitada por lo que solo se haran un maximo de 10 intentos para entrar
por la puerta. Cada intento de entrada lo hara con una espera de entre 1 y
100 milesimas de tiempo.

Si despues de 10 intentos la puerta no se ha encontrado libre ni una sola
vez, el cliente desiste y se marcha.

Cuando se consigue entrar por la puerta el cliente puede encontrarse con
dos situaciones:

1. Quedan productos: el cliente cogera uno y se marchara.
2. No quedan productos: el cliente simplemente se marchara
*/

package almacen;

public class MainEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int unidades = 100;
		int clientes = 300;
		Almacen almacen = new Almacen (unidades);
		Cliente cliente[] = new Cliente[clientes]; 
		
		
		for(int i=0; i<clientes; i++ ) {			
			cliente[i] = new Cliente (i,  almacen);
			cliente[i].start();
		}
			
	}
}