package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		// if(...) sentença; ou bloco de codigo associado ao if {}
		// while() sentença; ou {}
		// for(...; ...; ...) sentença; ou {}
		
		// do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";

		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer Sair? ");
			texto = entrada.nextLine();
					} while(!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado");
		

		entrada.close();
	}

}
