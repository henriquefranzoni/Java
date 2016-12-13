package orientacaoObjetoBasico;

//exercicio1
//Escreva uma classe para representar uma lâmpada que está à venda em um supermercado

public class lampada {

	String marca;
	String cor;
	String intensidade;
	String nome;
	int tamanho;
	int potencia;
	int voltagem;
	int espessura;
	boolean ligado;

	public void ligar() {
		ligado = true;

	}

	public void desligar() {
		ligado = false;
	}

}
