package curso.java;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExeIfeElse {
	
	public static void main(String[] args) {
		
		//Faça um programa que receba três inteiros
		//Diga qual deles é o maior e qual o menor.
		//Consegue criar mais de uma solução?

				
	    int num1 = 0;
	    int num2 = 0;
	    int num3 = 0;
	    	    
	    Scanner EntradaNumero = new Scanner (System.in);
	    
	    System.out.println("Entre com o Primeiro Número:");
	    num1 = EntradaNumero.nextInt();
	    System.out.println("Entre com o Segundo Número:");
	    num2 = EntradaNumero.nextInt();
	    System.out.println("Entre com o Terceiro Número:");
	    num3 = EntradaNumero.nextInt();
	    
		if(num1 > num2 && num1 > num3){
			System.out.println("Primeiro Número é maior!");
					
		}else if(num2 > num1 && num2 > num3){
			System.out.println("Segundo Número é maior!");
		}else if (num3 > num2 && num3 > num1){
			System.out.println("Terceiro Númeor é maior!");
		}
	}

}
