package fundamentos;

public class TiposPrimitivosNumerico {
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b =  (float) 1.123458888888888888888; //CAST explicita
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // CAST explicita
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}

}
