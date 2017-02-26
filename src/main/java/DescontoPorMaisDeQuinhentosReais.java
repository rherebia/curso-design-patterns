
public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		
		return proximo.desconta(orcamento);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}
}
