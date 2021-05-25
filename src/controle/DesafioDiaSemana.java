package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o nome do dia da semana");

		String diasemana = entrada.next();

		if (diasemana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (diasemana.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (diasemana.equalsIgnoreCase("terça")) {
			System.out.println("3");
		} else if (diasemana.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (diasemana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (diasemana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (diasemana.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		}

		// if(diasemana == "domingo") {}
		// System.out.println("1");

		entrada.close();
	}

}
