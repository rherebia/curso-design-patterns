
public class TestaImpostos {

	public static void main(String[] args) {
		ICCC iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(1000);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iccc);
	}
}
