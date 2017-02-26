import java.util.ArrayList;
import java.util.List;

public class FiltroContaSaldoMenorQue100 extends Filtro {

	public FiltroContaSaldoMenorQue100() {
		
	}
	
	public FiltroContaSaldoMenorQue100(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
        for(Conta c : contas) {
          if(c.getSaldo() < 100) filtrada.add(c);
        }

        filtrada.addAll(continuarFiltrando(contas));
        return filtrada;
	}

}
