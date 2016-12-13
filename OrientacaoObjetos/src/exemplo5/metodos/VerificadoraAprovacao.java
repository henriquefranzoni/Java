package exemplo5.metodos;

public class VerificadoraAprovacao {

	public static void verifica(Aluno a) {

		if (a.media() > 7) {
			System.out.println("Aprovado");
		} else if (a.media() < 5) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Em Recupeação");
		}
	}

}
