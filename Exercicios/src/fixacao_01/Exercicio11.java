package fixacao_01;

import java.util.Scanner;

//entrada = solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.
//saida = apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$).		
//processamento = converter o valor do dolar pro real
public class Exercicio11 {

	public static void main(String[] args) {

		double valorCotacaoDoDia;
		double dolaresDisponiveis;
		double valorEmReal;

		Scanner Leitor = new Scanner(System.in);

		System.out.println("Entre com o valor da cotação do Dolar:");

		valorCotacaoDoDia = Leitor.nextDouble();

		System.out.println("Entre com a quantidade de dolares disponíveis:");

		dolaresDisponiveis = Leitor.nextDouble();
		
		
		double valorConvertidoParaReal = valorCotacaoDoDia * dolaresDisponiveis;
		
		System.out.println("Você tem R$ " + valorConvertidoParaReal + "!!");
		

	}

}
