
package fixacao_01;

import java.util.Scanner;

//entrada = leia o nome de um vendedor/seu sal�rio fixo/total de vendas efetuadas por ele no m�s.
//processamento = Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas
//said = informar o seu nome, o sal�rio fixo e sal�rio no final do mes

public class Exercicio09 {

	public static void main(String[] args) {

		String nome;
		double salarioFixo;
		double totalDeVendasPorEle;

		Scanner Leitor = new Scanner(System.in);

		System.out.println("Entre com o nome do vendedor:");

		nome = Leitor.nextLine();

		System.out.println("Entre com o valor do sal�rio fixo do vendedor:");

		salarioFixo = Leitor.nextDouble();

		System.out.println("Entre com o valor de vendas efetuadas pelo vendedor:");

		totalDeVendasPorEle = Leitor.nextDouble();

		double comissao = totalDeVendasPorEle * 15 / 100;

		System.out.println("O vendedor " + nome + ", ter� o seu sal�rio de " + salarioFixo + ", mais a comiss�o de "
				+ comissao + ", totalizando em: " + (salarioFixo + comissao));
		
		
		
		
	}

}
