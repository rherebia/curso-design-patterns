
public class ContaPositiva implements EstadoDeUmaConta {

	public void sacar(Conta conta, double valor) {
		conta.saldo -= valor;
		
		if (conta.saldo < 0) {
			conta.estadoAtual = new ContaNegativa();
		}
	}

	public void depositar(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

}
