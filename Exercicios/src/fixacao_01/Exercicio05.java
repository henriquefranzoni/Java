package fixacao_01;

import java.util.Scanner;

//Escrever um programa em Java que leia dois valores inteiro distintos e
// informe qual � o maior

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner Leitor = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("Entre com o primeiro n�mero: ");

		num1 = Leitor.nextInt();

		System.out.println("Entre com o segundo n�mero: ");

		num2 = Leitor.nextInt();

		if (num1 > num2) {

			System.out.println("O primeiro n�mero � maior!");

		}else{
			System.out.println("O segundo n�mero � maior!");
		}

	}

}
