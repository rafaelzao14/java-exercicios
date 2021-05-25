package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print(" dia!\n\n");

		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 12345.6789);
		System.out.printf("Nome: %s%n", "João");

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite seu salário:  ");
		Double salario = entrada.nextDouble();

		System.out.printf("%s %s tem %d anos. e recebe %2f %n", nome, sobrenome, idade, salario);

		entrada.close();
		
		//Especificador	Formato
		//%s	String de caracteres
		//%d	Número inteiro decimal
		//%u	Número inteiro decimal sem sinal
		//%o	Número inteiro octal sem sinal
		//%x, %X	Número inteiro hexadecimal sem sinal, minúsculo ou maiúsculo
		//%f	Float
		//%2f	Double
		//%e, %E	Número real, em notação científica, minúsculo ou maiúsculo
		//%b	Boolean
		//%c	Caractere (char)
	}

}
