package fundamentos;

import java.util.Scanner;

public class QuadradoCubo {
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite um n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("O n�mero ao quadrado �: " + Math.pow(num1, 2));
		System.out.println("O n�mero ao cubo �: " + Math.pow(num1, 3));
		
		entrada.close();
		
		
	}

}
