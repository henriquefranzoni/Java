package fixacao_01;

import java.util.Scanner;

public class Exercicio08 {

	// Escrever um programa em Java para determinar o (saida) consumo m�dio de
	// um autom�vel sendo
	// (entrada) fornecida a dist�ncia total percorrida pelo autom�vel e o total
	// de (entrada) combust�vel gasto.

	public static void main(String[] args) {

		Scanner Armazena = new Scanner(System.in);

		// declara variaveis

		int distanciaPercorrida;
		int totalCombustivel;

		// entrada de dados
		System.out.println("Entre com a Dist�ncia Percorrida:");

		distanciaPercorrida = Armazena.nextInt();

		System.out.println("Entre com a total de Comb�stivel gasto em Listros:");

		totalCombustivel = Armazena.nextInt();

		// processamento

		int media = distanciaPercorrida / totalCombustivel;

		// saida
		System.out.println("O consumo m�dio do Veiculo �: " + media);

	}

}
