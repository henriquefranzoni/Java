package Fixacao_02;

import java.util.Scanner;

//Faça um programa que receba dois números inteiros e 
//saida = gere os números inteiros que estão no intervalo entre estes dois números.

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner Leitor = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Entre com um número:");

		num1 = Leitor.nextInt();

		System.out.println("Entre com um número:");

		num2 = Leitor.nextInt();

		int intervalo = 0;
		
		//fazer a troca de variavel
		
		for (int i = 1 + num1; i < num2; i++) {
			intervalo = i;
			System.out.print(intervalo);

		}
		
		

	}

}
