package Fixacao_02;

import java.util.Scanner;

//Fa�a um programa que receba dois n�meros inteiros e 
//saida = gere os n�meros inteiros que est�o no intervalo entre estes dois n�meros.

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner Leitor = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Entre com um n�mero:");

		num1 = Leitor.nextInt();

		System.out.println("Entre com um n�mero:");

		num2 = Leitor.nextInt();

		int intervalo = 0;
		
		//fazer a troca de variavel
		
		for (int i = 1 + num1; i < num2; i++) {
			intervalo = i;
			System.out.print(intervalo);

		}
		
		

	}

}
