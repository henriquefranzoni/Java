package Polimorfismo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Empresa {

	public static void main(String[] args) {

		List<String> listaFuncionario = new ArrayList<>();

		listaFuncionario.add("Marcelo");
		listaFuncionario.add("Carlos");
		listaFuncionario.add("Agnaldo");
		listaFuncionario.add("Danilo");
		listaFuncionario.add("Perocle");
		listaFuncionario.add("Anderson");
		listaFuncionario.add("Jubileu");
		listaFuncionario.add("Leticia");

		
			for (int i = 0; i < listaFuncionario.size(); i++) {
			System.out.println(listaFuncionario.get(i));
			}

				
			for (String imprimirConteudo : listaFuncionario)
			System.out.println(imprimirConteudo);
			
				 listaFuncionario.remove("Leticia");
		         System.out.println( "Estes foram os funcionário que restaram na empresa: " + Arrays.toString( listaFuncionario.toArray() ) );
								
			}
			
			
	}
			
			
			
			
			
