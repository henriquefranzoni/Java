package exemplo1.classe_objeto;

public class Livro {

	String apresentacao;
	String nomeautor;
	String titulo;
	String subtitulo;
	String legenda;
	String agradecimentos;
	String sumario;
	String conclusao;
	int numpaginas;
	int anoedicao;
	int anopublicacao;
	int valordolivro;
	int pagina;
	boolean aberto;
	
	public Livro(){
		
	}
	
	public Livro(int valordolivro){
		this.valordolivro = valordolivro;
	}

	public void proximaPagina() {

		pagina++;
	}

	public void voltaPagina() {
		pagina--;
	}

	public void abreLivro() {
		aberto = true;
	}

	public void fechaLivro() {
		aberto = false;
	}

	public void imprimir1() {
		System.out.println(" Titulo: " + titulo + "\n Pagina: " + pagina + "\n Aberto?: " + aberto + "\nValor: " + valordolivro);

	}
	
}
