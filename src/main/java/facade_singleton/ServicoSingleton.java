package facade_singleton;

public class ServicoSingleton {

	private static Servico servico;
	
	public static Servico getServico() {
		if (servico == null) {
			servico = new Servico();
		}
		
		return servico;
	}
}
