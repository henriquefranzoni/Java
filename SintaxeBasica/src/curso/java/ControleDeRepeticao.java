package curso.java;

import javax.swing.JOptionPane;

public class ControleDeRepeticao {

	// Controle de Repeti��o
	// Escreva um programa que solicite 4 n�meros inteiros. Utilize o for para
	// isso. Obtenha a m�dia destes n�meros e informe:
	// Se a m�dia for maior ou igual a 7: Aprovado.
	// Se a m�dia for menor que 5: Reprovado
	// Sen�o: Em exame.

	public static void main(String[] args) {
		
		String media, valorditado;
		int num1, num2, num3, num4;

		valorditado = JOptionPane.showInputDialog("Entre com o 1� Numero");
		num1 = Integer.parseInt(valorditado);
				
		valorditado = JOptionPane.showInputDialog("Entre com o 2� Numero");
		num2 = Integer.parseInt(valorditado);
		
		valorditado = JOptionPane.showInputDialog("Entre com o 3� Numero");
		num3 = Integer.parseInt(valorditado);
		
		valorditado = JOptionPane.showInputDialog("Entre com o 4� Numero");
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
