package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "azul";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("estou há 6 anos, posso ensinar.");
		case "marrom":
			System.out.println("Estou há 4 anos, conheço várias técnicas.");
		case "roxa":
			System.out.println("Estou há 3 anos, intermediário.");
		case "azul":
			System.out.println("Estou há 2 anos, sobrevivi ao ínicio.");
		case "branca":
			System.out.println("Sou iniciante!");
			break;
		default:
			System.out.println("Não sei nada");
			
		}
	}

}
