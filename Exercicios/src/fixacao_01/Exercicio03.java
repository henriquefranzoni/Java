package fixacao_01;

import java.util.Scanner;

//entrada
// declaracao de variaveis
// Processamento
// sa�da

//Fa�a um programa em Java que receba dois n�meros
//e ao final mostre a soma,
//subtra��o,multiplica��o e a divis�o dos n�meros lidos.

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner LeiaNumero = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Digite um N�mero: ");
		num1 = LeiaNumero.nextInt();

		System.out.println("Digite um N�mero: ");
		num2 = LeiaNumero.nextInt();

		int soma = num1 + num2;
		int subtracao = num1 = num2;
		int divisao = num1 / num2;
		int multiplicacao = num1 * num2;
		
		System.out.println("A soma dos n�meros digitados s�o: " + soma);
		System.out.println("A subtracao dos n�meros digitados s�o: " + subtracao);
		System.out.println("A divisao dos n�meros digitados s�o: " + divisao);
		System.out.println("A multiplicacao dos n�meros digitados s�o: " + multiplicacao);
		
		
		

	}

}
