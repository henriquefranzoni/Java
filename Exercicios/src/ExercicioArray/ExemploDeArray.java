package ExercicioArray;

import java.util.Scanner;

public class ExemploDeArray {

	// 4 - Crie um método que recebe um array de inteiros e retorna a quantidade
	// de elementos do array que são números negativos.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numAlunos = 5;
		double[] notaAlunos = new double[numAlunos];

		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("Insira a nota do " + (i + 1) + "º aluno.");
			notaAlunos[i] = entrada.nextDouble();

		}

		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("->" + notaAlunos[i]);
		}
	}

}
