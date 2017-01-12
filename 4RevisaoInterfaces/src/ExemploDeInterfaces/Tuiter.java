package ExemploDeInterfaces;

public class Tuiter implements EmitiSom {

	@Override
	public void SomAlto() {
		System.out.println("Tuiter está com Som Alto!!");

	}

	@Override
	public void SomBaixo() {
		System.out.println("Tuiter está com Som Baixo!!");

	}

	@Override
	public void SomMedio() {
		System.out.println("Tuiter está com som Medio!!");

	}

	@Override
	public void SomMaximo() {
		System.out.println("Tuiter está no som Máximo!!");

	}

	@Override
	public void Ligar() {
		System.out.println("O tuiter está Ligado!!");

	}

	@Override
	public void Desligar() {
		System.out.println("O tuiter está Desligado!!");

	}

}
