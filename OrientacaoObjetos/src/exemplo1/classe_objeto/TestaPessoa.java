package exemplo1.classe_objeto;

public class TestaPessoa {

	public static void main(String[] args) {

		Pessoa serhumano = new Pessoa();

		serhumano.nome = "Henrique";
		serhumano.sobrenome = "Franzoni";
		serhumano.apelido = "Gordo";
		serhumano.cordoolho = "Verde";
		serhumano.escolaridade = "Ensino Superior";
		serhumano.formacao = "Ciência da Computação";
		serhumano.estado = true;
		serhumano.idade = 23;
		serhumano.largura = 67;
		serhumano.numerobermuda = 44;
		serhumano.numerocalcado = 43;
		serhumano.tamanhocamiseta = "G";
		serhumano.peso = 88;
		serhumano.potencia = 0;
		serhumano.raca = "Branco";
		serhumano.resistencia = 0;
		serhumano.salto = 0;
		serhumano.volumevoz = 0;
		
		
		serhumano.andar();
		serhumano.andar();
		serhumano.andar();
		serhumano.andar();
		
		serhumano.correr();
		serhumano.correr();
		serhumano.correr();
		serhumano.correr();
		
		serhumano.falarAlto();
		serhumano.falarAlto();
		serhumano.falarAlto();
		serhumano.falarAlto();
		serhumano.falarAlto();
		
		serhumano.gritar();
		serhumano.gritar();
		serhumano.gritar();
		serhumano.gritar();
		
		serhumano.pularForte();
		serhumano.pularForte();
		serhumano.pularForte();
		serhumano.pularForte();
		serhumano.pularForte();
		serhumano.pularForte();		
		
		serhumano.imprimirAtributo();
		serhumano.imprimirAcoes();
		
	}

}
