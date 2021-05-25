package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trablho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		
		
		System.out.println("Comprou a Tv de 50\"? " + comprouTv50);
		System.out.println("Comprou a Tv de 32\"? " + comprouTv32);
		System.out.println("Comprou a Tv de 32\"? " + comprouSorvete);
		
		// Operador Unario
		System.out.println("CMais Saudavel? " + maisSaudavel);
		
	}

}
