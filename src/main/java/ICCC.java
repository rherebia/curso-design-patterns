
public class ICCC extends Imposto {

	public ICCC() {
		
	}
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07;
		} else if (orcamento.getValor() > 3000) {
			return orcamento.getValor() * 0.08 + 30;
		}
		
		return 0;
	}

}
