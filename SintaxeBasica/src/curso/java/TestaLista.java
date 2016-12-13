package curso.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {

	public static void main(String[] args) {
		
		//nome do objeto
		//<String> definindo que só vai entrar String
		List <String>nomes = new ArrayList();		
		nomes.add("Maria");
		nomes.add("Joana");
		nomes.add("Ana");
		nomes.add("Zileide");
		
		Collections.sort(nomes);	
		
		//imprimindo o tamanho
		System.out.println(nomes.size());
		
		//for melhorado para imprimir os nomes
		for(Object o : nomes){
			System.out.println(o);
		}

		List<Integer> ns = new ArrayList<Integer>();
		
		ns.add(44);
		ns.add(22);
		ns.add(11);
		ns.add(12);
		ns.add(24);
		ns.add(12);
		ns.add(29);
		ns.add(18);
		ns.add(16);
		ns.add(23);
		ns.add(10);
		
		Collections.sort(ns);
		//estou dizendo que n vai receber o valor de cada objeto
		for (Integer n : ns){
			System.out.println(n);
		}
			
	}

}
