package orientacaoObjetoIntermediario;

//exercicio8

/* 8. Escreva uma classe UsaQuadrado cujo m�todo main instancia os 3 objetos a seguir: q1
lado: 2 q2 lado: 4 q3 lado: 5 Observe que os 3 objetos s�o inst�ncias da classe Quadrado
criada na quest�o anterior. Ap�s instanciar os 3 objetos, o m�todo main ainda deve mostrar
a �rea e o per�metro dos 3 quadrados instanciados*/

public class UsaQuadrado {

	public static void main(String[] args) {

		quadrado q1 = new quadrado();
		q1.lado = 2;
		
		quadrado q2 = new quadrado();
		q2.lado = 4;
		
		quadrado q3 = new quadrado();
		q3.lado = 5;

		
		
		System.out.println("A area do q1 �: " + q1.area() + " e o perimetro � : " + q1.perimetro());
		System.out.println("A area do q2 �: " + q2.area() + " e o perimetro � : " + q2.perimetro());
		System.out.println("A area do q3 �: " + q3.area() + " e o perimetro � : " + q3.perimetro());
		
		
	}

}
