package exercicio.funcionario;

public class TestaRegistradora {

	public static void main(String[] args) {
		
		//acessando metodos da classe funcionario
		Funcionario f = new Funcionario();
		f.setNome("Capitão Caverna");
		
		//acessando metodos da classe gerente, classe gerente tem esses metodos porq estendeu de funcionario
		Gerente g = new Gerente();
		g.setNome("Batima");
		
		Secretaria fp = new Secretaria ();
		fp.setNome("Superomi");
		
		
		RegistradoraHorarios r = new RegistradoraHorarios();
		//r.registra(f);
		//r.registra(g); // nao pode ser feito
		
		r.registra(fp);

	}

}
