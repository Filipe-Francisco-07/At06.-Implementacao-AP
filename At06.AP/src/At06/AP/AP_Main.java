package At06.AP;
import java.util.Scanner;

public class AP_Main {

	public static void main(String[] args) {
		//L = {wXwr  | w pertence a {a|b}* e wr é w invertido}

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua cadeia: ");
		String cadeia = input.next();
		
		Pilha pilha = new Pilha(cadeia.length());
		char[] w = new char[cadeia.length()];
		char[] arrayfinal = new char[cadeia.length()*2];
		int count = 0;
		boolean f = false;
		
		System.out.println("Empilhando... ");
		for(int i = 0; i < cadeia.length(); i++) {
			count++;
			w[i] = cadeia.charAt(i);
			arrayfinal[i]= cadeia.charAt(i);
			pilha.inserir(w[i]);
			
			if(w[i] != 'a' && w[i] != 'b') {
				System.out.println("Palavra fora do alfabeto, encerrando programa.");
				f = true;
				break;
			}
		}
		if(!f) {
			
		System.out.println("Desempilhando... ");
		for(int i = cadeia.length(); i < (cadeia.length()+count); i++) {
			arrayfinal[i]= pilha.desempilhar();
			if(arrayfinal[i] == 'z') {
				System.out.println("Pilha vazia. ");
			}
		}
		
		System.out.println("Palavra final: ");
		for(int i = 0; i < cadeia.length()*2; i++) {
			System.out.print(arrayfinal[i]);
		}
	}
		
		input.close();
	}

}
