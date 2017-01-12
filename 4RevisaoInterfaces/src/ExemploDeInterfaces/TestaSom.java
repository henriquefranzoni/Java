package ExemploDeInterfaces;

public class TestaSom {

	public static void main(String[] args) {

		Corneta seleniun = new Corneta();

		seleniun.Ligar();
		seleniun.SomBaixo();
		seleniun.SomMedio();
		seleniun.SomAlto();
		seleniun.SomMaximo();
		seleniun.Desligar();

		System.out.println("");
		
		Tuiter hinor = new Tuiter();

		hinor.Ligar();
		hinor.SomBaixo();
		hinor.SomMedio();
		hinor.SomAlto();
		hinor.SomMaximo();
		hinor.Desligar();

	}

}
