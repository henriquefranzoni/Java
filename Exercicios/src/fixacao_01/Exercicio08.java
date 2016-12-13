package fixacao_01;

import java.util.Scanner;

public class Exercicio08 {

	// Escrever um programa em Java para determinar o (saida) consumo médio de
	// um automóvel sendo
	// (entrada) fornecida a distância total percorrida pelo automóvel e o total
	// de (entrada) combustível gasto.

	public static void main(String[] args) {

		Scanner Armazena = new Scanner(System.in);

		// declara variaveis

		int distanciaPercorrida;
		int totalCombustivel;

		// entrada de dados
		System.out.println("Entre com a Distância Percorrida:");

		distanciaPercorrida = Armazena.nextInt();

		System.out.println("Entre com a total de Combústivel gasto em Listros:");

		totalCombustivel = Armazena.nextInt();

		// processamento

		int media = distanciaPercorrida / totalCombustivel;

		// saida
		System.out.println("O consumo médio do Veiculo é: " + media);

	}

}
