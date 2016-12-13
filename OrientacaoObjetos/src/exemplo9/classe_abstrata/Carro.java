package exemplo9.classe_abstrata;

public abstract class Carro extends Veiculo {

	public Carro(String nome) {
		super(nome);
	}

	public void mover() {
		System.out.println("Carro movendo-se");
	}

	@Override
	public String getPosicao() {
		return null;
		
	}

}
