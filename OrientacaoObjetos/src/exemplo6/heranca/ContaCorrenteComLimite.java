package exemplo6.heranca;

public class ContaCorrenteComLimite extends ContaCorrente {
	
	double limite;
	
	boolean saca(double valor){
		if(valor <= (saldo + limite)){
			saldo = saldo - valor;
			limite = limite - valor;
			return true;
		}
		return false;
	}

}
