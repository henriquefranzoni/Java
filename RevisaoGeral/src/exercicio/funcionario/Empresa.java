package exercicio.funcionario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public void contrata (Funcionario f){
		funcionarios.add(f);
		}
		
	public void demite(Funcionario f){
		funcionarios.remove(f);
	}
	
		public void imprime(){			
			for(Funcionario f : funcionarios){
				System.out.println("Nome:" + f.getNome());
				
			}
		}
		
		
	}
	
	


