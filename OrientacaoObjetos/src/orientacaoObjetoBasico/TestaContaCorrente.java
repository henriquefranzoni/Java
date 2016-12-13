package orientacaoObjetoBasico;

public class TestaContaCorrente {

	public static void main(String[] args) {
		
		contaCorrente santander = new contaCorrente();
		
		santander.numeroConta = 33443;
		santander.saldo = 50;
		santander.limite = 5000;
		
		//santander.contaEspecial();
		
		santander.imprimir();
		
	}

}
