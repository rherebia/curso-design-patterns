package visitor;

import interpreter.Expressao;
import interpreter.Numero;
import interpreter.Soma;
import interpreter.Subtracao;

public class TesteVisitor {

	public static void main(String[] args) {
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda, direita);
		
		soma.aceita(new ImpressoraVisitor());
		System.out.println();
		soma.aceita(new ImpressoraPrefixadaVisitor());
	}
}
