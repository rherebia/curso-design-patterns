import java.util.Calendar;

public class Conta {

	private String titular;
	private String agencia;
	protected double saldo;
	private Calendar dataAbertura;
	
	protected EstadoDeUmaConta estadoAtual;
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		estadoAtual = new ContaPositiva();
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	
	public void sacar(double valor) {
		estadoAtual.sacar(this, valor);
	}
	
	public void depositar(double valor) {
		estadoAtual.depositar(this, valor);
	}
}
