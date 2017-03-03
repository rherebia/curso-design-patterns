package interpreter;

import visitor.Visitor;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;
	
	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}
	
	public Expressao getExpressao() {
		return expressao;
	}
	
	public int avalia() {
		return (int) Math.sqrt(expressao.avalia());
	}

	public void aceita(Visitor impressora) {
		impressora.visistaRaizQuadrada(this);
	}

}
