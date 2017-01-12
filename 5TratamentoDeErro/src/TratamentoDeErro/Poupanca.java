package TratamentoDeErro;

public class Poupanca {

	private int NumeroConta;
	private double saldo;

	//criei construtor com parametro
	public Poupanca(int NumeroConta) {
		this.NumeroConta = NumeroConta;
	}

	void RetornaSaldoDaPoupanca() {
		this.saldo = saldo;
	}

	void deposita(double valor) {
		saldo = saldo + valor;
	}

	void tranferencia(double valor) throws SaldoInsuficienteException {

		if (valor <= saldo) {
			saldo = saldo - valor;
		} else {
			throw new SaldoInsuficienteException(saldo);

		}

	}

}
