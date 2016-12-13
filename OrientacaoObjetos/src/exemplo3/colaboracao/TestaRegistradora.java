package exemplo3.colaboracao;

public class TestaRegistradora {

	public static void main(String[] args) {
		
		RegistradoraPontos r = new RegistradoraPontos();
		
		Usuario u = new Usuario();
		u.login = "Capitão Caverna";
		u.pontos = 0;
		u.especial = true;
		
		r.registraParaCompra(u);
		
		u.imprimir();
	}

}
