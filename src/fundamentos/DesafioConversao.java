package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro sal�rio:");
		String valor1 = entrada.next().replace(",",".");
				
		
		System.out.print("Informe o segundo sal�rio:");
		String valor2 = entrada.next().replace(",",".");
		
		System.out.print("Informe o terceiro sal�rio:");
		String valor3 = entrada.next().replace(",",".");
		
		
		entrada.close();
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		double soma = numero1 + numero2 + numero3;
		
		
		System.out.println("M�dia �: " + soma / 3);
		
	}

}
