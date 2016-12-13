package exemplo3.colaboracao;

public class CalculadoraBonus {

	public int bonus(Usuario u) {
		int multiplicador = 1;

		if (u.especial)
			multiplicador = 2;

		return multiplicador;
	}

}
