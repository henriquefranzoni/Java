package Interfaces;

public class Caminhao implements Movimento {

	double velocidade = 1;
	
	@Override
	public void mover() {
		System.out.println("Caminh�o se movendo");

	}

	@Override
	public void parar() {
		System.out.println("Caminh�o parado");
		

	}

	@Override
	public double getVelocidade() {
	this.velocidade *= 10;
	System.out.println(velocidade);
		return 0;
	}

}
