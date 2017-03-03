import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();

	public Nota pega(String nome) {
		Nota nota = notas.get(nome);
		
		if (nota == null) {
			if (nome.equals("do")) {
				Do do1 = new Do();
				notas.put("do", do1);
				return do1;
			} else if (nome.equals("re")) {
				Re re = new Re();
				notas.put("re", re);
				return re;
			} else if (nome.equals("mi")) {
				Mi mi = new Mi();
				notas.put("mi", mi);
				return mi;
			} else if (nome.equals("fa")) {
				Fa fa = new Fa();
				notas.put("fa", fa);
				return fa;
			} else if (nome.equals("sol")) {
				Sol sol = new Sol();
				notas.put("sol", sol);
				return sol;
			} else if (nome.equals("la")) {
				La la = new La();
				notas.put("la", la);
				return la;
			} else if (nome.equals("si")) {
				Si si = new Si();
				notas.put("si", si);
				return si;
			} else {
				return null;
			}
		} else {
			return nota;
		}
	}
}
