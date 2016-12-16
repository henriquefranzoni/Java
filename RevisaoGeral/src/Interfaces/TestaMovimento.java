package Interfaces;

public class TestaMovimento {

	public static void main(String[] args) {
	
		Bicicleta monark = new Bicicleta();		
		monark.mover();
		monark.parar();
		monark.getVelocidade();
		
		
		Caminhao fordinho = new Caminhao();
		
		fordinho.mover();
		fordinho.parar();
		fordinho.getVelocidade();
		
		
		

	}

}
