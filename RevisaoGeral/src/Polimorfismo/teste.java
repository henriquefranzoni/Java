package Polimorfismo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Scanner Leitor = new Scanner(System.in);

		List<String> listaFuncionario = new ArrayList<>();


		System.out.println("Entre com o 1� Funcionario a ser contratado:");
		listaFuncionario.add(Leitor.next());

		System.out.println("Entre com o 2� Funcionario a ser contratado:");
		listaFuncionario.add(Leitor.next());

		System.out.println("Entre com o 3� Funcionario a ser contratado:");
		listaFuncionario.add(Leitor.next());

		System.out.println("Entre com o 4� Funcionario a ser contratado:");
		listaFuncionario.add(Leitor.next());

		System.out.println("\nEsses s�o os funcionarios contratos de 2016!!");

		System.out.println("\n");
		
		for (String imprimirConteudo : listaFuncionario)
			System.out.println(imprimirConteudo);

		System.out.println("\nEntre com o funcion�rio a ser Demitido:");
		listaFuncionario.remove(Leitor.next());

		System.out.println("Entre com o funcion�rio a ser Demitido:");
		listaFuncionario.remove(Leitor.next());

		System.out.println("Mediante a crise, esses foram os funcion�rios que sobraram!!");

		for (String imprimirConteudo : listaFuncionario)
			System.out.println(imprimirConteudo);

	}
}
