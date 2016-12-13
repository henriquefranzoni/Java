package exemplo3.colaboracao;

public class RegistradoraPontos {
	
	CalculadoraBonus calculadora;
	
	public RegistradoraPontos(){
		this.calculadora = new CalculadoraBonus();
	}

	public void registraParaCompra(Usuario u) {
		
		u.pontos = u.pontos + 5 * calculadora.bonus(u);

	}

	public void registraParaIndicacao(Usuario u) {
		u.pontos = u.pontos * calculadora.bonus(u);

	}

}