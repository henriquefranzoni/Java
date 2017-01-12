package exemplo14.exception;

public class SaldoInsuficienteException extends  Exception {
	
	
	private double saldo;
	
	
	public SaldoInsuficienteException(double saldo){
		this.saldo = saldo;
	}
	
	
	
	@Override
	public String getMessage() {
		return "Saldo insuficiente!" + "\nO Saldo é de: " + saldo;
	}

}
