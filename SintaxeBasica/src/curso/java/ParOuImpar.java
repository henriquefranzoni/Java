package curso.java;

import java.util.Scanner;

public class ParOuImpar {

	public static void somar(int number1, int number2) {
		int somar = number1 + number2;
		System.out.println(somar);

	}

	public static void main(String[] args) {
		// Escreva um programa em Java que recebe um inteiro e diga se é par ou
		// ímpar
		// Use o operador matemático %  e o teste
		// condicional if.

		int number1 = 0;
		int number2 = 0;

		Scanner EntradaNumero = new Scanner(System.in);

		System.out.println("Entre com o Primeiro Número:");

		number1 = EntradaNumero.nextInt();

		System.out.println("Entre com o Segundo Número");

		number2 = EntradaNumero.nextInt();

		if (number1 % 2 == 0) {
			System.out.println("O Número 1 é Par!");
		} else if (number1 % 2 != 0) {
			System.out.println("O Número 1 é Impar!");
		}
		if (number2 % 2 == 0) {
			System.out.println("O Número 2 é par!");
		} else if (number2 % 2 != 0) {
			System.out.println("O Número 2 é Impar!");
		}
	
		System.out.println("O próximo passo é realizar algumas operações com os número digitados!");

		System.out.println("Digite o nome da operação matemática na qual será apresentada:");
		int tipodeoperacao = EntradaNumero.nextInt();
		
		//int somar = (number1 + number2);
		//int dividir = number1 / number2;
		//int subtrair = number1 - number2;
		//int multiplicar = number1 * number2;

		//if (tipodeoperacao ==  {System.out.println("A soma dos dois números digitados são" + .tipodeoperacao);
		//} else if (tipodeoperacao == dividir) {
			//System.out.println("A Divisão dos dois Números Digitados são" + dividir);
		//} else if (tipodeoperacao == subtrair) {
		//	System.out.println("A subtração do primeiro número com o segundo é " + subtrair);
		//} else if (tipodeoperacao == multiplicar) {
			//System.out.println("A multiplicação dos dois números digitados são : " + multiplicar);

		}

	}


