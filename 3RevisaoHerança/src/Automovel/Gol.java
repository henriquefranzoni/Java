package Automovel;

public class Gol extends Basico {

	String cor;
	String QuantidadeDeLugar;
	String PneuPerfilAlto;

	void imprimir() {
		System.out.println("Este é o Gol Básico!!" + "\n\nCom sua Cor: " + cor + "\nCom uma Quantidade de Lugar: "
				+ QuantidadeDeLugar + "\nCom Perfil de Pneu: " + PneuPerfilAlto + "\nCom a qualidade de Bancos: "
				+ BancosNormais + "\nVidrosManuais: " + VidrosManuais + "\nArCondicionado: " + SemArCondicionado
				+ "\nRodas De Ferro: " + RodasDeFerro + "\nQuantidade De Portas:" + DuasPortas);
	}

}
