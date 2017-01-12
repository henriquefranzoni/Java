package exemplo13;

public class TestaException {

	public static void main(String[] args) {

		System.out.println("main: inicio");
		metodo1();
		System.out.println("main: fim");

	}

	static void metodo1() {
		System.out.println("metodo1 : inicio");
		//captura��o da exce��o
		try {
			metodo2();
		} catch (MinhaException e) {
			System.out.println("aconteceu: " + e.getMessage());
		}
		System.out.println("metodo1: fim");
	}

	static void metodo2() throws MinhaException {
		System.out.println("metodo2: inicio");
		//lan�amento de exce��o
		throw new MinhaException("Uma exce��o");

	}

}
