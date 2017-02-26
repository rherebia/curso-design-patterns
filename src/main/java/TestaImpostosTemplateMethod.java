
public class TestaImpostosTemplateMethod {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(1000);
		orcamento.adicionaItem(new Item("Caneta", 120));
		
		ICPP icpp = new ICPP();
		IKCV ikcv = new IKCV();
		
		System.out.println("Desconto ICPP " + icpp.calcula(orcamento));
		System.out.println("Desconto IKCV " + ikcv.calcula(orcamento));
	}
}
