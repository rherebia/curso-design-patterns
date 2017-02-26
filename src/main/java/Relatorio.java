import java.util.Calendar;
import java.util.List;

abstract class Relatorio {
	protected abstract void cabecalho();

	protected abstract void rodape();

	protected abstract void corpo(List<Conta> contas);

	public void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}
}

class RelatorioSimples extends Relatorio {
	protected void cabecalho() {
		System.out.println("Banco XYZ");
	}

	protected void rodape() {
		System.out.println("(11) 1234-5678");
	}

	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		}
	}
}

class RelatorioComplexo extends Relatorio {
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Avenida Paulista, 1234");
		System.out.println("(11) 1234-5678");
	}

	protected void rodape() {
		System.out.println("banco@xyz.com.br");
		System.out.println(Calendar.getInstance().getTime());
	}

	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getTitular() + " - " + conta.getAgencia() + " - "
					+ conta.getSaldo());
		}
	}
}