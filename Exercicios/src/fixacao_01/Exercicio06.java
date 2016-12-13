package fixacao_01;

import java.util.Scanner;

public class Exercicio06 {

	// Faça um programa em Java que receba um número e diga se este número está
	// no intervalo
	// entre 100 e 200.

	public static void main(String[] args) {

		int num1;

		Scanner Leitor = new Scanner(System.in);

		System.out.println("Entre com um número: ");

		num1 = Leitor.nextInt();

		if (num1 >= 100 & num1 <= 200) {

			System.out.println("O número digitado está no intervalo entre 100 e 200!!");

		} else {
			System.out.println("O número digitado está fora do intervalor entre 100 e 200!!");
		}

	}

}
