package curso.java;

import java.util.Scanner;

public class ParOuImpar {

	public static void somar(int number1, int number2) {
		int somar = number1 + number2;
		System.out.println(somar);

	}

	public static void main(String[] args) {
		// Escreva um programa em Java que recebe um inteiro e diga se � par ou
		// �mpar
		// Use o operador matem�tico %  e o teste
		// condicional if.

		int number1 = 0;
		int number2 = 0;

		Scanner EntradaNumero = new Scanner(System.in);

		System.out.println("Entre com o Primeiro N�mero:");

		number1 = EntradaNumero.nextInt();

		System.out.println("Entre com o Segundo N�mero");

		number2 = EntradaNumero.nextInt();

		if (number1 % 2 == 0) {
			System.out.println("O N�mero 1 � Par!");
		} else if (number1 % 2 != 0) {
			System.out.println("O N�mero 1 � Impar!");
		}
		if (number2 % 2 == 0) {
			System.out.println("O N�mero 2 � par!");
		} else if (number2 % 2 != 0) {
			System.out.println("O N�mero 2 � Impar!");
		}
	
		System.out.println("O pr�ximo passo � realizar algumas opera��es com os n�mero digitados!");

		System.out.println("Digite o nome da opera��o matem�tica na qual ser� apresentada:");
		int tipodeoperacao = EntradaNumero.nextInt();
		
		//int somar = (number1 + number2);
		//int dividir = number1 / number2;
		//int subtrair = number1 - number2;
		//int multiplicar = number1 * number2;

		//if (tipodeoperacao ==  {System.out.println("A soma dos dois n�meros digitados s�o" + .tipodeoperacao);
		//} else if (tipodeoperacao == dividir) {
			//System.out.println("A Divis�o dos dois N�meros Digitados s�o" + dividir);
		//} else if (tipodeoperacao == subtrair) {
		//	System.out.println("A subtra��o do primeiro n�mero com o segundo � " + subtrair);
		//} else if (tipodeoperacao == multiplicar) {
			//System.out.println("A multiplica��o dos dois n�meros digitados s�o : " + multiplicar);

		}

	}


