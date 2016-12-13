package fixacao_01;

import java.util.Scanner;
//https://www.google.com.br/#q=converter+de+celsius+para+fahrenheit
//entrada = Ler uma temperatura em graus Celsius .ok
//processamento = A fórmula de conversão é: F=(9*C+160) / 5
//saida = apresentá-la convertida em graus Fahrenheit.
//observação =  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

public class Exercicio10 {

	public static void main(String[] args) {
		
		int tempgraucelsius;
		
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Grau Celsius:");
		
		tempgraucelsius = Leitor.nextInt();
		
		int conversor = (9 * tempgraucelsius + 160) / 5;
		
		System.out.println("A temperatura " + tempgraucelsius+ "º Celsius, convertida em Fahrenheit é: Fº" + conversor );
		

	}

}
