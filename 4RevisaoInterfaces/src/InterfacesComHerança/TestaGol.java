package InterfacesComHerança;

public class TestaGol {

	public static void main(String[] args) {

		Gol GolCli = new Gol();

		System.out.println("\nAtributos do Gol!!");

		GolCli.CameraDeRe = "Sem Funcionar";
		GolCli.FarolGolXenon = "Quatro Mil K";
		GolCli.GolTurbo = "Dois Kilo de Turbo";

		GolCli.MultaEstacionarErrado();
		GolCli.MultaFarolApagado();
		GolCli.MultaVelocidade();

		GolCli.ImprimirAtributoGol();

	}

}
