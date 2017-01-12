package MetodoComRetorno;

public class Principal {

	public static void main(String[] args) {

		Metodo testaMetodoComRetorno = new Metodo();

		int idade = testaMetodoComRetorno.calculaIdade(1993, 2016);

		System.out.println("Minha idade é : " + idade + " anos");

		int SalarioLiquido = testaMetodoComRetorno.SalarioMenosDesconto(1500, 150);

		System.out.println("Pego em mãos livre a quantidade de : " + SalarioLiquido);

		String informatempo = testaMetodoComRetorno.informatempo("Chuvoso");

		System.out.println("Hoje o perídio da tarde está : " + informatempo);

		int salariobruto = testaMetodoComRetorno.SomaDosValores(1300, 234, 445);

		System.out.println("O recebido no fim do mês é: " + "R$" + salariobruto + ",00");

		int mediagol = testaMetodoComRetorno.CalculaMediaDoCarro(600, 40);

		System.out.println("A media do meu gol é: " + mediagol);

		int ValorDesconto = testaMetodoComRetorno.CalculaValorDesconto(2450, 10);

		int PrecoDoProduto = testaMetodoComRetorno.ValorDoProduto(2450);

		System.out.println("O Valor do desconto do Produto é: " + ValorDesconto + "\nE o preço do Produto é : " + PrecoDoProduto);

		System.out.println("O valor a ser pago é : " + (PrecoDoProduto - ValorDesconto));
		
		

	}

}
