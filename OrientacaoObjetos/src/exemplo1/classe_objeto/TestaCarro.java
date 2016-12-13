package exemplo1.classe_objeto;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		fusca.velocidade = 0;
		fusca.potencia = 15;
		fusca.nome = "Corsa";
		
		Carro gol = new Carro();
		gol.velocidade = 0;
		gol.potencia = 30;
		gol.nome = "gol";
			
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		
		
		//fusca.frear();
		fusca.imprimir();
		
		//gol.imprimir();
				
		

	}

}
