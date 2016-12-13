package fixacao_01;

import java.util.Scanner;

//Faça um programa em Java que receba um número e mostre uma mensagem caso este
//número seja maior que 10.

public class Exercicio04 {

	public static void main(String[] args) {

		int num1;
		
		Scanner LeiaNumero = new Scanner (System.in);
		
		System.out.println("Entre com um número: ");
		
		num1 = LeiaNumero.nextInt();
		
		if(num1 > 10){
			System.out.println("O número digitado é maior que 10!!");
		}
		

	}

}
