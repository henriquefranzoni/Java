package fixacao_01;

import java.util.Scanner;

//entrada = receba o preço de custo de um produto 
//said = Mostre o valor de venda
//processamento = Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.

public class Exercicio14 {

	public static void main(String[] args) {

		double PrecoProduto;
		double PorcentagemCusto;
		
		Scanner Leitor = new Scanner(System.in);

		System.out.println("Entre com o valor do custo do produto:");

		PrecoProduto = Leitor.nextDouble();

		System.out.println("Informe a porcentagem que desejada:");

		PorcentagemCusto = Leitor.nextDouble();

		double acrescimo = (PrecoProduto * PorcentagemCusto) / 100;
		
		double ValorFinal = PrecoProduto + acrescimo;
		

		System.out.println("O valor final de Venda do Produto é : " + ValorFinal );
		
	

	}

}
