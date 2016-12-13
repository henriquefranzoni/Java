package Fixacao_02;

import java.util.Scanner;

//quantidade de peça dividido por 180

public class Teste {

	public static void main(String[] args) {

		Scanner Leitor = new Scanner(System.in);

		int QtdPecas;

		System.out.println("Entre com a Quantidade de peças:");
		QtdPecas = Leitor.nextInt();

		int grau = QtdPecas / 180;

		System.out.println("O resultado do grau é: " + grau);

	}

}
