package exemplo14.exception;

public class TestaContaCorrente {

	public static void main(String[] args) {

		//crianção do objeto com parametro de numero de conta
		ContaCorrente c = new ContaCorrente(1001);
		
		
		// depositando 100 reais
		c.depoita(10);
		c.depoita(50);
		
		
		try {

		c.saca(200);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
