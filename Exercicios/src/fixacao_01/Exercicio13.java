package fixacao_01;

import java.util.Scanner;

//Obs = est� vendendo seus produtos em 5 (cinco) presta��es sem juros. 
//entrada = Receba um valor de uma compra.
//saida = mostre o valor das presta��es.
//processamento = valor da compra divido por cinco

public class Exercicio13 {

	public static void main(String[] args) {
		
		//usa virgula para setar no valor da compra por exe: 67,90
		float ValorCompra;
		
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Entre com o valor da compra:");
		
		ValorCompra = Leitor.nextFloat();
		
		//System.out.println(ValorCompra);
		
		System.out.println("O valor das presta��es da compra �: " + (ValorCompra) / 5);
		
		
		
		

	}

}
