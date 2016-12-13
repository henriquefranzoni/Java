package exemplo2.construtores;

public class Compra {

	int valor = 4;
	int parcelas;

	// construtor padrão
	public Compra() {

	}

	public Compra(int valor) {
		this.valor = valor;
		parcelas = 1;

	}

	public Compra(int valor, int parcelas) {
		this.valor = valor;
		this.parcelas = parcelas;

	}

	public void imprimir() {
		System.out.println("Valor: " + valor + "\nParcelas: " + parcelas);
	}

}
