package exemplo4.estatico;

public class Somador {
	
	static int valorEstatico;	
	int valorInstancia;
	
	public Somador(){
		valorEstatico++;
		valorInstancia++;
		
	}
	
	public void imprimir(){
		System.out.println("Estatico: " + valorEstatico + "\nInstancia:" + valorInstancia);
	}

}
