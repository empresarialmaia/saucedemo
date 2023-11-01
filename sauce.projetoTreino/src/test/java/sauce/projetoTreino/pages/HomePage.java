package sauce.projetoTreino.pages;

import sauce.projetoTreino.elemento.Elementos;
import sauce.projetoTreino.metodos.Metodos;

public class HomePage {

	Metodos metodo = new Metodos();

	public void username(String dados) {
		metodo.escrever(Elementos.username, dados);

	}

	public void password(String dados) {
		metodo.escrever(Elementos.password, dados);
	}

	public void clicarBtLogin() {
		metodo.clicar(Elementos.btLogin);
	}
}
