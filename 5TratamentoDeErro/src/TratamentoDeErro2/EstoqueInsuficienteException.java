package TratamentoDeErro2;

public class EstoqueInsuficienteException extends Exception {

	private int quantidade;

	public EstoqueInsuficienteException(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMessage() {
		return "Estoque Insuficiente!!";
	}

}
