package fundamentos;

import java.util.Scanner;

public class FahrenheitParaCelsius {
	
		
		public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);

			System.out.print("Informe a temperatura em Fahrenheit: ");
			double fahrenheit = entrada.nextDouble();

			double C = (fahrenheit - 32) / 1.8;

			System.out.println(C + " Celsius");

			entrada.close();

	}

}
