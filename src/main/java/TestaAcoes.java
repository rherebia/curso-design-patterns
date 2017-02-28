
public class TestaAcoes {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());
		builder.adicionaAcao(new Multiplicador(2));
		
		NotaFiscal nf = builder.paraEmpresa("Caelum").comCnpj("123")
				.comItem(new ItemDaNota("nome", 100)).comObservacoes("obs")
				.constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
