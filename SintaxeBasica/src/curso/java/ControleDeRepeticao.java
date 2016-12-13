package curso.java;

import javax.swing.JOptionPane;

public class ControleDeRepeticao {

	// Controle de Repetição
	// Escreva um programa que solicite 4 números inteiros. Utilize o for para
	// isso. Obtenha a média destes números e informe:
	// Se a média for maior ou igual a 7: Aprovado.
	// Se a média for menor que 5: Reprovado
	// Senão: Em exame.

	public static void main(String[] args) {
		
		String media, valorditado;
		int num1, num2, num3, num4;

		valorditado = JOptionPane.showInputDialog("Entre com o 1º Numero");
		num1 = Integer.parseInt(valorditado);
				
		valorditado = JOptionPane.showInputDialog("Entre com o 2º Numero");
		num2 = Integer.parseInt(valorditado);
		
		valorditado = JOptionPane.showInputDialog("Entre com o 3º Numero");
		num3 = Integer.parseInt(valorditado);
		
		valorditado = JOptionPane.showInputDialog("Entre com o 4º Numero");
		num4 = Integer.parseInt(valorditado);

	
		int medianumero = num1 + num2 + num3 + num4;

		if (medianumero >= 70) {

			JOptionPane.showMessageDialog(null,"Aprovado");

		} else if (medianumero < 50){

			JOptionPane.showMessageDialog(null,"Reprovado");
		
		}else {
			
		JOptionPane.showMessageDialog(null,"Exame");
		
	}

}
}
