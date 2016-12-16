package Polimorfismo;

import Exercicio6.RegistraPonto;

public class Gerente implements RegistraPonto {

	
	public void RegistraEntrada() {
		System.out.println("Registrando apenas a Entrada!!");

	}

	
	@Override
	public void ResgistraHoraExtra() {
		System.out.println("Essas são as suas horas Extras!");

	}


	@Override
	public void RegistraSaida() {
		// TODO Auto-generated method stub
		
	}

}
