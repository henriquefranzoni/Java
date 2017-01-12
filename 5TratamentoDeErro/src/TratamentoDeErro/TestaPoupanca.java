package TratamentoDeErro;

public class TestaPoupanca {

	public static void main(String[] args) {

		// criei o objeto
		Poupanca avenidaCenter = new Poupanca(1756);

		avenidaCenter.deposita(100);

		try {

			avenidaCenter.tranferencia(150);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
