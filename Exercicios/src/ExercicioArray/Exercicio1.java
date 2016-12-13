package ExercicioArray;

//1 - Para  cada  conjunto  de  valores  abaixo,  escreva  o  código  Java,  usando  laço(s),  que preencha um array com os valores:

//a - 10 9 8 7 6 5 4 3 2 1
//b - 0 1 4 9 16 25 36 49 64 81 100
//c - 1 2 3 4 5 10 20 30 40 50
//d - 3 4 7 12 19 28 39 52 67 84

public class Exercicio1 {

	public static void main(String[] args) {

		int a[] = new int[10];

		a[0] = 10;
		a[1] = 9;
		a[2] = 8;
		a[3] = 7;
		a[4] = 6;
		a[5] = 5;
		a[6] = 4;
		a[7] = 3;
		a[8] = 2;
		a[9] = 1;

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

		int b[] = new int[11];

		b[0] = 0;
		b[1] = 1;
		b[2] = 4;
		b[3] = 9;
		b[4] = 16;
		b[5] = 25;
		b[6] = 36;
		b[7] = 49;
		b[8] = 64;
		b[9] = 81;
		b[10] = 100;

		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i]);

		}

		int c[] = new int[10];

		c[0] = 1;
		c[1] = 2;
		c[2] = 3;
		c[3] = 4;
		c[4] = 5;
		c[5] = 10;
		c[6] = 20;
		c[7] = 30;
		c[8] = 40;
		c[9] = 50;

		for (int i = 0; i < c.length; i++) {

			System.out.println(c[i]);
		}

		int d[] = new int[10];

		d[0] = 3;
		d[1] = 4;
		d[2] = 7;
		d[3] = 12;
		d[4] = 19;
		d[5] = 28;
		d[6] = 39;
		d[7] = 52;
		d[8] = 67;
		d[9] = 84;

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}
}
