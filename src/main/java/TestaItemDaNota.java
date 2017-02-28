
public class TestaItemDaNota {

	public static void main(String[] args) {

		ItemDaNota item = new ItemDaNotaBuilder().comNome("item 1")
				.comValor(100).constroi();
		
		System.out.println(item);
	}

}
