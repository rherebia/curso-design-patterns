
public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		orcamento.adicionaItem(new Item("Lapis", 250.0));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}
}
