package TratamentoDeErro2;

import TratamentoDeErro.SaldoInsuficienteException;

public class Estoque {

	private int QuantidadeProdutoNoEstoque = 40;
	private String NomeDoEstoque;

	public Estoque(String NomeDoEstoque) {
		this.NomeDoEstoque = NomeDoEstoque;
	}

	void RetornaQuantidadeProduto() {
		this.QuantidadeProdutoNoEstoque = QuantidadeProdutoNoEstoque;
	}

	void InseriProduto(int quantidade) throws EstoqueLotadoException {
		if (quantidade <= QuantidadeProdutoNoEstoque) {
			QuantidadeProdutoNoEstoque = QuantidadeProdutoNoEstoque + quantidade;
		} else {
			throw new EstoqueLotadoException(QuantidadeProdutoNoEstoque);
		}
	}

	void DarBaixaNoEstoque(int quantidade) throws EstoqueInsuficienteException {
		if (quantidade <= QuantidadeProdutoNoEstoque) {
			QuantidadeProdutoNoEstoque = QuantidadeProdutoNoEstoque - quantidade;
		} else {
			throw new EstoqueInsuficienteException(QuantidadeProdutoNoEstoque);

		}
	}

}
