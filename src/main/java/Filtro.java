import java.util.ArrayList;
import java.util.List;

abstract class Filtro {
	private Filtro outroFiltro;
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro() {
		
	}
	
	public abstract List<Conta> filtra(List<Conta> contas);
	
	protected List<Conta> continuarFiltrando(List<Conta> contas) {
		return outroFiltro != null ? outroFiltro.filtra(contas) : new ArrayList<Conta>();
	}
}