package f;

public class At06_Pilha {
	private Nodo topo;
	private int tamanho = 0;
	private int limite = 0;
	
	public At06_Pilha(int limite) {
		this.limite=limite;
	}
	public int getTopo() {
		return topo.getDado();
	}
	public boolean estaVazio() {
		return tamanho == 0;
	}
	public boolean temEspaco() {
		return limite > tamanho;
	}

	public void inserir(int dado) {
		if(temEspaco()) {
			Nodo novo = new Nodo(dado);
			novo.setProx(topo);
			topo = novo;
			tamanho++;
		}else {
			System.out.println("Pilha cheia!!!");
		}
	}

	public void remover() {
		if(!estaVazio()) {
			System.out.println(topo.getDado()+" foi retirado da pilha!");
			topo = topo.getProx();
			tamanho--;
		}else {
			System.out.println("Pilha está vazia!");
		}
	}
	

}