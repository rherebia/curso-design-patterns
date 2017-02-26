
public class RespostaXML implements Resposta {

	private Resposta resposta;
	
	public RespostaXML(Resposta resposta) {
		this.resposta = resposta;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
			return;
		}
		
		resposta.responde(req, conta);
	}

}
