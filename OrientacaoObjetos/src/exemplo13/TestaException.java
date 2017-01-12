package exemplo13;

public class TestaException {

	public static void main(String[] args) {

		System.out.println("main: inicio");
		metodo1();
		System.out.println("main: fim");

	}

	static void metodo1() {
		System.out.println("metodo1 : inicio");
		//capturação da exceção
		try {
			metodo2();
		} catch (MinhaException e) {
			System.out.println("aconteceu: " + e.getMessage());
		}
		System.out.println("metodo1: fim");
	}

	static void metodo2() throws MinhaException {
		System.out.println("metodo2: inicio");
		//lançamento de exceção
		throw new MinhaException("Uma exceção");

	}

}
