package exemplo1.classe_objeto;

import exemplo2.construtores.Compra;

public class TestaLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro (30);
		
		livro.titulo = "Use a Cabeça";
		livro.subtitulo = "Java";
		livro.agradecimentos = "Agradecimentos..";
		livro.aberto = true;
		
		livro.proximaPagina();
		
		livro.abreLivro();
		livro.fechaLivro();
		livro.imprimir1();
		
		//imprimi valor do construtor
		
	
		
		
	}

}
