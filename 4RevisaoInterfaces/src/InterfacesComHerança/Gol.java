package InterfacesComHeran�a;

public class Gol implements Multar {

	String GolTurbo;
	String FarolGolXenon;
	String CameraDeRe;

	public void MultaVelocidade() {
		System.out.println("Est� sendo Multado por Velocidade!!");

	}

	public void MultaFarolApagado() {
		System.out.println("Est� sendo Multado por farol Apagado!!");

	}

	public void MultaEstacionarErrado() {
		System.out.println("Est� sendo Multado por Estacionar Errado!!");

	}

	void ImprimirAtributoGol() {
		System.out.println("O gol tem: " + GolTurbo + "\nCom Farol Xennon: " + FarolGolXenon + "\nCont�m Camera de r�: "
				+ CameraDeRe);

	}
	
	
}
