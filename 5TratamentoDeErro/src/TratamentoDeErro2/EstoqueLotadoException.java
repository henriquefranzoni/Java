package TratamentoDeErro2;

public class EstoqueLotadoException extends Exception {

	private int quantidade;

	public EstoqueLotadoException(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMessage() {
		return "Estoque cheio!!";
	}

}
