package ExercicioArray;

import java.util.Scanner;

public class ExemploDeArray {

	// 4 - Crie um m�todo que recebe um array de inteiros e retorna a quantidade
	// de elementos do array que s�o n�meros negativos.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numAlunos = 5;
		double[] notaAlunos = new double[numAlunos];

		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("Insira a nota do " + (i + 1) + "� aluno.");
			notaAlunos[i] = entrada.nextDouble();

		}

		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("->" + notaAlunos[i]);
		}
	}

}
