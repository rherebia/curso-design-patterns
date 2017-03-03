import java.util.Calendar;

public class TesteContrato {

	public static void main(String[] args) {
		Historico historico = new Historico();
		Contrato c1 = new Contrato(Calendar.getInstance(), "Mauricio", TipoContrato.NOVO);
		
		historico.adicionar(c1.salvaEstado());
		
		c1.avanca();
		
		historico.adicionar(c1.salvaEstado());
		
		c1.avanca();
		
		historico.adicionar(c1.salvaEstado());
		
		Estado estadoAnterior = historico.pega(0);
		
		System.out.println(estadoAnterior.getContrato().getTipo());
	}

}
