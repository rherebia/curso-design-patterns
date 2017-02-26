
public class ICPP extends TemplateDeImpostoCondicional {
	
	public ICPP() {
		
	}
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07 + calculaDoOutroImposto(orcamento);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + calculaDoOutroImposto(orcamento);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
