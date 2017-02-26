
public class ContaNegativa implements EstadoDeUmaConta {

	public void sacar(Conta conta, double valor) {
		throw new RuntimeException("Não é permitido sacar com conta negativa!");

	}

	public void depositar(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		
		if (conta.saldo > 0) {
			conta.estadoAtual = new ContaPositiva();
		}
	}

}
