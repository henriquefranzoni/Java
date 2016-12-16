package Interfaces;

public class Bicicleta implements Movimento {

	double velocidade = 1;
	
	@Override
	public void mover() {
		System.out.println("Bicicleta se movendo");

	}

	@Override
	public void parar() {
		System.out.println("Bicicleta parando");

	}

	@Override
	public double getVelocidade() {
		this.velocidade *= 10;
		System.out.println(velocidade);
		return 0;
	}

}
