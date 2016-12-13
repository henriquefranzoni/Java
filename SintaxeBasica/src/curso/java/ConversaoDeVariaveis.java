package curso.java;

public class ConversaoDeVariaveis {

	public static void main(String[] args) {
		
		//conversao de variaveis
		byte b = 127;
		int  i = 130;
		
		b = (byte)i;
		
		//System.out.println(b);
		
		String texto = "1";				
		int n1 = Integer.parseInt(texto);		
		System.out.println(n1 + n1);
		
		double d = Double.parseDouble("32.5");
		System.out.println(d);
		
		
	}
}
