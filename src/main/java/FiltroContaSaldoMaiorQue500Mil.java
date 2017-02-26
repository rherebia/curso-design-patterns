import java.util.ArrayList;
import java.util.List;

public class FiltroContaSaldoMaiorQue500Mil extends Filtro {

	public FiltroContaSaldoMaiorQue500Mil() {
		
	}
	
	public FiltroContaSaldoMaiorQue500Mil(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
        for(Conta c : contas) {
          if(c.getSaldo() > 500000) filtrada.add(c);
        }

        filtrada.addAll(continuarFiltrando(contas));
        return filtrada;
	}

}
