package Polimorfismo;

public class Funcionario {

	String nome;
    String cpf;
	double salario;

	public double getBonificacao() {
		return salario * 0.10;
	}	
	
	public String getInfo(String Funcionario){
		return Funcionario;
		
	}
}
