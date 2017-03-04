package command;

public class ConcluiPedido implements Comando {
	
	private Pedido pedido;

	public ConcluiPedido(Pedido pedido) {
		this.pedido = pedido;
		
	}

	public void executa() {
		System.out.println("Concluindo pedido do " + pedido.getCliente());
		pedido.finaliza();
	}

}
