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
    System.out.println("Quantidade Mínima: " + qtdMinima);
    System.out.println("Quantidade Atual: " + qtdAtual);
	}

}

/*
 * Os atributos qtdAtual e qtdMinima jamais poderão ser negativos. 
 * O método repor aumenta qtdAtual de acordo com o parâmetro qtd. #######################
 * O método darBaixa diminui qtdAtual de acordo com o parâmetro qtd. #############
 * O método mostra() retorna uma String contendo o nome do produto,sua quantidade mínima, sua quantidade atual. ##############
 * O método precisaRepor retorna true caso a quantidade atual esteja menor ou igual à quantidade mínima     e false, caso contrário.#########
 */
/*
 * a) os atributos nome (String), qtdAtual (int) e qtdMinima (int).
 * 
 * b) um construtor sem parâmetros e um outro contendo os parâmetros nome,
 * qtdAtual, e qtdMinima
 * 
 * c) os métodos com as seguintes assinaturas:
 * void mudarNome(String nome)
 * void mudarQtdMinima(int qtdMinima)
 * void repor(int qtd)
 * void darBaixa(int qtd)
 * String mostra() boolean precisaRepor()
 */