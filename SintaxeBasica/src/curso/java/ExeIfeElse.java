package curso.java;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExeIfeElse {
	
	public static void main(String[] args) {
		
		//Fa�a um programa que receba tr�s inteiros
		//Diga qual deles � o maior e qual o menor.
		//Consegue criar mais de uma solu��o?

				
	    int num1 = 0;
	    int num2 = 0;
	    int num3 = 0;
	    	    
	    Scanner EntradaNumero = new Scanner (System.in);
	    
	    System.out.println("Entre com o Primeiro N�mero:");
	    num1 = EntradaNumero.nextInt();
	    System.out.println("Entre com o Segundo N�mero:");
	    num2 = EntradaNumero.nextInt();
	    System.out.println("Entre com o Terceiro N�mero:");
	    num3 = EntradaNumero.nextInt();
	    
		if(num1 > num2 && num1 > num3){
			System.out.println("Primeiro N�mero � maior!");
					
		}else if(num2 > num1 && num2 > num3){
			System.out.println("Segundo N�mero � maior!");
		}else if (num3 > num2 && num3 > num1){
			System.out.println("Terceiro N�meor � maior!");
		}
	}

}
