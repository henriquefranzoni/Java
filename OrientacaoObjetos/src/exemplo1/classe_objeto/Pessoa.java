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
		System.out.println("O nome da Pessoa �: " + nome + "\n Seu sobrenome �: " + sobrenome + " \n Seu apelido �: "
				+ apelido + "\n A cor do seu olho �: " + cordoolho + "\n Sua escolaridade �: " + escolaridade
				+ "\n Sua forma��o � : " + formacao + "\n Ele est�: " + estado + "\n Sua idade �: " + idade
				+ "\n Sua largura �: " + largura + "\n O n�mero de sua merbuda �: " + numerobermuda
				+ "\n Com um n�mero de cal�ado: " + numerocalcado + "\n Usando um tamanho de camiseta: "
				+ tamanhocamiseta + "\n Seu peso �: " + peso + "\n Com uma pot�ncia: " + potencia + "\n Sua ra�a � : "
				+ raca + "\n Com uma resist�ncia : " + resistencia + "\n Com um salto de : " + salto
				+ "\n E seu volume de voz � : " + volumevoz);

	}

	public void imprimirAcoes() {
		System.out.println("\nEle est� andando em um n�vel: " + potencia);	
	}

}
