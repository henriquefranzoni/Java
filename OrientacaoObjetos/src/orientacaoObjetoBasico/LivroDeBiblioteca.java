package orientacaoObjetoBasico;

//4 Usando o resultado do modelo “Livro” como base, crie uma classe
//“LivroDeBiblioteca” que represente os dados básicos de um livro de uma biblioteca,
//que pode ser emprestado a leitores

public class LivroDeBiblioteca {

	String nome;
	String titulo;
	String autor;
	String setor;
	String corredor;
	String sala;

	int quantidadeDeDiasQueFicaEmprestado;
	int numfolhas;
	int anoedicao;

	boolean statusDisponivel;
	boolean emprestado;

	public void disponivel() {
		statusDisponivel = true;
	}

	public void indisponivel() {
		statusDisponivel = false;
	}

	public void naoLiberadoEmprestimo() {
		emprestado = true;
	}

	public void liberadoEmprestimo() {
		emprestado = false;
	}

}
