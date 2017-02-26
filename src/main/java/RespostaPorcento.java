
public class RespostaPorcento implements Resposta {

	private Resposta resposta;
	
	public RespostaPorcento(Resposta resposta) {
		this.resposta = resposta;
	}

	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
			return;
		}
		
		resposta.responde(req, conta);
	}

}
