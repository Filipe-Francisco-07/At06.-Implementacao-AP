package At06.AP;

public class Pilha {
	private Nodo topo;
	private int tamanho = 0;
	private int limite = 0;
	
	public Pilha(int limite) {
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

	public void inserir(char dado) {	
		if(temEspaco()) {
			Nodo novo = new Nodo(dado);
			novo.setProx(topo);
			topo = novo;
			tamanho++;
			System.out.println(topo.getDado()+" foi adicionado ao topo da pilha!");
		}else {
			System.out.println("Pilha cheia!!!");
		}
	}

	public char desempilhar() {
		if(!estaVazio()) {
			System.out.println(topo.getDado()+" foi retirado da pilha!");
			char a = topo.getDado();
			topo = topo.getProx();
			tamanho--;
			return a;
		}else {
			System.out.println("Pilha está vazia!");
			return 'z';
		}
	}
	

}