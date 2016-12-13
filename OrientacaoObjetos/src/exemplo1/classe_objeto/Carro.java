package exemplo1.classe_objeto;

public class Carro {

	// atributo = caracteristica
	int potencia;
	int velocidade;
	String nome;

	// metodo = acao
	public void acelerar() {
		velocidade += potencia;

	}

	public void frear() {
		velocidade = velocidade / 2;
	}

	public void imprimir() {
		System.out.println(" Nome: " + nome + " Velocidade: " + velocidade

		);
	}

}
