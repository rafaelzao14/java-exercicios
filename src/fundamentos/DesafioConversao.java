package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário:");
		String valor1 = entrada.next().replace(",",".");
				
		
		System.out.print("Informe o segundo salário:");
		String valor2 = entrada.next().replace(",",".");
		
		System.out.print("Informe o terceiro salário:");
		String valor3 = entrada.next().replace(",",".");
		
		
		entrada.close();
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		double soma = numero1 + numero2 + numero3;
		
		
		System.out.println("Média é: " + soma / 3);
		
	}

}
