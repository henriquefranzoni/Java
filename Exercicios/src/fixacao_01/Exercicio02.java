package fixacao_01;

import java.util.Scanner;

public class Exercicio02 {

	// Ler dois valores para as vari�veis A e B, e efetuar as trocas dos valores
	// de forma que a
	// vari�vel A passe a possuir o valor da vari�vel B e a vari�vel B passe a
	// possuir o valor da
	// vari�vel A. Apresentar os valores trocados.
	// entrada
	// declaracao de variaveis
	// Processamento
	// sa�da
	// burlando System.out.println("O valor da Variavel A � " + B + "\nE o
	// valor da Variavel B � " + A );

	public static void main(String[] args) {

		int A = 0;
		int B = 0;

		Scanner InseriVar = new Scanner(System.in);

		System.out.println("Insira um N�mero para armazenar na Variavel A:");

		A = InseriVar.nextInt();

		System.out.println("Insira um N�mero para armazenar na Variavel B:");

		B = InseriVar.nextInt();

		System.out.println("Valores at� o momento : " + "\nA:" + A + "\nB:" + B);

		int b = A;
		int a = B;

		System.out.println("\nValores trocados:" + "\nA: " + a + "\nB: " + b);

	}

}
