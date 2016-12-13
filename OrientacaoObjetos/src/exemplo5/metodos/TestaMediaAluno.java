package exemplo5.metodos;

public class TestaMediaAluno {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.bim1 = 70;
		a.bim2 = 70;
		a.bim3 = 70;
		a.bim4 = 70;
		
		VerificadoraAprovacao.verifica(a);
	

	}

}
