
public class RaizQuadrada implements Expressao {

	private Expressao expressao;
	
	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}
	
	public int avalia() {
		return (int) Math.sqrt(expressao.avalia());
	}

}
