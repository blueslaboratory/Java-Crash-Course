package partida;

import java.io.Serializable;

public class Partida implements Serializable {

	private static final long serialVersionUID = 5163743303073760010L;
	
	String parImpar;
	int numCliente;
	public int numServidor;
	public int ganadasCliente;
	public int ganadasServidor;
	int ultimoGanador; 
	public boolean partidaFinalizada;
	
	
	// CONSTRUCTORES
	public Partida() {
		super();
		this.parImpar = "impar";
		this.numCliente = 0;
		this.numServidor = 0;
		this.ganadasCliente = 0;
		this.ganadasServidor = 0;
		this.partidaFinalizada = false;
	}
	public Partida(String parImpar, int num) {
		super();
		this.parImpar = parImpar;
		this.numCliente = 0;
		this.numServidor = 0;
		this.ganadasCliente = 0;
		this.ganadasServidor = 0;
		this.partidaFinalizada = false;
	}
	
	
	// GETTERS Y SETTERS
	public String getParImpar() {
		return parImpar;
	}
	public void setParImpar(String parImpar) {
		this.parImpar = parImpar.toLowerCase();
	}

	public int getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(int num) {
		this.numCliente = num;
	}

	public int getNumServidor() {
		return numServidor;
	}
	public void setNumServidor(int numServidor) {
		this.numServidor = numServidor;
	}

	public int getGanadasCliente() {
		return ganadasCliente;
	}
	public void setGanadasCliente() {
		this.ganadasCliente++;
	}

	public int getGanadasServidor() {
		return ganadasServidor;
	}
	public void setGanadasServidor() {
		this.ganadasServidor++;
	}

	public boolean isPartidaFinalizada() {
		return partidaFinalizada;
	}
	public void setPartidaFinalizada(boolean partidaFinalizada) {
		this.partidaFinalizada = partidaFinalizada;
	}

	public void setGanadasCliente(int ganadasCliente) {
		this.ganadasCliente = ganadasCliente;
	}
	public void setGanadasServidor(int ganadasServidor) {
		this.ganadasServidor = ganadasServidor;
	}	
	
}
