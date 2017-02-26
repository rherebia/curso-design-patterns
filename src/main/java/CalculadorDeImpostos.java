
public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valorCobrado = imposto.calcula(orcamento);
		System.out.println(valorCobrado);
	}
}
