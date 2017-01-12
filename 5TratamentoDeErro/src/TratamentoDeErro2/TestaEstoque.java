package TratamentoDeErro2;

public class TestaEstoque {

	public static void main(String[] args) {

		Estoque EstoqueProduto = new Estoque("Roupas");

		// insere produtos no estoque
		try {

			EstoqueProduto.InseriProduto(45);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		// retorna quantidade de produtos
		EstoqueProduto.RetornaQuantidadeProduto();

		// faça o que tem dentro do bloco try, se for da erro, joga por catch
		try {

			EstoqueProduto.DarBaixaNoEstoque(50);

			// momento em que o try não conseguiu realizar a operação e o catch
			// acatou e joga a mensagem
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
	}
}
