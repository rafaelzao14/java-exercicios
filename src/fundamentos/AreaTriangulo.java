package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("A área do triângulo é: " + (base * altura) / 2 + "m2");
		
		entrada.close();
		
	}
}
