package fixacao_01;

import java.util.Scanner;

//Faça um programa em Java que receba dois números e exiba o resultado da sua soma.

//entrada
//declaracao de variaveis
//Processamento
//saída

public class Exercicio01 {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		
		Scanner LerNumero = new Scanner (System.in);
			
		System.out.println("Entre com o Primeiro Número:");
		
		num1 = LerNumero.nextInt();
		
		System.out.println("Entre com o Segundo Número:");
		
		num2 = LerNumero.nextInt();
		
		System.out.println("A soma dos dois Números digitado é: " + (num1 + num2));

	}

}
