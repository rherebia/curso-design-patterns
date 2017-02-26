
public class TestaImpostosDecorator {

	public static void main(String[] args) {
		ISS iss = new ISS();
		ImpostoMuitoAlto ima = new ImpostoMuitoAlto(iss);
		
		Orcamento orcamento = new Orcamento(500);
		
		System.out.println(ima.calcula(orcamento));
		
	}
}
