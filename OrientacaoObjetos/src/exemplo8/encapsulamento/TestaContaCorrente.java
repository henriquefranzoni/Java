package exemplo8.encapsulamento;

public class TestaContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente(1234);
		
		
		
		c.imprimir();
		
		boolean sacou = c.saca(100);
		
		System.out.println("Sacou:" + sacou);
		
		c.imprimir();
		
		c.retornaSaldo();
		
		//c.saldo = 200;
		
		c.depoita(200);
		
		c.retornaSaldo();
		
		sacou = c.saca(100);
		
		System.out.println("Sacou:" + sacou);
		
		c.imprimir();
		
	
		
		
		
		
	}

}
