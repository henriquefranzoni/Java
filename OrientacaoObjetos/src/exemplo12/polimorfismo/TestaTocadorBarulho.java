package exemplo12.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class TestaTocadorBarulho {

	public static void main(String[] args) {

		TocadorDeBarulho t = new TocadorDeBarulho();
		
		List<Barulhento> lista = new ArrayList<>();
		
		lista.add(new Carro());
		lista.add(new Carro());
		lista.add(new Gato());
		lista.add(new Carro());
		lista.add(new Gato());
		lista.add(new Carro());
		lista.add(new ArCondicionado());
		
		for(Barulhento b : lista){
			t.play(b);
		}

	}

}
