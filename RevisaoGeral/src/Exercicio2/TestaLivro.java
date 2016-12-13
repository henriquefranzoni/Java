package Exercicio2;

public class TestaLivro {

	public static void main(String[] args) {
	
		//objeto criado atravez do construtor criado sem parametro, entao nao passa nada aqui
		Livro LivrinhoDeJava = new Livro();
		
		//criando objeto e passando os parametros nelo atravez do construtor criado
		//na classe livro
		Livro LivrinhoDeOO = new Livro("Use a Cabeça", "Tudo dinamico");
		
		//criando objeto atravez do construtor criado passando tres parametro.
		Livro LivrinhoDePOO = new Livro("Use mais a Cabeça","Mais dinamico","Super Aproveitoso");
		
		Livro LivraoImperdivel = new Livro();

	}

}
