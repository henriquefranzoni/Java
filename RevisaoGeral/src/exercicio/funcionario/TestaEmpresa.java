package exercicio.funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {
	
		Empresa e = new Empresa();		
		Funcionario f = new Funcionario();		
		f.setNome("Capitão Caverna");
		
		Gerente g = new Gerente();
		g.setNome("Scooby");
		
		e.contrata(f);
		e.contrata(g);
		
		e.imprime();
		
		e.demite(f);
		
		System.out.println("Depois da demissão");
		
		e.imprime();
		

	}

}
