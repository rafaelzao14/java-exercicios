package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {

		
		//int a = 2+3 * 4;
		//int b = (int) Math.pow(a, 3);
		
		//System.out.println(b);
		
		var eq1 = 6;
		var eq2 = 3 + 2;
		var eq3 = 3 * 2;
		
	    
		double soma = eq1 * eq2;
		double num1 = Math.pow(soma, 2);
		double resultado1 = num1 / eq3;
		
		System.out.println(resultado1);
		
		var eq4 = 1 - 5;
		var eq5 = 2 - 7;
		var eq6 = 2;
		
		double op1 = eq4 * eq5;
		double op2 = op1 / eq6;
		double num2 = Math.pow(op2, 2);
		
		System.out.println(num2);
		
		double op3 = resultado1 - num2;
		double op4 = Math.pow(op3, 3);
		
		System.out.println(op4);
		
		double op5 = Math.pow(10, 3);
		double resultado2 = op4 / op5;
		
		System.out.println("O resultado é" + resultado2);
		
		
		
	
		
		
		
	}

}
