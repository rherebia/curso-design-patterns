
public abstract class Imposto {

	protected Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {
		
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	protected double calculaDoOutroImposto(Orcamento orcamento) {
		return outroImposto != null ? outroImposto.calcula(orcamento) : 0;
	}
}
