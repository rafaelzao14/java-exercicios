package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print(" dia!\n\n");

		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Sal�rio: %.1f%n", 12345.6789);
		System.out.printf("Nome: %s%n", "Jo�o");

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite seu sal�rio:  ");
		Double salario = entrada.nextDouble();

		System.out.printf("%s %s tem %d anos. e recebe %2f %n", nome, sobrenome, idade, salario);

		entrada.close();
		
		//Especificador	Formato
		//%s	String de caracteres
		//%d	N�mero inteiro decimal
		//%u	N�mero inteiro decimal sem sinal
		//%o	N�mero inteiro octal sem sinal
		//%x, %X	N�mero inteiro hexadecimal sem sinal, min�sculo ou mai�sculo
		//%f	Float
		//%2f	Double
		//%e, %E	N�mero real, em nota��o cient�fica, min�sculo ou mai�sculo
		//%b	Boolean
		//%c	Caractere (char)
	}

}
