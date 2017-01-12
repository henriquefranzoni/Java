package Polimorfismo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {

		Scanner Leitor = new Scanner(System.in);

		List<String> listaFuncionario = new ArrayList<>();

		listaFuncionario.add("Marcelo");
		listaFuncionario.add("Carlos");
		listaFuncionario.add("Agnaldo");
		listaFuncionario.add("Danilo");
		listaFuncionario.add("Perocle");
		listaFuncionario.add("Anderson");
		listaFuncionario.add("Jubileu");
		listaFuncionario.add("Leticia");

		
		for (String imprimirConteudo : listaFuncionario)
			System.out.println(imprimirConteudo);

		System.out.println("Entre com o Funcionario a ser contratado:");
		listaFuncionario.add(Leitor.next());

		System.out.println("Entre com o funcionário a ser Demitido:");
		listaFuncionario.remove(Leitor.toString());

	}

}
