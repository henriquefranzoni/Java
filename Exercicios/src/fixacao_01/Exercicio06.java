package fixacao_01;

import java.util.Scanner;

public class Exercicio06 {

	// Fa�a um programa em Java que receba um n�mero e diga se este n�mero est�
	// no intervalo
	// entre 100 e 200.

	public static void main(String[] args) {

		int num1;

		Scanner Leitor = new Scanner(System.in);

		System.out.println("Entre com um n�mero: ");

		num1 = Leitor.nextInt();

		if (num1 >= 100 & num1 <= 200) {

			System.out.println("O n�mero digitado est� no intervalo entre 100 e 200!!");

		} else {
			System.out.println("O n�mero digitado est� fora do intervalor entre 100 e 200!!");
		}

	}

}
