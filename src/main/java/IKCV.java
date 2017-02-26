
public class IKCV extends TemplateDeImpostoCondicional {

	public IKCV() {
		
	}
	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}
	
	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) return true;
		}
		
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculaDoOutroImposto(orcamento);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaDoOutroImposto(orcamento);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}
}
