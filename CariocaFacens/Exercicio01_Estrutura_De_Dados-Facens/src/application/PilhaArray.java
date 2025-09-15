package application;

import entities.Pilha;

public class PilhaArray {

	public static void main(String[] args) {

		Pilha minhaPilha = new Pilha(10);

		if (minhaPilha.pilhaVazia())
			System.out.println("A pilha está vazia");
		if (minhaPilha.pilhaCheia())
			System.out.println("A pilha está cheia");

		minhaPilha.empilhar("J");
		minhaPilha.empilhar("O");
		minhaPilha.empilhar("Ã");
		minhaPilha.empilhar("O");
		minhaPilha.empilhar("");
		minhaPilha.empilhar("V");
		minhaPilha.empilhar("I");
		minhaPilha.empilhar("C");
		minhaPilha.empilhar("T");
		minhaPilha.empilhar("O");
		minhaPilha.empilhar("R");

		for (int i = 0; i < 10; i++) {
			System.out.println(minhaPilha.desempilhar());
		}
		if(minhaPilha.pilhaVazia())
			System.out.println("A pilha está vazia!");
			if(minhaPilha.pilhaCheia())
			System.out.println("A pilha está cheia!");
	}

}
