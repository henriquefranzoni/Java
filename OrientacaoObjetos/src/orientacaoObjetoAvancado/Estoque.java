package orientacaoObjetoAvancado;

public class Estoque {

	String nome;
	int qtdAtual;
	int qtdMinima;

	public Estoque() {

	}

	public Estoque (String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
		
	}

	void mudarNome(String nome) {
		this.nome = nome;
	}

	void mudarQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;

	}

	void repor(int qtd) {
	qtdAtual = qtdAtual + qtd;

	}

	void darBaixa(int qtd) {
		  qtdAtual = qtdAtual - qtd;

	}

	boolean precisaRepor() {
		if(qtdAtual <= qtdMinima)
			return true;
			else
				return false;

	}

	void mostra() {
    System.out.println("Nome do Produto:" + nome);
    System.out.println("Quantidade M�nima: " + qtdMinima);
    System.out.println("Quantidade Atual: " + qtdAtual);
	}

}

/*
 * Os atributos qtdAtual e qtdMinima jamais poder�o ser negativos. 
 * O m�todo repor aumenta qtdAtual de acordo com o par�metro qtd. #######################
 * O m�todo darBaixa diminui qtdAtual de acordo com o par�metro qtd. #############
 * O m�todo mostra() retorna uma String contendo o nome do produto,sua quantidade m�nima, sua quantidade atual. ##############
 * O m�todo precisaRepor retorna true caso a quantidade atual esteja menor ou igual � quantidade m�nima     e false, caso contr�rio.#########
 */
/*
 * a) os atributos nome (String), qtdAtual (int) e qtdMinima (int).
 * 
 * b) um construtor sem par�metros e um outro contendo os par�metros nome,
 * qtdAtual, e qtdMinima
 * 
 * c) os m�todos com as seguintes assinaturas:
 * void mudarNome(String nome)
 * void mudarQtdMinima(int qtdMinima)
 * void repor(int qtd)
 * void darBaixa(int qtd)
 * String mostra() boolean precisaRepor()
 */