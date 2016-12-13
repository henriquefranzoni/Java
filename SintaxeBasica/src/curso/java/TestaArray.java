package curso.java;

public class TestaArray {

	public static void main(String[] args) {
		
		int[] idades = new int [10];
		
		idades[0] = 45;
		idades[1] = 22;
		idades[2] = 26;
		idades[3] = 27;
		idades[4] = 29;
		idades[5] = 25;
		idades[6] = 21;
		idades[7] = 20;
		idades[8] = 23;
		idades[9] = 26;
		
		//System.out.println(idades[3]);
		
		String[] nomes = new String[3];		
		nomes[0] = "Capitão Caverna";
		nomes[1] = "Batima";
		nomes[2] = "Superômi";
				
		//for simples
		for(int i=0;  i < nomes.length; i++ ){
			
			System.out.println(nomes[i]);
		}
		
		//for melhorado
		for(String n : nomes){
			System.out.println(n);
		}

	}

}
