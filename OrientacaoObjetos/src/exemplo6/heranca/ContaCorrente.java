package exemplo6.heranca;

public class ContaCorrente {

	int numero;
	double saldo;

	void depoita(double valor) {
		saldo = saldo + valor;

	}

	boolean saca(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}

		return false;
	}

	void imprimir() {
		System.out.println("Nº. " + numero + "Saldo: " + saldo);
	}

}
