package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);

		c = "Outro texto";
		System.out.println(c);
		
		double d; // var�vel foi declarada
		d = 123.65; // v�riavel foi inicializada
				System.out.println(d);
		
		// inferencia so funciona com a variav�l declarada, nao se pode iniciar
		// em outra linha de codigo
		
				var f = 12; //inteiro
				//f = 12.01; n�o se poder alterar valores inteiros para reais usando a inferencia "var"
	}

}
