package Fixacao_02;

import java.util.Scanner;

//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele quer ver a tabuada
//A saída deve ser como mostrado abaixo:
//5 x 1 = 5
//5 x 2 = 10
//....
//5 x 10 = 50

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner Leitor = new Scanner(System.in);
		int NumDesejado;

		System.out.println("Informe o número desejado para a referente tabuda: ");

		NumDesejado = Leitor.nextInt();

		if (NumDesejado == 1) {
			System.out.println("Tabuada do 1 :" + "\n 1 x 1 = 1" + "\n 1 x 2 = 2" + "\n 1 x 3 = 3" + "\n 1 x 4 = 4"
					+ "\n 1 x 5 = 5" + "\n 1 x 6 = 6" + "\n 1 x 7 = 7" + "\n 1 x 8 = 8" + "\n 1 x 9 = 9"
					+ "\n 1 x 10 = 10");

		} else if (NumDesejado == 2) {
			System.out.println("Tabuada do 2 :" + "\n 2 x 1 = 2" + "\n 2 x 2 = 4" + "\n 2 x 3 = 6" + "\n 2 x 4 = 8"
					+ "\n 2 x 5 = 10" + "\n 2 x 6 = 12" + "\n 2 x 7 = 14" + "\n 2 x 8 = 16" + "\n 2 x 9 = 18"
					+ "\n 2 x 10 = 20");
		} else if (NumDesejado == 3) {
			System.out.println("Tabuada do 3 :" + "\n 3 x 1 = 3" + "\n 3 x 2 = 6" + "\n 3 x 3 = 9" + "\n 3 x 4 = 12"
					+ "\n 3 x 5 = 15" + "\n 3 x 6 = 18" + "\n 3 x 7 = 21" + "\n 3 x 8 = 24" + "\n 3 x 9 = 27"
					+ "\n 3 x 10 = 30");
		} else if (NumDesejado == 4) {
			System.out.println("Tabuada do 4 :" + "\n 4 x 1 = 4" + "\n 4 x 2 = 8" + "\n 4 x 3 = 12" + "\n 4 x 4 = 16"
					+ "\n 4 x 5 = 20" + "\n 4 x 6 = 24" + "\n 4 x 7 = 28" + "\n 4 x 8 = 32" + "\n 4 x 9 = 36"
					+ "\n 4 x 10 = 40");

		} else if (NumDesejado == 5) {
			System.out.println("Tabuada do 5 :" + "\n 5 x 1 = 5" + "\n 5 x 2 = 10" + "\n 5 x 3 = 15" + "\n 5 x 4 = 20"
					+ "\n 5 x 5 = 25" + "\n 5 x 6 = 30" + "\n 5 x 7 = 35" + "\n 5 x 8 = 40" + "\n 5 x 9 = 45"
					+ "\n 5 x 10 = 50");

		} else if (NumDesejado == 6) {
			System.out.println("Tabuada do 6 :" + "\n 6 x 1 = 6" + "\n 6 x 2 = 12" + "\n 6 x 3 = 18" + "\n 6 x 4 = 24"
					+ "\n 6 x 5 = 30" + "\n 6 x 6 = 36" + "\n 6 x 7 = 42" + "\n 6 x 8 = 48" + "\n 6 x 9 = 54"
					+ "\n 6 x 10 = 60");

		} else if (NumDesejado == 7) {
			System.out.println("Tabuada do 7 :" + "\n 7 x 1 = 7" + "\n 7 x 2 = 14" + "\n 7 x 3 = 21" + "\n 7 x 4 = 28"
					+ "\n 7 x 5 = 35" + "\n 7 x 6 = 42" + "\n 7 x 7 = 49" + "\n 7 x 8 = 56" + "\n 7 x 9 = 63"
					+ "\n 7 x 10 = 70");

		} else if (NumDesejado == 8) {
			System.out.println("Tabuada do 8 :" + "\n 8 x 1 = 8" + "\n 8 x 2 = 16" + "\n 8 x 3 = 24" + "\n 8 x 4 = 32"
					+ "\n 8 x 5 = 40" + "\n 8 x 6 = 48" + "\n 8 x 7 = 56" + "\n 8 x 8 = 64" + "\n 8 x 9 = 72"
					+ "\n 8 x 10 = 80");
		} else if (NumDesejado == 9) {
			System.out.println("Tabuada do 9 :" + "\n 9 x 1 = 9" + "\n 9 x 2 = 19" + "\n 9 x 3 = 27" + "\n 9 x 4 = 36"
					+ "\n 9 x 5 = 45" + "\n 9 x 6 = 54" + "\n 9 x 7 = 63" + "\n 9 x 8 = 72" + "\n 9 x 9 = 81"
					+ "\n 9 x 10 = 90");
		} else if (NumDesejado == 10) {
			System.out.println("Tabuada do 10 :" + "\n 10 x 1 = 10" + "\n 10 x 2 = 20" + "\n 10 x 3 = 30"
					+ "\n 10 x 4 = 40" + "\n 10 x 5 = 50" + "\n 10 x 6 = 60" + "\n 10 x 7 = 70" + "\n 10 x 8 = 80 "
					+ "\n 10 x 9 = 90" + "\n 10 x 10 = 100");
		}

	}

}
