package fixacao_01;

import java.util.Scanner;

//Fa�a um programa em Java que receba um n�mero e mostre uma mensagem caso este
//n�mero seja maior que 10.

public class Exercicio04 {

	public static void main(String[] args) {

		int num1;
		
		Scanner LeiaNumero = new Scanner (System.in);
		
		System.out.println("Entre com um n�mero: ");
		
		num1 = LeiaNumero.nextInt();
		
		if(num1 > 10){
			System.out.println("O n�mero digitado � maior que 10!!");
		}
		

	}

}
