package fixacao_01;

import java.util.Scanner;

public class Exercicio02 {

	// Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores
	// de forma que a
	// variável A passe a possuir o valor da variável B e a variável B passe a
	// possuir o valor da
	// variável A. Apresentar os valores trocados.
	// entrada
	// declaracao de variaveis
	// Processamento
	// saída
	// burlando System.out.println("O valor da Variavel A é " + B + "\nE o
	// valor da Variavel B é " + A );

	public static void main(String[] args) {

		int A = 0;
		int B = 0;

		Scanner InseriVar = new Scanner(System.in);

		System.out.println("Insira um Número para armazenar na Variavel A:");

		A = InseriVar.nextInt();

		System.out.println("Insira um Número para armazenar na Variavel B:");

		B = InseriVar.nextInt();

		System.out.println("Valores até o momento : " + "\nA:" + A + "\nB:" + B);

		int b = A;
		int a = B;

		System.out.println("\nValores trocados:" + "\nA: " + a + "\nB: " + b);

	}

}
