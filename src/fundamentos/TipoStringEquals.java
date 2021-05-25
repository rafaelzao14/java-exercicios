package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		// para comparar strings deve se usar String.equals(string))
		String s1 = new String ("2");
		System.out.println("2" == s1);
		System.out.println("2".equals (s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); // o next elimina espaços em branco e o nextline deixa igual o valor digitado
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2));
		
		
		entrada.close();
		
		
	}

}
