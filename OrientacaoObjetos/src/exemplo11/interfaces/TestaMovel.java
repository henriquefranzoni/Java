package exemplo11.interfaces;

public class TestaMovel {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		Cavalo cavalo = new Cavalo();
		
		metodoMuitoComplicado(cavalo);
	}
	
	public static void metodoMuitoComplicado(Movel m){
		
		m.mover();
	}
	

}
