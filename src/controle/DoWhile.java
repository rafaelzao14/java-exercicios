package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		// if(...) senten�a; ou bloco de codigo associado ao if {}
		// while() senten�a; ou {}
		// for(...; ...; ...) senten�a; ou {}
		
		// do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";

		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.println("Quer Sair? ");
			texto = entrada.nextLine();
					} while(!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado");
		

		entrada.close();
	}

}
