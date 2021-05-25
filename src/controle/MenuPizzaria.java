package controle;

import java.util.Scanner;

public class MenuPizzaria {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Seja bem vindo a Pizzaria");

		System.out.print("Nos conte qual sabor você gosta? ");

		String saborFavorito = entrada.next();

		if (saborFavorito.equalsIgnoreCase("portuguesa")) {
			System.out.println(saborFavorito);
			System.out.println("Temos esse sabor!!!");
			System.out.println("Qual a forma de pagamento?");

		} else if (saborFavorito.equalsIgnoreCase("quatro queijos")) {
			System.out.println(saborFavorito);
			System.out.println("Temos esse sabor!!!");
			System.out.println("Qual a forma de pagamento?");
		} else if (saborFavorito.equalsIgnoreCase("calabresa")) {
			System.out.println(saborFavorito);
			System.out.println("Temos esse sabor!!!");
			System.out.println("Qual a forma de pagamento?");
		} else if (saborFavorito.equalsIgnoreCase("peperone")) {
			System.out.println(saborFavorito);
			System.out.println("Temos esse sabor!!!");
			System.out.println("Qual a forma de pagamento?");
		} else  {
			System.out.println("Não temos esse sabor, Desculpe.");
			
			
		}



		System.out.println("Dinheiro ou Cartão: ");

		String pagamento = entrada.next();

		if (pagamento.equalsIgnoreCase("Dinheiro")) {
			System.out.println("Obrigado pela preferência, por gentileza se possível, " 
		+ "tenha o valor trocado.");
			
		} else 
			System.out.println("Obrigado pela prefêrencia.");
		
		entrada.close();
		
			{
			}

	}
}
