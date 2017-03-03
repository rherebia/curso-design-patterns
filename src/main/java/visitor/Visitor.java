package visitor;

import interpreter.Divisao;
import interpreter.Multiplicacao;
import interpreter.Numero;
import interpreter.RaizQuadrada;
import interpreter.Soma;
import interpreter.Subtracao;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubtracao(Subtracao subtracao);

	void visitaMultiplicacao(Multiplicacao multiplicacao);

	void visitaDivisao(Divisao divisao);

	void visistaNumero(Numero numero);

	void visistaRaizQuadrada(RaizQuadrada raizQuadrada);

}