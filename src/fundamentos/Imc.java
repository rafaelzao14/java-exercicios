package fundamentos;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu peso: ");
		double P = entrada.nextDouble();

		System.out.print("Digite a sua altura: ");
		double A = entrada.nextDouble();

		double imc = P / (A * A);

		String resultadoFinal = imc <= 25? "Peso Normal" : "Sobrepeso";

		System.out.println("Seu IMC é: " + imc);
		System.out.println(resultadoFinal);

		entrada.close();

	}

}
