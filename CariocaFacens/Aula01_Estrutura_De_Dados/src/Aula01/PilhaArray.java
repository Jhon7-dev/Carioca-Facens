package Aula01;

public class PilhaArray {
	Object vetor[];
	int indice;
	
	public PilhaArray(int tamanho) {
		vetor = new Object [tamanho];
		indice = 0;
	}
  // Método para Empilhar um objeto
	public void empilhar(Object item) {
		if(vetor.length < indice) {
			vetor[indice] = item;
			indice++;
		}
	}
	public Object desemplihar() {
		return vetor[indice - 1];
	}
}
