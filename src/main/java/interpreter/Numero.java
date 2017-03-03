package interpreter;

import visitor.Visitor;

public class Numero implements Expressao {

	private int numero;
	
	public Numero(int numero) {
		this.numero = numero;
	}
	
	public int avalia() {
		return numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void aceita(Visitor impressora) {
		impressora.visistaNumero(this);
	}
}
