package Fixacao_02;

import java.util.Scanner;
//entrada = ler cinco numeros
//processamento = saber qual é o maior
//saida = informar o mair
//Faça um programa que leia 5 números e informe o maior número.

public class Exercicio01 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		int num4;
		int num5;

		Scanner Leitor = new Scanner(System.in);

		System.out.println("Informe 1º Número:");

		num1 = Leitor.nextInt();

		System.out.println("Informe o 2º Número:");

		num2 = Leitor.nextInt();

		System.out.println("Informe o 3º Número:");

		num3 = Leitor.nextInt();

		System.out.println("Informe o 4º Número:");

		num4 = Leitor.nextInt();

		System.out.println("Informe o 5º Número:");

		num5 = Leitor.nextInt();

		if (num1 > num2 & num1 > 3 & num1 > num4 & num1 > num5) {
			System.out.println(" O Primeiro número é o maior!");
		} else if (num2 > num1 & num2 > num3 & num2 > num4 & num2 > num5) {
			System.out.println("O Segundo número é o maior!");
		} else if (num3 > num1 & num3 > num2 & num3 > num4 & num3 > num5) {
			System.out.println("O Terceiro número é o maior!");
		} else if (num4 > num1 & num4 > num2 & num4 > num3 & num4 > num5) {
			System.out.println("O Quarto número é o maior!");
		}else if (num5 > num1 & num5 > num2 & num5 > num3 & num5 > num4) {
			System.out.println("O Quinto número é o maior!");
		}

	}

}
