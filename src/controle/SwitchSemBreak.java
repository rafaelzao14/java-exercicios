package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "azul";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("estou h� 6 anos, posso ensinar.");
		case "marrom":
			System.out.println("Estou h� 4 anos, conhe�o v�rias t�cnicas.");
		case "roxa":
			System.out.println("Estou h� 3 anos, intermedi�rio.");
		case "azul":
			System.out.println("Estou h� 2 anos, sobrevivi ao �nicio.");
		case "branca":
			System.out.println("Sou iniciante!");
			break;
		default:
			System.out.println("N�o sei nada");
			
		}
	}

}
