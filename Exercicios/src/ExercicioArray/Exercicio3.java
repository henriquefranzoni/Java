package ExercicioArray;

import java.util.Scanner;

public class Exercicio3 {

	// 3 - Escreva um trecho Java que leia 10 valores double do teclado e
	// armazene-os num array d.

	public static void main(String[] args) {

		double d[] = new double[10];

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i <d.length; i++) {
			System.out.println("entre com o valor double:");
			d[i] = entrada.nextDouble();
		}
		
		System.out.println("Números Armazenados" + d);

	}

}
