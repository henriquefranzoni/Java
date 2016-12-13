package orientacaoObjetoBasico;

//exercicio3
//Usando o resultado do exercício anterior como base, crie uma classe
//“LivroDeLivraria” que represente os dados básicos de um livro que está à venda
//em uma livraria.

public class LivroDeLivraria {

	public static void main(String[] args) {

		Livro javaOO = new Livro();

		javaOO.nome = "Java Orientação Objetos";
		javaOO.nomeautor = "Andre Macedo";
		javaOO.nomeeditora = "Cantange";
		javaOO.referencia = "Programação de Computação";
		javaOO.titulo = "Rompendo Barreias";
		javaOO.anoedicao = 2015;
		javaOO.espessura = 2;
		javaOO.numfolhas = 234;
		javaOO.quantidadeimpresso = 5000;

	}

}
