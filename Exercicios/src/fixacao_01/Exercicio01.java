package fixacao_01;

import java.util.Scanner;

//Fa�a um programa em Java que receba dois n�meros e exiba o resultado da sua soma.

//entrada
//declaracao de variaveis
//Processamento
//sa�da

public class Exercicio01 {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		
		Scanner LerNumero = new Scanner (System.in);
			
		System.out.println("Entre com o Primeiro N�mero:");
		
		num1 = LerNumero.nextInt();
		
		System.out.println("Entre com o Segundo N�mero:");
		
		num2 = LerNumero.nextInt();
		
		System.out.println("A soma dos dois N�meros digitado �: " + (num1 + num2));

	}

}
