package exemplo8.encapsulamento;

public class ContaCorrente {

	private int numero;
	private double saldo;
	
	public ContaCorrente(int numero){
		this.numero = numero;
	}
	
	
	void retornaSaldo(){
		this.saldo = saldo;
		
	}

	void depoita(double valor) {
		saldo = saldo + valor;

	}

	boolean saca(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}

		return false;
	}

	void imprimir() {
		System.out.println(" Nº. " + numero + " Saldo: " + saldo);
	}

}
