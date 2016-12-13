package exercicios.heranca;

import exemplo6.heranca.ContaCorrente;

public class TestaFuncionarios {

	public static void main(String[] args) {
		
		
		Funcionario f = new Gerente();
		f.nome = "Batman";
		f.Cpf = "123456789";
		f.salario = 1200;
		
		Gerente g = new Gerente();
		g.nome = "Homem de Ferro";
		g.Cpf = "010101010101";
		g.salario = 250000;
		
				
		//Gerente g2 = new Funcionario();
		
		Funcionario f2 = new Gerente();
		//criando um objeto mais especifico.
		
		}
		
		
	}


//Crie uma classe TestaFuncionarios com o método main. Crie um objeto do tipo Funcionario e crie outro objeto do tipo Gerente.

//Na classe TestaFuncionarios tente criar um objeto Funcionario e atribuir a uma variável do tipo Gerente.
//O que acontece? E se você fazer o inverso?