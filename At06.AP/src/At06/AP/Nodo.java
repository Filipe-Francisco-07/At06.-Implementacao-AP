package At06.AP;

public class Nodo {
	private char dado;
	private Nodo Prox;
	
	public Nodo(char dado) {
		this.dado = dado;
		this.Prox = null;
	}
	
	public char getDado() {
		return dado;
	}
	public void setDado(char dado) {
		this.dado = dado;
	}
	public Nodo getProx() {
		return Prox;
	}
	public void setProx(Nodo prox) {
		Prox = prox;
	}
	
}