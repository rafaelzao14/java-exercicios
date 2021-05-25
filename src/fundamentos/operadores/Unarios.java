package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		// pós fixada, mais usada
		a++; // a = a +1
		a--; // a = a - 1

		// pré fixada
		++b; // b = b +1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // quando os operador sao pre fixada a tem prioridade na ordem
		// de precedencia, ou seja primeiro é feito a operação, ai vai comparar com a outra variavel
		// nesse caso a variavel b foi comparada antes de fazer a operação por ter o operador depois;
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}

}
