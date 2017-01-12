package MetodoComRetorno;

public class Metodo {

	int calculaIdade(int anoNascimento, int anoAtual) {
		return anoAtual - anoNascimento;
	}

	int SalarioMenosDesconto(int salario, int desconto) {
		return salario - desconto;

	}

	String informatempo(String tempo) {
		return tempo;
	}

	int SomaDosValores(int salario, int bonificacao, int extras) {
		return (salario + bonificacao + extras);
	}

	int CalculaMediaDoCarro(int KmRodado, int QtdLitroGasolina) {
		return (KmRodado / QtdLitroGasolina);
	}

	int CalculaValorDesconto(int precoProduto, int porcentagemDesconto) {
		return 
			precoProduto * porcentagemDesconto / 100;
	}
	
	int ValorDoProduto(int valorAtual){
		return
				valorAtual;
	}
	

}
