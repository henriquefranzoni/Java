package orientacaoObjetoBasico;

//exercicio3
//Usando o resultado do exerc�cio anterior como base, crie uma classe
//�LivroDeLivraria� que represente os dados b�sicos de um livro que est� � venda
//em uma livraria.

public class LivroDeLivraria {

	public static void main(String[] args) {

		Livro javaOO = new Livro();

		javaOO.nome = "Java Orienta��o Objetos";
		javaOO.nomeautor = "Andre Macedo";
		javaOO.nomeeditora = "Cantange";
		javaOO.referencia = "Programa��o de Computa��o";
		javaOO.titulo = "Rompendo Barreias";
		javaOO.anoedicao = 2015;
		javaOO.espessura = 2;
		javaOO.numfolhas = 234;
		javaOO.quantidadeimpresso = 5000;

	}

}
