package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7.2;
		
		String resultadoFinal = media >= 7.0 ? 
				"aprovado." : "reprovado.";
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim." : "n�o.";
		System.out.printf("Tem desconto? %s ", resultado);
	}

}
