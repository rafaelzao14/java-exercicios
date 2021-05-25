package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog( // String foi defindada pelo valor digitado na caixa de dialogo
				"Digite o primeiro n�mero:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero:");
		
		System.out.println(valor1 + valor2); // concatena a as duas string, n�o faz opera��o de soma
		
		double numero1 = Double.parseDouble(valor1); // transfoma os valores 1 e 2 que s�o String para tipo numerico.
		double numero2 = Double.parseDouble(valor2); // Converte String para numero, nesse caso tipo Double
		
		double soma = numero1 + numero2;
		System.out.println("Soma � " + soma);
		System.out.println("M�dia � " + soma / 2);
		
	}

}
