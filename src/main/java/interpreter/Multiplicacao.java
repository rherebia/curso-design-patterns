package interpreter;

import visitor.Visitor;

public class Multiplicacao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}
	
	public int avalia() {
		return esquerda.avalia() * direita.avalia();
	}

	public void aceita(Visitor impressora) {
		impressora.visitaMultiplicacao(this);
	}
}
