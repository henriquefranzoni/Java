package orientacaoObjetoIntermediario;

//exercicio8

/* 8. Escreva uma classe UsaQuadrado cujo método main instancia os 3 objetos a seguir: q1
lado: 2 q2 lado: 4 q3 lado: 5 Observe que os 3 objetos são instâncias da classe Quadrado
criada na questão anterior. Após instanciar os 3 objetos, o método main ainda deve mostrar
a área e o perímetro dos 3 quadrados instanciados*/

public class UsaQuadrado {

	public static void main(String[] args) {

		quadrado q1 = new quadrado();
		q1.lado = 2;
		
		quadrado q2 = new quadrado();
		q2.lado = 4;
		
		quadrado q3 = new quadrado();
		q3.lado = 5;

		
		
		System.out.println("A area do q1 é: " + q1.area() + " e o perimetro é : " + q1.perimetro());
		System.out.println("A area do q2 é: " + q2.area() + " e o perimetro é : " + q2.perimetro());
		System.out.println("A area do q3 é: " + q3.area() + " e o perimetro é : " + q3.perimetro());
		
		
	}

}
