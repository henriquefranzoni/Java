package exemplo9.classe_abstrata;

public abstract class Veiculo {

	private String nome;

	public Veiculo(String nome) {
		this.nome = nome;
	}

	public abstract void mover();
	// void nao retorna nada
 
	public abstract String getPosicao();

}
