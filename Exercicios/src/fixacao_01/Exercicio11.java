package fixacao_01;

import java.util.Scanner;

//entrada = solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o usu�rio.
//saida = apresenta��o do valor da convers�o em real (R$) de um valor lido em d�lar (US$).		
//processamento = converter o valor do dolar pro real
public class Exercicio11 {

	public static void main(String[] args) {

		double valorCotacaoDoDia;
		double dolaresDisponiveis;
		double valorEmReal;

		Scanner Leitor = new Scanner(System.in);

		System.out.println("Entre com o valor da cota��o do Dolar:");

		valorCotacaoDoDia = Leitor.nextDouble();

		System.out.println("Entre com a quantidade de dolares dispon�veis:");

		dolaresDisponiveis = Leitor.nextDouble();
		
		
		double valorConvertidoParaReal = valorCotacaoDoDia * dolaresDisponiveis;
		
		System.out.println("Voc� tem R$ " + valorConvertidoParaReal + "!!");
		

	}

}
