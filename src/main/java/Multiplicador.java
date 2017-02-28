
public class Multiplicador implements AcaoAposGerarNota {

	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	public void executa(NotaFiscal notaFiscal) {
		System.out.println(notaFiscal.getValorBruto() * this.fator);
	}
}
