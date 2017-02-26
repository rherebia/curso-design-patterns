
public class DescontoVendaCasada implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (existe("Lapis", orcamento) && existe("Caneta", orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		
		return proximo.desconta(orcamento);
		
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}

}
