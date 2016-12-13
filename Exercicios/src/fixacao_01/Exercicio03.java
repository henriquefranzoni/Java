package fixacao_01;

import java.util.Scanner;

//entrada
// declaracao de variaveis
// Processamento
// saída

//Faça um programa em Java que receba dois números
//e ao final mostre a soma,
//subtração,multiplicação e a divisão dos números lidos.

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner LeiaNumero = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Digite um Número: ");
		num1 = LeiaNumero.nextInt();

		System.out.println("Digite um Número: ");
		num2 = LeiaNumero.nextInt();

		int soma = num1 + num2;
		int subtracao = num1 = num2;
		int divisao = num1 / num2;
		int multiplicacao = num1 * num2;
		
		System.out.println("A soma dos números digitados são: " + soma);
		System.out.println("A subtracao dos números digitados são: " + subtracao);
		System.out.println("A divisao dos números digitados são: " + divisao);
		System.out.println("A multiplicacao dos números digitados são: " + multiplicacao);
		
		
		

	}

}
