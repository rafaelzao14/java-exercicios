package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		// tudo que aparece em roxo negrito são palavras reservadas da linguagem como os tipos de dados primitivos
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Rafa".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Rafael")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		
	}

}
