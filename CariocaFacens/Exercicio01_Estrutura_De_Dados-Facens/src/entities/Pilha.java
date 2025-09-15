package entities;

public class Pilha {

	Object vetor[];
	int indice;

	public Pilha(int tamanho) {
		vetor = new Object[tamanho];
		indice = 0;
	}

	public void empilhar(Object item) {
		if (vetor.length < indice) {
			vetor[indice] = item;
			indice++;
		}
	}

	public Object desempilhar() {
		return vetor[indice - 1];
	}

	public boolean pilhaVazia() {
		if (vetor.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean pilhaCheia() {
		if (vetor.length >= indice) {
			return true;
		} else {
			return false;
		}
	}

}
