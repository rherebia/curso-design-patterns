
public class TesteFormatosResposta {

	public static void main(String[] args) {
		Resposta r4 = new SemResposta();
		Resposta r3 = new RespostaPorcento(r4);
		Resposta r2 = new RespostaCSV(r3);
		Resposta r1 = new RespostaXML(r2);
		
		Conta conta = new Conta("Renato", 1000);
		
		Requisicao req = new Requisicao(Formato.XML);
		
		r1.responde(req, conta);
	}
}
