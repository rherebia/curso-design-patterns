
public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
	}
}
