package curso.java;

import javax.swing.JOptionPane;

public class ControleDeRepeticaoComFor {

	public static void main(String[] args) {

		// entrada
		// declaracao de variaveis

		int soma = 0;
		
		for ( int i = 0; i<4; i++){
			
			String digitado = JOptionPane.showInputDialog("Entre com um numero");
			soma = soma + Integer.parseInt(digitado);
			
		}
		
		//Processamento
		
		int resultado = soma / 4;
		
		String mensagem = "";
		
		if(resultado >7){
			mensagem = "Aprovado";
		}else if (resultado <5){
			mensagem = "Reprovado";
		}else{
			mensagem = "Em exame";
		}
		
		//saída
		JOptionPane.showMessageDialog(null,mensagem);
		//System.out.println("Resultado:" + mensagem);

	}

}
