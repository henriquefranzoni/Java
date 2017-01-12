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


		System.out.println("Entre com o 1º Funcionario a ser contratado:");
		listaFuncionario.add(Leitor.next());

		System.out.println("Entre com o 2º Funcionario a ser contratado:");
		listaFuncionario.add(Leitor.next());

		System.out.println("Entre com o 3º Funcionario a ser contratado:");
		listaFuncionario.add(Leitor.next());

		System.out.println("Entre com o 4º Funcionario a ser contratado:");
		listaFuncionario.add(Leitor.next());

		System.out.println("\nEsses são os funcionarios contratos de 2016!!");

		System.out.println("\n");
		
		for (String imprimirConteudo : listaFuncionario)
			System.out.println(imprimirConteudo);

		System.out.println("\nEntre com o funcionário a ser Demitido:");
		listaFuncionario.remove(Leitor.next());

		System.out.println("Entre com o funcionário a ser Demitido:");
		listaFuncionario.remove(Leitor.next());

		System.out.println("Mediante a crise, esses foram os funcionários que sobraram!!");

		for (String imprimirConteudo : listaFuncionario)
			System.out.println(imprimirConteudo);

	}
}
