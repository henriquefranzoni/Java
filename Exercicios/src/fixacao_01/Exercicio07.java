package fixacao_01;

import java.util.Scanner;

//Escrever um programa em Java que leia o nome e as três notas obtidas por um aluno durante o semestre
//.(processamento) Calcular a sua média(aritmética),(saida) 
//saida informar o nome e sua menção aprovado(media>=7),Reprovado(media<=5)e Recuperação(media entre 5.1 a 6.9).

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner LerNota = new Scanner(System.in);

		String nome;
		int nota1;
		int nota2;
		int nota3;

		System.out.println("Informe o nome do Aluno:");

		nome = LerNota.next();

		System.out.println("Informe a primeira nota:");

		nota1 = LerNota.nextInt();

		System.out.println("Informe a segunda nota:");

		nota2 = LerNota.nextInt();

		System.out.println("Informe a terceira nota:");

		nota3 = LerNota.nextInt();

		int media = nota1 + nota2 + nota3 / 3;
		
		System.out.println("As notas totalizam em " + (nota1+nota2+nota3) +"!!");

		if (media >= 70) {

			System.out.println("\nO Aluno " + nome + " Está Aprovado!");

		} else if (media <= 50) {

			System.out.println("\nO Aluno " + nome + "Está Reprovado!");

		} else if (media >= 51 & media <= 69) {

			System.out.println("\nO Aluno " + nome + " Está em Recuperação!");
		}

	}

}
