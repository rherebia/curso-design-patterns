
public class RespostaCSV implements Resposta {

	private Resposta resposta;
	
	public RespostaCSV(Resposta resposta) {
		this.resposta = resposta;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
			return;
		}
		
		resposta.responde(req, conta);
	}

}
