package f;

import java.util.Scanner;

public class At06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite sua entrada.");
		String palavra = input.next();
		
		char[] w = new char[palavra.length()];
		//int tamanho = palavra.length();
		At06_Pilha pilha = new At06_Pilha(palavra.length());
		//char[] pilha = new char[tamanho];
		char[] arrayfinal = new char[palavra.length()*2];
		
		System.out.print("Palavra: ");
		for(int i = 0; i < palavra.length(); i++) {
			w[i] = palavra.charAt(i);
			arrayfinal[i]= palavra.charAt(i);
			pilha.inserir(w[i]);
			System.out.print(arrayfinal[i]);
		}
/*
		System.out.print("\nPilha: ");
		for(int i = 0; i < palavra.length(); i++) {
			tamanho--;
			pilha[i] = w[tamanho];
			arrayfinal[i+palavra.length()]= w[tamanho];
			System.out.print(pilha[i]);
		}
		tamanho = palavra.length();
		*/
		System.out.print("\nMontando palavra final: ");
		for(int i = 0; i < palavra.length()*2; i++) {
			System.out.print(arrayfinal[i]);
			
		}
		input.close();
		
	}

}
