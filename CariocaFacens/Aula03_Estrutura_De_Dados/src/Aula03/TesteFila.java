package Aula03;

public class TesteFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila minhaFila = new Fila();
		
		if(minhaFila.tamanho() == 0);
		System.out.println("Tamanho igual a zero! ok");
		
		System.out.println("Erro! tamanho diferente");
		
		minhaFila.remove();
		minhaFila.exibirInicio();
		
		minhaFila.adicionar("J");
		minhaFila.adicionar("o");
		minhaFila.adicionar("ã");
		minhaFila.adicionar("o");
		minhaFila.adicionar("V");
		minhaFila.adicionar("i");
		minhaFila.adicionar("c");
		minhaFila.adicionar("t");
		minhaFila.adicionar("o");
		minhaFila.adicionar("r");
		
		if(minhaFila.tamanho() == 11);
			System.out.println("Tamanho ok!");
		while(minhaFila.tamanho()>0);
		System.out.println(minhaFila.remove());
		minhaFila.exibirInicio();
	}


}
