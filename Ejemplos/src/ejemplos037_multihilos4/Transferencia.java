package ejemplos037_multihilos4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Transferencia extends Thread {

	Saldo miSaldoCuenta;
	Double saldoAcumulado = (double) 0;

	public Transferencia(Saldo miSaldo) {
		this.miSaldoCuenta = miSaldo;
	}

	@Override
	public void run() {
		Double transferencia = (double) 0;
		do {
			// veo cual es la siguiente transferencia que toca
			transferencia = this.miSaldoCuenta.getTransferencia();
			// Si devuelvo -1, hemos acabado el bucle
			if (transferencia < 0) {
				break;
			}
			// Si tenemos saldo suficiente, hacemos la transferencia y acumulamos el saldo
			// del hilo
			this.miSaldoCuenta.hacerTransferencia(transferencia);
			if (this.miSaldoCuenta.getSaldo() > transferencia) {
				this.saldoAcumulado = this.saldoAcumulado + transferencia;
			}
		} while (!this.miSaldoCuenta.FicAcabado);
		System.out.println("En este hilo: " + this.getName() 
						+ " ha hecho transferencias por valor de: " + this.saldoAcumulado + " €.");
		// Mostramos el saldo en cuenta
		System.out.println("Quedan " + this.miSaldoCuenta.getSaldo() + " € en la cuenta");
		return;
	}
}
