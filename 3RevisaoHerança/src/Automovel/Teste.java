package Automovel;

public class Teste {

	public static void main(String[] args) {

		Corsa wind = new Corsa();

		wind.cor = "Amarelo";
		wind.nome = "Super max";
		wind.tetosolar = "Preto";

		Corsa hatch = new Corsa();

		hatch.cor = "Azul";
		hatch.modelo = "Basico";
		hatch.nome = "Classico";
		hatch.step = "Juntos";
		hatch.tetosolar = "Automático";

		Veiculo paraMotor = new Veiculo();

		paraMotor.cor = "Preto";
		paraMotor.modelo = "Completo";
		paraMotor.nome = "MegaPower";

	}

}
