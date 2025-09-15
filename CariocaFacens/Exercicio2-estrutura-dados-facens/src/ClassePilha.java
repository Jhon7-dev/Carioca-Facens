import java.util.ArrayList;
import java.util.List;

public class ClassePilha {
	List itens = new ArrayList();

	public ClassePilha() {

	}

	public void empilhar(Object item) {
		itens.add(item);
	}

	public Object desemplihar(Object item) {
		return itens.remove(item);
	}

	public Object tamanhoPilha() {
		return itens.size();
	}

	public boolean isEmpty() {
		if (itens == 0) {
			return true;
		} else {
			return false;
		}
	}
}
