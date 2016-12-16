package exemplo11.interfaces;

public class Carro implements Movel {

	double velocidade;
	
	@Override
	public void mover() {
		System.out.println("Carro correndo");
		
	}

	@Override
	public void parar() {
		System.out.println("Carro parando");
		
	}

	@Override
	public double getVelocidade() {	
		this.velocidade *= 10;
		return 0;
	}
	
	

}
