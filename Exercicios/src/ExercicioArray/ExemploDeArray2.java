package ExercicioArray;



public class ExemploDeArray2 {

	// 4 - Crie um método que recebe um array de inteiros e retorna a quantidade
	// de elementos do array que são números negativos.

	public static void main(String[] args) {

		int i;
		int[] x = new int[10];
		
		java.util.Arrays.fill(x,2,5,3);
		//tradução: no meu vetor x, entre a posição 2 e 5 grava o valor 3
		// ou só passa o nome do vetor e os valor que será preenchido
		
		for (i = 0; i <x.length; i++) {
			System.out.println(x[i]);
		}

	}

}