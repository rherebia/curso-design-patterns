
public class Finalizado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Oraçmentos finalizados não recebem desconto extra!");
	}

	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado");
	}

	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado");		
	}

	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado");		
	}

}
