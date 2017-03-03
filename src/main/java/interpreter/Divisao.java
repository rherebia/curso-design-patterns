package interpreter;

import visitor.Visitor;

public class Divisao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	public Expressao getDireita() {
		return direita;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public int avalia() {
		return esquerda.avalia() / direita.avalia();
	}

	public void aceita(Visitor impressora) {
		impressora.visitaDivisao(this);
	}
}
