package exemplo14.exception;

public class ContaCorrente {

	private int numero;
	private double saldo;

	public ContaCorrente(int numero) {
		this.numero = numero;
	}

	void retornaSaldo() {
		this.saldo = saldo;

	}

	void depoita(double valor) {
		saldo = saldo + valor;

	}

	// void validando apenas o saque
	void saca(double valor) throws SaldoInsuficienteException {

		if (valor <= saldo) {
			saldo = saldo - valor;
		} else {
			// throw lança a exceção
			throw new SaldoInsuficienteException(saldo);
		}
	}

	// informa apenas numero e saldo da conta
	void imprimir() {
		System.out.println(" Nº. " + numero + " Saldo: " + saldo);
	}

}
