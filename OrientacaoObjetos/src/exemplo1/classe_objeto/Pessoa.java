package exemplo1.classe_objeto;

public class Pessoa {

	String nome;
	String sobrenome;
	String raca;
	String apelido;
	String escolaridade;
	String cordoolho;
	String formacao;
	String tamanhocamiseta;
	int idade;
	int peso;
	int largura;
	int numerocalcado;
	int numerobermuda;
	int potencia;
	int resistencia;
	int volumevoz;
	int salto;
	boolean estado;

	public void estadoAcordado() {
		estado = true;
	}

	public void estadoDormindo() {
		estado = false;
	}

	public void andar() {
		potencia = potencia + 1;

	}

	public void falarBaixo() {
		volumevoz = volumevoz + 1;
	}

	public void falarAlto() {
		volumevoz = volumevoz + 2;
	}

	public void gritar() {
		volumevoz = volumevoz + 5;
	}

	public void correr() {
		potencia = potencia + 2;
	}

	public void pularFraco() {
		salto = salto + 1;
	}

	public void pularForte() {
		salto = salto + 2;
	}

	public void imprimirAtributo() {
		System.out.println("O nome da Pessoa é: " + nome + "\n Seu sobrenome é: " + sobrenome + " \n Seu apelido é: "
				+ apelido + "\n A cor do seu olho é: " + cordoolho + "\n Sua escolaridade é: " + escolaridade
				+ "\n Sua formação é : " + formacao + "\n Ele está: " + estado + "\n Sua idade é: " + idade
				+ "\n Sua largura é: " + largura + "\n O número de sua merbuda é: " + numerobermuda
				+ "\n Com um número de calçado: " + numerocalcado + "\n Usando um tamanho de camiseta: "
				+ tamanhocamiseta + "\n Seu peso é: " + peso + "\n Com uma potência: " + potencia + "\n Sua raça é : "
				+ raca + "\n Com uma resistência : " + resistencia + "\n Com um salto de : " + salto
				+ "\n E seu volume de voz é : " + volumevoz);

	}

	public void imprimirAcoes() {
		System.out.println("\nEle está andando em um nível: " + potencia);	
	}

}
