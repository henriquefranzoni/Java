package Fixacao_02;

import java.util.Scanner;

//entrada = ler cinco n�meros
//processamento = fazer as somas dos numeros digitados e tamb�m a media
//saida = informar soma e media dos numeros
//Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros.

public class Exercicio02 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		int num4;
		int num5;

		Scanner Leitor = new Scanner(System.in);

		System.out.println("Entre com o Primeiro N�mero:");
		num1 = Leitor.nextInt();
		System.out.println("Entre com o Segundo N�mero:");
		num2 = Leitor.nextInt();
		System.out.println("Entre com o Terceiro N�mero:");
		num3 = Leitor.nextInt();
		System.out.println("Entre com o Qaurto N�mero:");
		num4 = Leitor.nextInt();
		System.out.println("Entre com o Quinto N�mero:");
		num5 = Leitor.nextInt();

		int soma = num1 + num2 + num3 + num4 + num5;
		
		int media = soma / 5;
		
		System.out.println("A soma total do n�meros digitado � : " + soma);
		
		System.out.println("\nA media dos n�meros digitado � : " + media);
	}

}
