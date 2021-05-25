package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do Funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		// para identificar long de int você usa um L no final do numero se passar do range
		
		
		// tipos numéricos reais
		float salario = 11_445.44F; //Usa a F pra identificar float, java tende a ler o tipo e nao o valor.
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; //ou true
		
		//Tipo caractere
		char status = 'A'; // Ativo
		
		//Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		// Número de vianges
		System.out.println("Número de voos: " +  numeroDeVoos / 2);
		
		// Pontos acumulados por real de vendas
		System.out.println("pontos por venda: " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ":ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
