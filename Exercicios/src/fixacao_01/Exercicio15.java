package fixacao_01;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

/*entrada = leia o custo de f�brica de um carro
processamento =
saida = informar o custo ao consumidor do carro.(valor final)
ValorCarroNovo = custo de f�brica + impostos sobre o custo de f�brica 45% + percentagem do distribuidor (28%)
Observa��o =  percentagem do distribuidor seja de 28% e os impostos 45%
O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem
do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de f�brica, e
depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do
distribuidor seja de28% e os impostos 45%. Escrever um programa em Java que leia o custo
de f�brica de um carro e informe o custo ao consumidor do mesmo.*/

public class Exercicio15 {

	public static void main(String[] args) {

		double VlrCustoFabrica;

		Scanner Leitor = new Scanner(System.in);

		System.out.println("Entre com o valor do Custo de F�brica:");

		VlrCustoFabrica = Leitor.nextDouble();

		double VlrImpostoCustoFabrica = VlrCustoFabrica * 45 / 100;

		// double RepDist = * 28 / 100;

		System.out.println("\nO valor do Imposto Sob o Custo de F�brica do Automovel � : " + VlrImpostoCustoFabrica);

		System.out.println("\nOs valores entre Custo de F�brica e Imposto sob o Custo �: "
				+ (VlrImpostoCustoFabrica + VlrCustoFabrica));

		System.out
				.println("\nO valor de Venda Final do Ve�culo �: " + (VlrImpostoCustoFabrica + VlrCustoFabrica) * 1.28);

	}

}
