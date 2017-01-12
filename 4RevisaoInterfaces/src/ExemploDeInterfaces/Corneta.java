package ExemploDeInterfaces;

public class Corneta implements EmitiSom {

	@Override
	public void SomAlto() {
		System.out.println("Corneta com Som Alto!!");

	}

	@Override
	public void SomBaixo() {
		System.out.println("Corneta com Som Baixo!!");

	}

	@Override
	public void SomMedio() {
		System.out.println("Corneta com Som Medio!!");

	}

	@Override
	public void SomMaximo() {
		System.out.println("Corneta com Som Máximo!!");

	}

	@Override
	public void Ligar() {
		System.out.println("A corneta está Ligada!!");
		
	}

	@Override
	public void Desligar() {
		System.out.println("A corneta está Desligada!!");
		
	}

}
