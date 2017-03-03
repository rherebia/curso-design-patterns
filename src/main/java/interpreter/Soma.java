package interpreter;

import visitor.Visitor;

public class Soma implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	public int avalia() {
		return esquerda.avalia() + direita.avalia();
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}

	public void aceita(Visitor impressora) {
		impressora.visitaSoma(this);
	}
	
}
