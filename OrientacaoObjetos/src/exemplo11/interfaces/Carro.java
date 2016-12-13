package exemplo11.interfaces;

public class Carro implements Movel {

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
		return 0;
	}
	
	

}
