package orientacaoObjetoBasico;

//exercicio5

//5. Cria uma classe para representar uma conta corrente que possui um n�mero, um
//saldo, um status que informa se ela � especial ou n�o, um limite.

public class contaCorrente {

	int numeroConta;
	int saldo;
	int limite;
	boolean especial;

	public boolean contaEspecial() {

		if (this.limite >= 500) {
			this.especial = true;
		} else {
			this.especial = false;
		}

		return this.especial;

	}


	public void imprimir() {
		
		//this.contaEspecial();

		System.out.println("\nN�mero da Conta: " + numeroConta + "\nSaldo da Conta: " + saldo + "\nLimite da conta: "
				+ limite + "\nConta especial: " + especial);
	}

}
