package TratamentoDeErro;

public class SaldoInsuficienteException extends Exception {

	private double saldo;

	public SaldoInsuficienteException(double saldo) {
		this.saldo = saldo;
	}

	public String getMessage() {
		return "Saldo de Poupança Insuficiente!" + "\nSeu saldo é :" + saldo;
	}

}
