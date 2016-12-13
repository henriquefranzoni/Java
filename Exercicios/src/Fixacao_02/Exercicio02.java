package Fixacao_02;

import java.util.Scanner;

//entrada = ler cinco números
//processamento = fazer as somas dos numeros digitados e também a media
//saida = informar soma e media dos numeros
//Faça um programa que leia 5 números e informe a soma e a média dos números.

public class Exercicio02 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		int num4;
		int num5;

		Scanner Leitor = new Scanner(System.in);

		System.out.println("Entre com o Primeiro Número:");
		num1 = Leitor.nextInt();
		System.out.println("Entre com o Segundo Número:");
		num2 = Leitor.nextInt();
		System.out.println("Entre com o Terceiro Número:");
		num3 = Leitor.nextInt();
		System.out.println("Entre com o Qaurto Número:");
		num4 = Leitor.nextInt();
		System.out.println("Entre com o Quinto Número:");
		num5 = Leitor.nextInt();

		int soma = num1 + num2 + num3 + num4 + num5;
		
		int media = soma / 5;
		
		System.out.println("A soma total do números digitado é : " + soma);
		
		System.out.println("\nA media dos números digitado é : " + media);
	}

}
