package Fixacao_02;

//Fa�a um programa que calcule o fatorial de um n�mero informado pelo usu�rio. Ex.: 5! = 5 x 4 x 3 x 2 x 1 = 120.

//entrada: receber um numero pra calcular o fatorial
//processamento:
//saida: mostrar o valor fatorial de um numero digitado

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner Leitor = new Scanner(System.in);

		int num;
		int fatorial = 1;
		int cont = 1; // interfe em quantas vezes repetir� o processo

		do {

			System.out.println("Digite um N�mero:");
			num = Leitor.nextInt();

			for (int i = 1; i <= num; i++) {
				fatorial = fatorial * i; // 1 vezes 1, 1 vezes 2
				// processo onde trabalha com a multiplicao da variavel em cima
				// do numero digitado
			}

			System.out.println("!" + num + " = " + fatorial);

			cont++;

		} while (cont < 2);
		// aqui � definido quantas vezes o ser� apresentado a mensagem

	}
}
