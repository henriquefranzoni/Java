package ExemploDeInterfaces;

public class Tuiter implements EmitiSom {

	@Override
	public void SomAlto() {
		System.out.println("Tuiter est� com Som Alto!!");

	}

	@Override
	public void SomBaixo() {
		System.out.println("Tuiter est� com Som Baixo!!");

	}

	@Override
	public void SomMedio() {
		System.out.println("Tuiter est� com som Medio!!");

	}

	@Override
	public void SomMaximo() {
		System.out.println("Tuiter est� no som M�ximo!!");

	}

	@Override
	public void Ligar() {
		System.out.println("O tuiter est� Ligado!!");

	}

	@Override
	public void Desligar() {
		System.out.println("O tuiter est� Desligado!!");

	}

}
