package MetodoComRetorno;

public class Principal {

	public static void main(String[] args) {

		Metodo testaMetodoComRetorno = new Metodo();

		int idade = testaMetodoComRetorno.calculaIdade(1993, 2016);

		System.out.println("Minha idade � : " + idade + " anos");

		int SalarioLiquido = testaMetodoComRetorno.SalarioMenosDesconto(1500, 150);

		System.out.println("Pego em m�os livre a quantidade de : " + SalarioLiquido);

		String informatempo = testaMetodoComRetorno.informatempo("Chuvoso");

		System.out.println("Hoje o per�dio da tarde est� : " + informatempo);

		int salariobruto = testaMetodoComRetorno.SomaDosValores(1300, 234, 445);

		System.out.println("O recebido no fim do m�s �: " + "R$" + salariobruto + ",00");

		int mediagol = testaMetodoComRetorno.CalculaMediaDoCarro(600, 40);

		System.out.println("A media do meu gol �: " + mediagol);

		int ValorDesconto = testaMetodoComRetorno.CalculaValorDesconto(2450, 10);

		int PrecoDoProduto = testaMetodoComRetorno.ValorDoProduto(2450);

		System.out.println("O Valor do desconto do Produto �: " + ValorDesconto + "\nE o pre�o do Produto � : " + PrecoDoProduto);

		System.out.println("O valor a ser pago � : " + (PrecoDoProduto - ValorDesconto));
		
		

	}

}
