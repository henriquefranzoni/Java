package fixacao_01;

import java.util.Scanner;

//entrada = receba um valor que foi depositado  
//saida = exiba o valor com rendimento após um mês
//processamento = Considere fixo o juro da poupança em 0,70% a. m.

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner Leitor = new Scanner(System.in);

		double ValorDepositado;

		System.out.println("Entre com o Valor Depositado:");

		ValorDepositado = Leitor.nextDouble();

		double rendimento = ValorDepositado * 0.70 / 100;

		System.out.println("O valor depositado é: " + ValorDepositado
				+ "\nCom o juro de poupança de: 0,70%"
				+ "\nTotalizando um rendimento de " + (rendimento)
				+ "\nRendimento e poupança no total de: " + (rendimento + ValorDepositado));

	}

}
