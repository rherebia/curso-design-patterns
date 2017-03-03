package visitor;

import interpreter.Divisao;
import interpreter.Multiplicacao;
import interpreter.Numero;
import interpreter.RaizQuadrada;
import interpreter.Soma;
import interpreter.Subtracao;

public class ImpressoraVisitor implements Visitor {

	public void visitaSoma(Soma soma) {
		System.out.print("(");
		
		soma.getEsquerda().aceita(this);
		
		System.out.print(" + ");
		
		soma.getEsquerda().aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print("(");
		
		subtracao.getEsquerda().aceita(this);
		
		System.out.print(" - ");
		
		subtracao.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaMultiplicacao(Multiplicacao multiplicacao) {
		System.out.print("(");
		
		multiplicacao.getEsquerda().aceita(this);
		
		System.out.print(" * ");
		
		multiplicacao.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaDivisao(Divisao divisao) {
		System.out.print("(");
		
		divisao.getEsquerda().aceita(this);
		
		System.out.print(" / ");
		
		divisao.getDireita().aceita(this);
		
		System.out.print(")");
	}
	
	public void visistaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}

	public void visistaRaizQuadrada(RaizQuadrada raizQuadrada) {
		System.out.print("sqrt(");
		
		raizQuadrada.getExpressao().aceita(this);
		
		System.out.print(")");
	}
}
