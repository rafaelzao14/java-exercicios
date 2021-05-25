package fundamentos;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();

		double F = celsius * 1.8 + 32;

		System.out.println(F + " Fahrenheit");

		entrada.close();

	}

}
